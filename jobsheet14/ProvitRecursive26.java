package jobsheet14;

import java.util.Scanner;

public class ProvitRecursive26 {
    static double calculateProfit (double balance, int period) {
        if (period==0)
        return 1;
        else
        return 1.11*calculateProfit(balance, period-1);
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
System.out.print("Input Balance : ");
double initialBalance = input.nextInt();
System.out.print("Input Invesment Period : ");
int investPeriod = input.nextInt();
System.out.println("Balance after "+investPeriod+" year = ");
calculateProfit (initialBalance, investPeriod);
    }
}
