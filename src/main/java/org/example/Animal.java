package org.example;

public class Animal {
    private String name;
    private int age;
    private String species;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.species = "Unknown";
    }

    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.species = "Unknown";
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.species = "Unknown";
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", species=" + species + "]";
    }
}
