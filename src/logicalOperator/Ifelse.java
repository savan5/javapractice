package logicalOperator;

public class Ifelse {
   public static void bigNumber(int a,int b,int c){
       if (a>b && a>c){
           System.out.println(a + " is bigger");
       } else if (b>a && b>c) {
           System.out.println(b + " is bigger");
       }
       else {
           System.out.println(c + " is bigger");
       }

   }

    public static void main(String[] args) {
        bigNumber(52,49,78);
        bigNumber(51,49,50000);
        bigNumber(15,26,57);
        bigNumber(2,5,8);
        bigNumber(9,9,9);
        bigNumber(-3,9,-75);
    }
}
