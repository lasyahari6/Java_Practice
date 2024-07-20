import java.util.*;

class Paranthesis_stack{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
            String input=sc.next();
            System.out.println(Balanced(input)?"true":"false");
            }
        sc.close();
    }
        public static Boolean Balanced(String exp)
        {
            Stack<Character> stack =new Stack<>();
            for(int i=0;i<exp.length();i++){
                char c=exp.charAt(i);
                if(c=='(' || c=='[' || c=='{' )
                {
                    stack.push(c);
                }
                else if(c==')' || c==']' || c=='}' )
                {
                    if (stack.isEmpty()) {
                        return false; 
                    }
                    char top=stack.pop();
                     if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    
                        return false;
                    }
                }
            }            
        return stack.isEmpty();
        }              
       
        
}



