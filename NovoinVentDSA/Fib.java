package NovoinVentDSA;

public class Fib {
    static void fib(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");

        int third = a + b;
        a = b;
        b = third;
        fib(n - 1, a, b);

    }

    public static void main(String[] args) {
        fib(10, 0, 1);
    }
}
