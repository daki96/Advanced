package one;

import java.util.List;

public class OneTester {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personS = personReader.loadPersons();
       for (Person person:personS){
           System.out.println(person);
       }
    }
}
