package jobsheet3;

import java.util.Scanner;

public class ExampleVariable26 {

    public static void main(String[]args){
        String oneOfMyhobbies = "futsal";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 19;
        double $gpa = 3.38, height = 1.168;
    
        System.out.println(oneOfMyhobbies);
        System.out.println("are you smart?" + isSmart);
        System.out.println("gender:" + gender );
        System.out.println("my current age is" + _age);
        System.out.println (String.format("my GPA is %s and my height is %s meters", $gpa, height));

} 
}