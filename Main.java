package dev.harddrillstudio.wat.lab56;

public class Main {

    public static void main(String[] args) throws Exception {
        Factorial factorial = new Factorial();

        try {
            System.out.println(factorial.factorial(4));
        } catch (IllegalArgumentException e) {
            System.out.println("liczba mniejsza od zera, geju");
        }

    }
}
