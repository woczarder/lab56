package dev.harddrillstudio.wat.lab56;

public class Main {

    public static void main(String[] args) {
        DoTrzechRazySztuka xxx = new DoTrzechRazySztuka();

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(xxx.readFloat());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("JESTES GEJEM");
            }
        }

    }
}
