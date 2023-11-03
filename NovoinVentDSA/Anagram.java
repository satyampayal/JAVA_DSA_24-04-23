package NovoinVentDSA;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "ilEsnt";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean result = Arrays.equals(charArray1, charArray2);
        if (result) {
            System.out.println("yes its");
        } else {
            System.out.println("No");
        }
    }
}
