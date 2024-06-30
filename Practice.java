import java.util.*;
class Practice{
    public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    int number;
    double doubleNumber;
    String text;
    doubleNumber= scan.nextDouble();
    scan.nextLine();
    text= scan.nextLine();
    number= scan.nextInt();
    System.out.println(i + number);
    System.out.println(d + doubleNumber);
    System.out.println(s+ text);

    scan.close();
    }
}
