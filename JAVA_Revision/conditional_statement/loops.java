package javaRev.conditionalstmt;

public class loops {
    public static void main(String[] args) {
        int i  = 1;
        //while loop entry control
        while(i <= 10){
            System.out.print("Hello\t");
            i++;
        }
        System.out.println();

        //for loop
//        for(initilization ; condition ; increment/decrement)
        for(int j=0 ; j < 5 ; j++){
            System.out.print("Hii from for\t");
        }
        System.out.println();

        //do while loop //exit control
        int k = 11;
        do{
            System.out.print("Hello \t");
            k++;
        }while(k <= 10);
    }
}
