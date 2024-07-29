package org.example;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Leopard");
        Animal animal3 = new Animal("Zebra", 3);
        Animal animal4 = new Animal("Gorilla", 20, "Mammal");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}
