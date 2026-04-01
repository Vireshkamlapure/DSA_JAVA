import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit : ");
//        int input = scanner.nextInt();


//        System.out.println("Total no of digits in "+input+ " is "+basicMath.countDigits(input));

//        System.out.println("Reverse of "+input+" is "+basicMath.reverseNum(input));

//        basicMath.checkPalindrome(input);

//        basicMath.checkAmrstrongNum(input);

//        basicMath.printAllDivisors(input);

//        basicMath.checkPrime(input);

        System.out.println("GCD : "+basicMath.findGCD(9,11));
    }
}