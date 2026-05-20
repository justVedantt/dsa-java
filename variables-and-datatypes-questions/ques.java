import java.util.*;
public class ques {
    /* 
    Question1: In a program,input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
    (Hint : Average of N numbers is sum of those numbers divided by N)
    Question2: In a program, input the side of a square. You have to output the area of the square.
    (Hint : area of a square is (side x side))
    Question3: Enter cost of 3 items from the user(using float datatype)- a pencil, a pen and an eraser. 
    You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
    Question 4:What will be the type of result in the following Java code?
    (Hint : Look at the largest data type among these)
    Question 5:(Advanced)Will the following statementgive any error in Java?
    int$=24;
    */
    public static void main(String[] args){
        // ques1 
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println(avg);

        // ques 2
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);

        // ques 3
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.println(totalCost);

        // ques 5
        int $ = 24; // this will not give an error because $ is  a valid character for variable names in Java

    }
    
}
