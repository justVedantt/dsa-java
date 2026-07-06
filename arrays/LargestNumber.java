package arrays;

public class LargestNumber {
    public static void main(String[] args){
        int numbers[] = {1,2,6,3,5};
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
