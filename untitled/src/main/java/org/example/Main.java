package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Pessoa person1 = new Pessoa(true,1.77,53);
    Pessoa person2 = new Pessoa(false,1.84,75);

    String imcFeminino = person1.calcularImc();
    String imcMasculino = person1.calcularImc();
}