package Func1;

//  WAP to print the  prime number between 1 to 100.
public class Ques17 {

    // for check its prime or not function
    static void isPrime() {
        // int num = 100;
        int flag = 1;

        for (int num = 2; num <= 100; num++) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 0;

                }
                if (flag == 0) {
                    System.out.print(num +" ");
                    flag=1;
                    break;
                }
            }
           
        }
    }

    public static void main(String[] args) {
        isPrime();
    }
}
