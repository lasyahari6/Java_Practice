import java.util.*;
class IP_address{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int one=sc.nextInt(),second=sc.nextInt();
        int third=sc.nextInt(), forth=sc.nextInt();
        if(isInteger(one))
        else if(one>=0&&one<=255&&second>=0&&second<=255&&third>=0&&third<=255&&forth>=0&&forth<=255) System.out.println(one+"."+second+"."+third+"."+forth);
        else System.out.println("Not Valid");
        sc.close();

    }
}