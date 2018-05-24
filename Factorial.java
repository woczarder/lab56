package dev.harddrillstudio.wat.lab56;

public class Factorial {


    public int factorial(int x) throws Exception{
        if (x < 0) {
            throw new IllegalArgumentException("JESTES GEJEM");
        }

        if (x > 1) {
            return x * factorial(x-1);
        }
        return 1;
    }

}
