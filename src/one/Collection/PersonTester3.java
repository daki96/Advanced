package one.Collection;

import one.Person;
import one.PersonReader;

import java.util.List;

public class PersonTester3 {
    public void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.loadPersons();

        // Medju zadnjim dodano i veze se za PersonPrinter klasu
        PersonPrinter personPrinter = new PersonPrinter();
        //personPrinter.print(new Person());


        personList.forEach(person-> System.out.println(person)); // u letu kreiran Consumer objekat pomocu Lambde

        // Method referencing tj jos veci shortcut od lambde
        personList.forEach(System.out::println);

        // OVO JE POVEZANO SA STATICKOM METODOM ISPOD  prvi nacin
        personList.forEach(person->print(person));

        // Drugi nacin - staticka funkcija print
        System.out.println("STATIC METHOD REFERENCING");
        personList.forEach(PersonTester3::print);

        // a kada nije staticka onda ovako print 2
       personList.forEach(this::print2);

       // sada se pozivamo na metodu print iz Personprinter klase koristeci ime objekta tj personPrinter koji smo gore
        // vec napravili i na njegovu objektnu metodu print
        System.out.println("Method referencing nonstatic");
        personList.forEach(personPrinter::print);
    }
    private static void print (Person p){ //(Person p) znaci da funkcija prima kao parametar Person elemenat koji ce
        // biti sacuvan kao vrijednost u varijabli p
        System.out.println(p);
    }
    private void print2 (Person p2){
        System.out.println(p2);
    }
}
