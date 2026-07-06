package patterns_part_1;

public class CharacterPattern {
    public static void main(String[] args){
        int n = 7;
        char ch = 'A';
        for(int i = 0; i < n; i++){ 
            for(int j = 0; j <=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
