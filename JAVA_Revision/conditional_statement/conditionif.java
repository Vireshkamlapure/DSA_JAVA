package javaRev.conditionalstmt;

public class conditionif {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;
        if (isSunny && isWarm){
            System.out.println("Beach day");
        } else if (isSunny) {
            System.out.println("wear sweter and go to beach");
        } else{
            System.out.println("Stay at home");
        }

        //switch stmt
        int day = 3;
        switch(day){
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
                System.out.println("invalid day");
        }

        //ternary operator
        int a = 2;
        String s = a%2==0? "Even" : "Odd";
        System.out.println(s);
    }
}
