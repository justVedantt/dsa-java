package patterns_part_1;

public class HalfPyramid {
    public static void main(String[]args){
        for(int i = 1; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j);
            } 
            System.out.println();
        }
    }
}
