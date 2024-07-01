/*Anagrams or not*/
import java.util.*;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1, s2;
        s1=scan.nextLine();
        s2=scan.nextLine();
        String str1=s1.toLowerCase();             /*convert string to lower case values*/
        String str2=s2.toLowerCase();
        if(s1.length()==s2.length()){             /*check for length of string*/
            char[] ch1=str1.toCharArray();        /*changing string to characters and store in arrays*/
            char[] ch2=str2.toCharArray();
            
            Arrays.sort(ch1);                    /*sort characters in array*/
            Arrays.sort(ch2);
            Boolean result =Arrays.equals(ch1,ch2);    /*check whether the arrays are equal or not*/
            if(result)System.out.println("Anagrams");
            else System.out.println("Not Anagrams");
        }
        else System.out.println("Not Anagrams");
        scan.close();
    }
}
