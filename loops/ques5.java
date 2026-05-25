package loops;
// Print reverse of a number
public class ques5 {
    public static void main(String[] args){
        int n = 12345;
        while(n > 0){
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}
