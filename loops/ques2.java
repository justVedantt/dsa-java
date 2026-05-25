package loops;
import java.util.*;
// Print numbers from 1 to n
public class ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
