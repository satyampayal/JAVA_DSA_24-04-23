package NovoinVentDSA;

public class RecursionOnArray {
    static int searchElement(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        } else {
            if (i < arr.length) {
                      return searchElement(arr, target, i+1);

            } else
                return -1;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Index "+searchElement(arr, 3, 0));
    }
}
