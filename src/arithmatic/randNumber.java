package arithmatic;

import java.util.Random;

public class randNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomNumber = random.nextInt();
        String email = "savan"+ myRandomNumber + "@gmail.com";
       // System.out.println(myRandomNumber);
 //       System.out.println(random.nextInt(1000));
        System.out.println(email);

    }
}
