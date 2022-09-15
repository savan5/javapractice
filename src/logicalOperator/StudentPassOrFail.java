package logicalOperator;

public class StudentPassOrFail {
    public static void passOrFail(int a){
       if (a < 35){
           System.out.println( a + " fail");
       } else if (a >= 35 && a <= 60) {
           System.out.println( a + " pass");

       } else if (a > 60 && a <= 75) {
           System.out.println( a + " pass with distriction");

       }
       if (a > 75 && a <= 100){
            System.out.println( a + " pass with upper distriction");
        }

    }

    public static void main(String[] args) {
        passOrFail(25);
        passOrFail(36);
        passOrFail(-25);
        passOrFail(88);
        passOrFail(66);
        passOrFail(99);
    }
}
