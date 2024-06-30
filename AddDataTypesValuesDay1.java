/*addition of integer, doubles and concatenation of string */
import java.util.*;
public class AddDataTypesValuesDay1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int i1=scan.nextInt();
        double d1=scan.nextDouble();
        scan.nextLine();
        String s1=scan.nextLine();
        System.out.println(i1+i);
        System.out.println(d1+d);
        System.out.println(s+s1);
        scan.close();
    }
}