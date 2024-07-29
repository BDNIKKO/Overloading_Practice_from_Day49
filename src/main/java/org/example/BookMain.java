package org.example;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Last Wish");
        Book book3 = new Book("Sword of Destiny", "Andrzej Sapkowski");
        Book book4 = new Book("Blood of Elves", "Andrzej Sapkowski", 320);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}
