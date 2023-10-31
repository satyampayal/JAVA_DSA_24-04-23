package NovoinVentDSA;

public class ContDigitRecursion {
    static void digitPrint(int num){
        if(num==0){
            return;
        }       
        digitPrint(num/10);
         System.out.println(num%10);

    }
    public static void main(String[] args) {
        digitPrint(1234);
    }
}
