package NovoinVentDSA;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Array size");
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(" first Maximum element is "+max);
        int second=-1;
        max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max ){
                second=max;
                  max=arr[i];
            }
           
            if(arr[i]!=max && arr[i]>second){
                    second=arr[i];
                }
            
        }
         System.out.println(" first Maximum element is "+max);
        System.out.println(" second Maximum element is "+second);


        sc.close();
    }
}
