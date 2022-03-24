package one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {
    // Po osnovi ovo je instancna metoda
    // Tako da pozivamo preko PersonReader pr = new PersonReader(); -  pr.loadPersons();
    public List<Person> loadPersons(){
        // Kao tip podatka koristimo List ali kada instanciramo koristimo ArrayList kao sto vidimo new ArrayList
       List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Nedim","Ziga", LocalDate.of(1989,2,5));
        personList.add(p1);
        personList.add(new Person("Ajla","Reiz", LocalDate.of(1999,7,5)));
        personList.add(new Person("Neila","Osmanovic", LocalDate.of(1998,2,5)));
        personList.add(new Person("Dario","Zaric", LocalDate.of(2001,2,5)));
        personList.add(new Person("Marina","Vasic", LocalDate.of(2002,2,5)));
        personList.add(new Person("Edo","Bigic", LocalDate.of(1996,2,5)));

        return personList;
    }
}
