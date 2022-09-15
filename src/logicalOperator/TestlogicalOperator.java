package logicalOperator;

public class TestlogicalOperator {
    int x = 5;
    public void test(int a,int b,int c,int d){

        System.out.println(a >= b && b >= c);
        System.out.println(c >=a || c < b);
        System.out.println(!(c >=a || c < b));
        System.out.println(d);
        System.out.println(d>a);
        System.out.println(d!=a);
        System.out.println(d==d);
        System.out.println(d==c);
        System.out.println(!(d==c));
    }

    public static void main(String[] args) {
        TestlogicalOperator obj = new TestlogicalOperator();
        obj.test(5,6,7,9);
    }
}
