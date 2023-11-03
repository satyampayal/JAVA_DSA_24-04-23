package NovoinVentDSA;

public class TrinaglePatternRec {
    static  void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
      // patern 
      static void pattern(int row,int col){
        if(row==0){
            return;
        }
        printStar(col+1);
        System.out.println();
        pattern(row-1, col+1);
    }
      public static void main(String[] args) {
        pattern(5,0);
    }
}
