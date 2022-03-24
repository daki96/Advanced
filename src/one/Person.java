package one;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Person(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    // 25.4.1989
    //32 god, 7 mjeseci, 8 dana
    public int getAge (){
        LocalDate today = LocalDate.now(); // pristupit trenutnom datumu
        Period period = birthday.until(today);// pozvat ce se funkcija until od varijable birthday sto smo oznacili
       int years = period.getYears(); // 32 god
        int month = period.getMonths(); // 7 mjeseci , period treba da vrati broj mjeseci tj getMonths
        System.out.println("mjesece: " + month + '\n' + "age : " + years);
       return month;

    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
