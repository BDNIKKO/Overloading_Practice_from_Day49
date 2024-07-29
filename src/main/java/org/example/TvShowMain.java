package org.example;

public class TvShowMain {
    public static void main(String[] args) {
        TvShow show1 = new TvShow();
        TvShow show2 = new TvShow("The Expanse");
        TvShow show3 = new TvShow("The Wire", 5);
        TvShow show4 = new TvShow("The Sopranos", 6, "Crime Drama");

        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);
        System.out.println(show4);
    }
}
