package useOfSwitch;

public class SwitchMethod {
    public static void weekDay(int dayNumber){
        switch (dayNumber){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day number");

        }
    }

    public static void main(String[] args) {
        weekDay(4);
        weekDay(8);
        weekDay(15);
        weekDay(-1);
    }
}
