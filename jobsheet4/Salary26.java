package jobsheet4;

import java.util.Scanner;

public class Salary26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int numAttendance, numAbsence, totalsalary;
        int salary=40000, salaryDeduction=25000;
        System.out.println("Input attedance number: ");
        numAttendance = input.nextInt();
        System.out.println("Input absense number: ");
        numAbsence = input.nextInt();

        totalsalary=(numAttendance*salary)-(numAbsence*salaryDeduction);
        System.out.println("Total salary: "+totalsalary);

}
}


