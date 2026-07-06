

package arrays;
import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // che
        marks[2] = sc.nextInt(); // mat
        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("mat : " + marks[2]);
    }
}
