import static java.lang.Math.log10;

public class BasicMath {
    int countDigits(int n){
        int count = 0;
//        while(n > 0){
//            count++;
//            n = n /10;
//        }
        count = (int) log10(n) + 1;
        return count;
    }

    int reverseNum(int n){
        int Revno = 0;
        int lastDigit = 0;
        while(n > 0){
            lastDigit = n % 10;
            Revno = (Revno * 10) + lastDigit;
            n = n / 10;
        }
        return Revno;
    }

    void checkPalindrome(int n){
        int dub = n;
        int revno = 0;
        int lastDigit = 0;
        while(dub > 0){
            lastDigit = dub % 10;
            revno = (revno * 10) + lastDigit;
            dub = dub / 10;
        }

        if(revno == n)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
    }

    void checkAmrstrongNum(int n){
        int dup = n;
        int lastDigit = 0;
        int order = (int) log10(n) +1;
        int sum = 0;
        while(dup > 0){
            lastDigit = dup % 10;
            sum = sum + ((int) Math.pow(lastDigit,order));
            dup = dup / 10;
        }
        System.out.println(sum);
        if (sum == n)
            System.out.println("It is a Amrstrong number");
        else
            System.out.println("Its not a amrstong number");
    }

    void printAllDivisors(int n){
//        for(int i=1; i <= n ; i++){
//            if(n%i == 0){
//                System.out.print(i+" , ");
//            }
//        }

        for(int i =1 ; i*i <= n ; i++){
            if(n % i == 0){
                System.out.print(i+ " ,");
                if((n/i) != i){
                    System.out.print(n/i+" ,");
                }
            }
        }
    }

    void checkPrime(int n){
        int cnt = 0;
        for(int i = 1 ; i*i <= n ; i++)
        {
            if(n % i == 0){
                cnt++;
                if((n/i) != i) cnt++;
            }
        }
        if (cnt == 2){
            System.out.println(n+" is a prime number");
        }
        else
            System.out.println(n+" is not a prime number");
    }

    int findGCD(int n1, int n2){
        int gcd = 1;
//        for(int i=1 ; i <= Math.min(n1,n2) ; i++){
//            if(n1 % i ==0 && n2 % i ==0){
//                gcd = i;
//            }
//        }

//        for(int i = Math.min(n1,n2) ; i >= 1 ; i--){
//            if(n1 % i ==0 && n2 % i ==0){
//                gcd = i;
//                break;
//            }
//        }

//        return gcd;
        //Equilateral Algorithm

        while(n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if(n1 == 0) return n2;
        return n1;
    }
}
