package dev.harddrillstudio.wat.lab56;

public class Factorial {


    public int factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Liczba < 0");
        }

        if (x == 1 || x == 0)
            return 1;

        else
            return x * factorial(x-1);

    }

    public int factorial1(int x) throws MyException {
        if (x < 0) {
            throw new MyException ("Liczba < 0 MOJ WYJATEK");
        }

        if (x == 1 || x == 0)
            return 1;

        else
            return x * factorial1(x-1);
    }

}
