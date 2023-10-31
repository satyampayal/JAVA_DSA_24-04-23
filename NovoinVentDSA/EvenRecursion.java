package NovoinVentDSA;

import java.util.Scanner;

public class EvenRecursion {
    static void even(int l,int r){
       if(l>r){
        return;
       }
         even(l, r-1);
       
       if(r%2==0){
        System.out.print(r+" ");
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int l,r;
      System.out.println("Enter range");
      l=sc.nextInt();
      r=sc.nextInt();
     even(l, r);
     sc.close();
    }
}
