package one.Collection;

import one.Person;
import one.PersonReader;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

public class PersonTester {
    public static void main(String[] args) {
//        Person p1 = new Person("Nedim","Ziga", LocalDate.of(1989,2,5));
//        p1.getAge();
//        System.out.println(p1.getAge());

        PersonReader personReader = new PersonReader();
        //Iterable,Collection,List,Arraylist
        List<Person> personList = personReader.loadPersons();
//        for (int i = 0; i < personList.size(); i++) {
//            Person person = personList.get(i);             OVO JE KLASICNI FOR LOOP ISPOD JE ENHANCED
//            System.out.println(person);
        for (Person person : personList) {
            System.out.println(person);
        }

        DataContainer dataContainer = new DataContainer();
          for (Object object : dataContainer){
              System.out.println(object);// Bit ce na ispisu exception jer je null vrijednost u iterator metodi
          }



    }
}
