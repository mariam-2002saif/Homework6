import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double investment_balance;
        double interest_rate;
        int year=0;
        Scanner x=new Scanner(System.in);
        System.out.println("please enter investment balance: ");
        investment_balance =x.nextDouble();
        System.out.println("please enter  interest rate: ");
        interest_rate=x.nextDouble();
        while (investment_balance<1000000)
        {
            investment_balance=investment_balance+interest_rate;
            year++;
        }
        System.out.println("year="+year);
    }
}
