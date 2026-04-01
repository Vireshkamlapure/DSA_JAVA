public class Pattern {

    void pattern1(){
        int n = 5;
        for(int i=0 ; i <=n ; i++){
            for(int j=0 ; j <=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(){
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern3(){
        int n = 5;
        for(int i=1; i <=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern4(){
        int n = 5;
        for(int i=1; i <=n; i++){
            for(int j=1 ; j <=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void pattern5(){
        int n = 5;
        for(int i=n ; i >=1 ; i--){
            for(int j=i ; j >=1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern6(){
        int n = 5;
        for(int i=n ; i >=1 ; i--){
            for(int j=1 ; j <=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern7(){
        int n=5;
        for (int i=0 ; i <n ; i++){
            //space
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0 ; k < 2*i+1 ; k++){
                System.out.print("*");
            }
            //space
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern8(){
        int n=5 ;
        for(int i=0 ; i <n ; i++){
            //space
            for(int j=0; j <i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0 ; k < 2*n - (2*i+1) ; k++){
                System.out.print("*");
            }
            //space
            for(int j=0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern10(){
        int n=5;
        for(int i=1 ; i <= (2*n-1) ; i++){
            int stars = i;
            if (i > n) stars = 2*n -i ;
            for(int j=0 ; j <= stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern11(){
        int n=5;
        int start = 1;
        for(int i = 0 ; i < n ; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    void pattern12(){
        int n = 4;
        for(int i = 1 ; i <= n ; i++){
            //num
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            //space
            for(int k = 0 ; k < 2*n-(2*i); k++){
                System.out.print(" ");
            }
            //num
            for(int j=i; j >=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern13(){
        int n=5;
        int num = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j= 1 ; j <= i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    void pattern14(){
        int n=5;
        int ch = 64;
        for(int i= 0 ; i <=n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)(ch+j)+ " ");
            }
            System.out.println();
        }
    }

    void pattern15(){
        int n = 5;
        int ch = 65;
        for(int i = 1 ; i <= n ; i++){
            for(int j=i ; j <=n-1 ; j++){
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
    }

    void pattern16(){
        int n = 5;
        int ch = 64;
        for(int i = 1; i <= n ; i++ ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)(ch+i)+" ");
            }
            System.out.println();
        }
    }

    void pattern17(){
        int n=4;
        for(int i=0 ; i < n ; i++){
            //space
            for(int j=0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            //character
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int k=0 ; k < 2*i+1 ; k++){
                System.out.print(ch);
                if(k < breakpoint) ch++;
                else ch--;
            }
            //space
            for(int j=0 ; j < n-i-1 ; j++){
            System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pattern18(){
        int n=5;
        int ch = 69;
        for(int i=0 ; i < n ; i++){
            for(int j=i ; j >=0; j--){
                System.out.print((char)(ch-j));
            }
            System.out.println();
        }
    }

    void pattern19(){
        int n = 5;
        int iniS = 0;
        for(int i=0 ; i < 5 ; i++){
            //star
            for(int j=0 ; j < n-i ; j++){
                 System.out.print("*");
            }
            //spaces
            for(int k = 0 ; k <= iniS; k++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j < n-i ; j++){
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2*n-2;
        for(int i=0 ;i < n ; i++){
            for(int j=0 ; j <=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int k = 0 ; k <= iniS; k++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j <=i ; j++){
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }

    void pattern20(){
        int n=5;
        int spaces = 2*n - 2;
        for(int i=0 ; i <= 2*n-1 ; i++){
            int stars = i;
            if(i > n) stars = 2*n - i;
            //star
            for(int j=0 ; j < stars ; j++){
                System.out.print("*");
            }
            //spaces
            for(int k = 0 ; k <= spaces ; k++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j < stars ; j++){
                System.out.print("*");
            }

            System.out.println();
            if(i < n) spaces-=2;
            else spaces+=2;
        }
    }

    void pattern21(){
        int n=4;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==0 || i == n-1 || j == 0 || j == n-1 ){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern22(){
        int n=4 ;
        for(int i = 0 ; i < 2*n-1 ; i++){
            for(int j =0 ; j < 2*n-1 ; j++){
                int top = i ;
                int left = j;
                int right = (2*n -2) -j;
                int down =(2*n -2) -i;
                System.out.print(n - (Math.min(Math.min(top, down), Math.min(left, right))));
            }
            System.out.println();
        }
    }
}
