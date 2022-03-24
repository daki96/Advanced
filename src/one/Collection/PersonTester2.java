package one.Collection;

import one.Person;
import one.PersonReader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class PersonTester2 {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.loadPersons();
        Iterator<Person> personIterator = personList.iterator();// NAJBOLJE JE UVIJEK KORISTITI OVO
        while (personIterator.hasNext()){ // Ovako iteriramo kroz kolekcije, iterirati znaci proci kroz kolekcije
            Person person = personIterator.next(); // Ako ne pomjeramo cursor sa .next funkcijom program ostaje na nultom elementu non stop
            if (person.getName().equals("Nedim")){
                personIterator.remove();
            }
        }

//        for (Person person :personList){ // Ovaj nacin ne moze ipak al je pokusan
//            if (person.getName().equals("Nedim")) {
//                personList.remove(person);
//            }
//        }
        for(Person person : personList){ // Unutar Enhanced for petlje personIterator ne bi radio
            System.out.println(person);
        }

        //Consumer je funkcionalni interface
        // -> kaze lambda - ja cu definirati blok koda te apstraktne metode
        // NAJNAPREDNIJA FOR PETLJA PA CAK I OD ENHANCED FOR LOOP
        Consumer<Person> personConsumer = (person1)->{ // pogledaj u svesci o ovome
            System.out.println("Lambda: " + person1.getName()); // Nedim i svi ostali
            // jer accept metoda sada provodi ovaj blok koda
        };
        personConsumer.accept(new Person("Nedim","Ziga", LocalDate.of(1992,3,9)));
        personList.forEach(personConsumer); // OVDJE JE CAKA ZASTO SE cijela lista I POZIVA tj zbog personList

        // Spliterator pogledaj u svesci
        personList.forEach(person -> System.out.println(person)); // ispod haube koristi Spliterator

    }
}
