import java.util.*;
public class HighestInArray {
    public static void main(String[] args) {

        int[] arr = {-1, 3, 5, 6, 99, 12, 2};
        System.out.println("Original array is: "+Arrays.toString(arr));
        int length = arr.length;
        System.out.println("Highest element of the array is: "+highestElement(arr,length));

    }
    public static int highestElement(int[] arr,int length)
    {
        if (length == 1)
            return arr[0];

        return Math.max(arr[length-1], highestElement(arr,length-1));
    }
}
