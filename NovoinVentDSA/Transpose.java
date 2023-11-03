package NovoinVentDSA;

public class Transpose {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3,4 },
                { 4, 5, 6,6 },
                { 7, 8, 9,9 },
                  {10,11,12,13,14} };
        // swap
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse
        for (int i = 0; i < arr.length; i++) {
            int lp=0;
            int rp=arr.length-1;
              while(lp<rp){
                 int temp = arr[i][lp];
                arr[i][lp] = arr[i][rp];
                arr[i][rp] = temp;
                lp++;
                rp--;
              }
          
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
