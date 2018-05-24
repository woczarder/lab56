package dev.harddrillstudio.wat.lab56;

public class Main {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int tab[] = {-3, -1, 0, 1, 2, 4, 5};
        for (int i = 0; i < tab.length; i++) {
            try {
                System.out.println("Silnia z " + tab[i] + ": " + factorial.factorial(tab[i]));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();
            }
        }

        for (int i = 0; i < tab.length; i++) {
            try {
                System.out.println("Silnia z " + tab[i] + ": " + factorial.factorial1(tab[i]));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();

            }
        }
    }
}
