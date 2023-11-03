package NovoinVentDSA;
// 12345-->>> 1,2,3,4,5 and 5,4,3,2,1
public class LTR {
    static void ltr(int num){
        if(num==0){
            return;
        }
        ltr(num/10);
        System.out.println(num%10+" ");
    }
    static void rtl(int num){
          if(num==0){
            return;
        }
        System.out.println(num%10);
        rtl(num/10);
    }
    public static void main(String[] args) {
        ltr(12345);
        System.out.println();
        rtl(12345);
    }
}
