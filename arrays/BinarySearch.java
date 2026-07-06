package arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
        }
    }
}
