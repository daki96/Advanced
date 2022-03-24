package one.Collection;

import java.util.*;

public class Demonstration {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sead");
        names.add("Marina");
        names.add("Ajla");
        names.add("Adnan");
        names.add("Berin");
        // Od ove gore List kolekcije cemo napraviti dole ispod Treeset kolekcija koja ce imena abecedno poredati
        TreeSet<String> setOfNames = new TreeSet<>(names);
        for(String name : setOfNames){
            System.out.println(name);
        }

 // Medjutim profa je izbrisao ovu gore Treeset i for petlju jer ide nastavak necega kroz nizove pogledaj
  // TJ zelimo Listu sortirat u nizu - cast List to array
        String[] itemsArray = new String[names.size()]; // moramo prvo prazan niz formirat duzine names tj names.size

        // nakon toga cu uzeti kolekciju names pozvati toArray i proslijediti u ovaj niz kojim zelim napuniti elementima ove kolekcije
        String[] arrayOfNames = names.toArray(itemsArray);
        for (String name : arrayOfNames){
            System.out.println(name);
        }

        // BUBBLE SORT ZADACA
        //Collections.sort();  // POGLEDAJ OD 3.12.00
        Arrays.sort(arrayOfNames, String::compareTo);
    }
}
