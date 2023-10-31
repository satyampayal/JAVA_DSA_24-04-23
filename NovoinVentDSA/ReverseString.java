package NovoinVentDSA;
//import java.lang.*;
public class ReverseString {
    static String ReveString(String s,int l,int r)  {
        if(l>=r){
           // System.out.println(s);
            return s;
        }
                //StringBuilder s =new StringBuilder(s);

    char leftChar=s.charAt(l);
    char rightChar=s.charAt(r);
     s=s.substring(0, l) +rightChar+s.substring(l+1);  
     s=s.substring(0,r) +leftChar+s.substring(r+1);
     //System.out.println(s);

    // s.setCharAt(l, rightChar);
    // s.setCharAt(r, leftChar);
  
   ReveString(s, l+1, r-1);
        return s;

    
    }
    public static void main(String[] args)  {
      //  StringBuilder s=new StringBuilder("satyam");
      String s="satyam";
     System.out.println( ReveString(s,0,5));

    }
}
