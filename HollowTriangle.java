import java.util.Scanner;

public class HollowTriangle {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
           for(int j=1;j<=i;j++){
            if(j==1 || j==i || j==n || i==n ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
        sc.close();
    }
}
