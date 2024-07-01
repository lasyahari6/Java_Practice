import java.util.*;
import java.lang.String;
public class SplitStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        String[] str2=str.split("[ !,?._'@]+"); /*split a string whenever there is a special char or space */
        if(str.length()==0) System.out.println("0");
        else System.out.println(str2.length);
        for (String a : str2)
             System.out.println(a);
        sc.close();


    }
}
