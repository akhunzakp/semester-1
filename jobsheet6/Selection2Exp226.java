package jobsheet6;

import java.util.Scanner;

public class Selection2Exp226{

    public static void main(String[] args){
        int totalAngle,angle,angle1,angle2,angle3;
        Scanner input26 = new Scanner(System.in);
        System.out.println("Input angle 1 = ");
        angle1 = input26.nextInt();
        System.out.println("Input angle 2 = ");
        angle2 = input26.nextInt();
        System.out.println("Input angle 3 = ");
        angle3 = input26.nextInt();
        totalAngle = angle1+angle2+angle3;
    
        //if(totalAngle == 180)
            //if(angle1==90 || angle2==90 || angle3==90)
                //System.out.println("Right triangle");

            //else
                //System.out.println("Not a right triangle");

        //else
            //System.out.println("Not a triangle");
        
            if(angle1==90 || angle2==90 || angle3==90)
            System.out.println("Right triangle");
            else if (angle1 == angle2 && angle2 == angle3){
                System.out.println("Right This is an equilateral triangle");
                }else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3){
                System.out.println("This is an isosceles triangle");
                }else{
                System.out.println("not a triangle");
                }
    }
}