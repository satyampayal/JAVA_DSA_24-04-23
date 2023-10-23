package Func1;

import java.util.Scanner;

public class Calculator {
    static int Addaition() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number for addation");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        return a + b;
    }

    static int Subtraction() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number for sub");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        return a - b;
    }

    static int Mutiplication() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number for Mul");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        return a * b;
    }

    static int Division() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number for Divide");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Enter your Choice");
        System.out.println("1.Addaition");
        System.out.println("2.Subtraction");
        System.out.println("3.Mutiplication");
        System.out.println("4.Division");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:

                int res = Addaition();
                System.out.println("ADD:" + res);

                break;
            case 2:
                int res1 = Subtraction();
                System.out.println("Sub:" + res1);
                break;
            case 3:
                int res2 = Mutiplication();
                System.out.println("Mul:" + res2);
                break;
            case 4:
                int res3 = Division();
                System.out.println("Divide:" + res3);
                break;
            default:
                System.out.println("Enter valid input");
        }
        sc.close();

    }
}
