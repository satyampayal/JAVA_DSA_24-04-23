package NovoinVentDSA;

public class ReverseRecur {
    static void reverseNum(int num,int copy){
         if(num==0){
            System.out.println(copy);
            return;
         }
       
         reverseNum(num/10, copy*10 + num%10);
         
    }
    public static void main(String[] args) {
        //System.out.println(Math.abs(001));
        reverseNum(121, 0); 
    }
}
