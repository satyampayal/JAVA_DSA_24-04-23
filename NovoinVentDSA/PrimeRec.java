package NovoinVentDSA;

public class PrimeRec {
    static void prime(int n, int a) {
        if (n % a != 0 && a <= n / 2) {
            prime(n, a + 1);
        } else {
            if (a > n / 2)
                System.out.println(n + " Is prime ");
            // else
            //     System.out.println("Not Prime");
            return;
        }
    }

    public static void main(String[] args) {
        for(int i=1000;i>2;i--){
             prime(i, 2);}
    }
}
