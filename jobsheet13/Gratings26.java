package jobsheet13;

import java.util.Scanner;

public class Gratings26 {
    
    public static String getGreetingRecipient () {
Scanner input = new Scanner(System.in);
System.out.print("Input the name ofpeople you want to greet : ");
String recipienntName = input.nextLine();
input.close();
return recipienntName;
}
public static void sayThankyou() {
    String name = getGreetingRecipient();
    System.out.println("thankyou"+name+"may the foce be with you");
}
public static void main(String[] args) {
    sayThankyou();
}
}
