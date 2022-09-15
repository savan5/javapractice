package useOfSwitch;

public class ForLoop {
    public static void countOddNumber(int from,int to){
        for (int i = from;i <= to; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        countOddNumber(1,100);
    }
}