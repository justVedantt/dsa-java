package patterns_part_1;

public class InvertedStarPattern {
    public static void main(String[] args){
        int max = 4;
        for(int i = 0; i < max; i++){
            for(int j = 0; j < max; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
