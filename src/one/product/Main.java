package one.product;

import one.Person;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("22213",23);
        product.calculateGrossPrice();
        product.calculateGrossPrice1();
        System.out.println(product.calculateGrossPrice1() + " " + product.calculateGrossPrice());
        product.print();// Pozivamo metodu koju smo napravili za ispis

        Chocolate chocolate = new Chocolate("23321",12);
        chocolate.calculateGrossPrice1();
        System.out.println(chocolate.calculateGrossPrice1());

        Product wine = new Wine("2321", 10);
        wine.calculateGrossPrice1();
        wine.calculateGrossPrice();
        System.out.println(wine.calculateGrossPrice1() + " " + wine.calculateGrossPrice());
        wine.taxAmount(24);


    }
}
