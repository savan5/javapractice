package arithmatic;

public class voidMethod {

    public static void add() {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    public static int multi() {
        int a = 5;
        int b = 9;
        int c = a * b;
        return c;
    }

    public static String printMyName() {
        String myName = "Savan";
        return myName;
    }

    public static boolean answerType() {
        boolean b = true;
        return b;
    }

    public static void printHouseName(String myHouseName){
        System.out.println(myHouseName);

    }
    public static void addTwoNumber(int a,int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void addThreeNumber(int a,int b,int c){
        int d = a + b + c;
        System.out.println(d);
    }

    public static void addFourNumber(int a,int b,int c,int d){
        int e = a + b + c + d;
        System.out.println(e);
    }

    public static void multiple(int a,int b){
        int c = a * b;
        System.out.println(c);
    }


    public static void mySchoolName(String mySchool){
        System.out.println(mySchool);
    }

    public static void main(String[] args) {
        int d = multi();
        System.out.println(multi());
        System.out.println(d);
        System.out.println(printMyName());
        System.out.println(answerType());
        printHouseName("satyam");
        addTwoNumber(800,900);
        addTwoNumber(222,333);
        addThreeNumber(20,30,60);
        addThreeNumber(-20,30,10);
        addFourNumber(5,5,5,5);
        multiple(300,365);
    }
}
