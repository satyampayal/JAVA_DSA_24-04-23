package NovoinVentDSA;

public class FirstSUmRecu {
    static void printNaturalSum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        printNaturalSum(n-1, sum);
    }
    public static void main(String[] args) {
        printNaturalSum(10,0);
    }
}
