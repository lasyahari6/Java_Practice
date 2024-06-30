import java.util.*;
public class Datatypes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            
                
                try{
                    long x=s.nextLong();
                    System.out.println(x+" can be fitted in:");
                    if(x>=-128&&x<=127) System.out.println("* byte");
                    if(x>=-32768 && x<=32767) System.out.println("* short");
                    if(x>=-2147483648 && x<=2147483647) System.out.println("* int");   
                    if(x>=-((long)(Math.pow(2,63))+1)&&x<=(long)(Math.pow(2,63))) System.out.println("* long");
                }
            
                catch(Exception e){
                    System.out.println(s.next()+" can't be fitted anywhere.");
                }
            }
            s.close();
            
        }
        
        
    }
    
