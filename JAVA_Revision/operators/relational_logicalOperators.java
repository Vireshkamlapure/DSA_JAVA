package javaRev.operators;

public class relational_logicalOperators {
    public static void main(String[] args) {
        System.out.println(1 < 2);
        System.out.println(1 > 2);
        System.out.println(1 <= 2);
        System.out.println(1 >= 2);
        System.out.println(1 == 2);
        System.out.println(1 != 2);
        System.out.println();

        //logical and
        System.out.println(1 != 2 && 1 < 2); //true && true
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isGoodbeachDay = isSunny && isWarm;
        System.out.println(isGoodbeachDay);

        //logical or
        boolean isRain = true;
        boolean isSnow = false;
        System.out.println("Is bad weather : "+(isRain || isSnow));

        //logical not
        boolean isWorkDone = false;
        boolean canPlayGames = !isWorkDone;
        System.out.println("can play games? "+canPlayGames );
    }
}
