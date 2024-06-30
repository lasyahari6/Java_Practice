/*calculate the meals cost by adding tip and tax percentage*/
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);     /*getting input from user*/
        double mealcost=scan.nextDouble();
        int tip_percent=scan.nextInt();
        int tax_percent=scan.nextInt();
        double tip=(mealcost/100)*tip_percent;  /*calculate tip and tax % */
        double tax=(mealcost/100)*tax_percent; 
        System.out.println(tip);
        System.out.println(tax);  
        double total=mealcost+tax+tip;  /*calculate total */
        System.out.println(total);
        int value=(int)Math.round(total);   /*roundof total cost */
        System.out.println(value);
        scan.close();

    }
    
}
