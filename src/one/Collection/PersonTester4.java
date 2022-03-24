package one.Collection;

import one.Person;
import one.PersonReader;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

public class PersonTester4 {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.loadPersons();


        Box<String> kutijaSaStringom = new Box<>();
        // kutijaSaStringom je tipa Box ali parametrizovana sa Stringom tako da sad ovaj objekat prima String
        Box<Integer> kutijaBroj = new Box<>();

        // Ovo ispod nije tacno jer brojnaKutija ima genericki tip sa ogranicenjem Number Klase tako da nista
        // drugo ne prima osim onoga sto se veze za tu klasu Number tj String NE MOZE
        //BrojnaKutija <String> brojnaKutija = new BrojnaKutija<String>();
        // ALI OVO JE TACNO SAD ISPOD POGLEDAJ
        BrojnaKutija<Integer> brojnaKutija = new BrojnaKutija<>();
        BrojnaKutija<Float> brojnaKutija1 = new BrojnaKutija<>();
        // Primjer vezan za klasu IntegralniBroj
        BrojnaKutija<IntegralniBroj> brojnaKutija2 = new BrojnaKutija<>();


        // TRECI TIP REFERENCIRANJA POGLEDAJ
        Supplier<LinkedHashSet<Person>> listSupplier = LinkedHashSet::new;

        // OVO SAD ISPOD JE POVEZANO SA DOLE FUNKCIJOM transferElements
        tramsferElements(new ArrayList<>(), listSupplier); // Ovdje ubacujemo samo ono sto nasledjuje Collection interfejsa tj moze liste ili setovi ili nesto vezano za njih
        tramsferElements(personList, listSupplier);

        // Dodato nakon treceg tipa referenciranja
        // Ovdje vidimo kako smo iz List prebacili u Hashset uz pomoc nase metode transferElements
        HashSet<Person> personHashSet = tramsferElements(personList, HashSet::new);
        personHashSet.add(new Person("Nedima","Ziga", LocalDate.now()));
        personHashSet.forEach(System.out::println);


    }
    // transferElements (Source, Destination)
    // SOURCE
    // DESTINATION

    static <S extends Collection<Person>, D extends Collection<Person>> D tramsferElements(S source, Supplier<D> destinationCollection){
        D result = destinationCollection.get();
        for(Person p : source){
            result.add(p);
        }
        return result;
    }

}
