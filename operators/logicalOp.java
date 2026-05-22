package operators;

public class logicalOp {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        System.out.println((a > b) && (a == 1));
        System.out.println((a > b) || (a == 1));
        System.out.println(!(a > b));
    }
}
