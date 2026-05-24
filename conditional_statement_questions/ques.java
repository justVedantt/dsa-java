package conditional_statement_questions;

import java.util.Scanner;

public class ques {
    public static void main(String[] args){
/*
1. **Question 1:**
   Write a Java program to get a number from the user and print whether it is positive or negative.

2. **Question 2:**
   Finish the following code so that it prints `"You have a fever"` if your temperature is above 100, and otherwise prints `"You don't have a fever"`.

```java id="v2q7cp"
public class Solution {
    public static void main(String[] args) {
        double temp = 103.5;
    }
}
```

3. **Question 3:**
   Write a Java program to input a week number (1–7) and print the day of the week name using `switch` case.

4. **Question 4:**
   What will be the value of `x` and `y` in the following program?

```java id="n3g8zk"
public class Solution {
    public static void main(String args[]) {

        int a = 63, b = 36;

        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
    }
}
```

5. **Question 5:**
   Write a Java program that takes a year from the user and prints whether that year is a leap year or not.

         */


// Ques 1
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   if(num > 0){
    System.out.println("Positive");
   }else {
    System.out.println("Negative");
   }

   // Ques 2
    double temp = 103.5;
    if(temp > 100){
        System.out.println("You have a fever");
    }else{
        System.out.println("You don't have a fever");
    }

    // Ques 3
    int day = 4;
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Write valid day");

        // Ques 5
        int year = sc.nextInt();
        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? true: false;

    }
}
