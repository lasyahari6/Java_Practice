import java.util.Scanner;

public class AnagramUsingFunction {
         static boolean isAnagram(String a, String b) {
            if(a.length()==b.length()){
            a=a.toLowerCase();
            b=b.toLowerCase();
            char[] ch=a.toCharArray();
            char[] ch1=b.toCharArray();
            java.util.Arrays.sort(ch);
            java.util.Arrays.sort(ch1);
            return java.util.Arrays.equals(ch, ch1);
            }
        else
            return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}