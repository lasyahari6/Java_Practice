import java.util.*;
public class PrintEven_OddLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
            System.out.println(getEven(str)+" "+getOdd(str));
        }
        sc.close();
    }
    
    public static String getEven(String str) {
        StringBuilder even = new StringBuilder();
        for(int i=0;i<str.length();i+=2){
            even.append(str.charAt(i));
        }
        return even.toString();
    }
        
    public static String getOdd(String str) {
        StringBuilder odd = new StringBuilder();
        for(int i=1;i<str.length();i+=2){
            odd.append(str.charAt(i));
        }
        return odd.toString();
    }
    
}