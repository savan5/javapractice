package Basic;

import java.util.Random;

public class random {

    public static void randomPassword(){
        Random number = new Random();
       int x = number.nextInt();
       String myPassword = "secret@" + x + "file";
        System.out.println(myPassword);
    }

    public static void main(String[] args) {
        randomPassword();
    }
}
