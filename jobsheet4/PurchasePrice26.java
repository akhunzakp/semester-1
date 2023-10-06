package jobsheet4;

import java.util.Scanner;

public class PurchasePrice26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int price, quantity;
        double discount=0.1, totalPrice, PurchasePrice, totalDiscount;
        System.out.println("input price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt(); 

        totalPrice=price*quantity;
        totalDiscount=totalPrice*discount;
        PurchasePrice=totalPrice-totalDiscount;
        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+PurchasePrice);

    }
}
