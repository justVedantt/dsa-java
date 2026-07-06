package patterns_part_1;

public class InvertedStarPattern {
    public static void main(String[] args){
        
        for(int i = 0; i < 4; i++){
            for(int j = 3; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
