
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class UserValidity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String input=sc.next();
            int len=input.length();
            if(len>=8&&len<=30){                                                                                                
                Pattern p=Pattern.compile("^[a-zA-Z0-9_]+$");
                Matcher m=p.matcher(input);
                if(m.matches()){
                    if(Character.isUpperCase(input.charAt(0))){
                        System.out.println("valid");
                    }
                    else System.out.println("Invalid");
                }
                else System.out.println("Invalid");
            }
            else System.out.println("invalid");
        }
        sc.close();

    }
}

    

