public class OwnPatterns {
    void pattern23(int n){
        for(int i=1 ; i <=n ; i++){
            for(int j=1; j <=i ; j++){
                if (j==1 || j==i || i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print("o");
                }

            }
            System.out.println();
        }
    }

    void pattern24(int n){
        for(int i=0 ; i<n ; i++){
            //space
            for (int j=0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            //star
            for(int k=0 ; k < 2*i+1 ; k++){
                System.out.print("*");
            }
            //space
            for (int j=0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
