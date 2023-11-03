package NovoinVentDSA;

public class ContDigit {
    static void digitCont(int num,int count){
        if(num==0){
              System.out.println(count);
            return;
        }       
        digitCont(num/10,count+1);
       

    }
    public static void main(String[] args) {
        digitCont(123456, 0);
    }
}
