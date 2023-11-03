package NovoinVentDSA;

public class PAtternSolidRec {
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
        printStar(col);
        System.out.println();
        pattern(row-1, col);
    }
    public static void main(String[] args) {
        pattern(5,5);
    }
}
