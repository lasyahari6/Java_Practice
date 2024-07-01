/*string is palindrome or not*/
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
       String nstr="";
        char ch;
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr; 
      }
      if(str.equals(nstr)) System.out.println("Yes");
      else System.out.println("No");
      s.close();
    }
}


