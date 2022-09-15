package arithmatic;

public class mixMethod {
    public static void add(int a,int b){
        int d = a + b;
        System.out.println(d);
    }
    public static void printMycountryName(String country){
        System.out.println(country);
    }
    public void myCountry(String country){
        System.out.println(country);
    }
    public static int addition(){
        int a = 5;
        int b = 6;
        int c = a + b;
        return c;
    }
    public static String savan(){
    String a = "savan";
    String b = " bathani";
    String c = a + b;
    return c;
    }
    public int adda(int a,int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 15;
        int z = x + y;
        System.out.println(z);
        System.out.println("komal bathani");
        add(255,10);
        add(25,47);
        printMycountryName("India");
        mixMethod obj1 = new mixMethod();
        obj1.myCountry("India");
        System.out.println(addition());
        System.out.println(obj1.adda(23,36));

    }
}
