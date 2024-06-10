import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] l1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
        int[] l2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93};
        System.out.println("Original l1 array is: "+ Arrays.toString(l1));
        System.out.println("Original l2 array is: "+ Arrays.toString(l2));

        List<Integer> commonEle = new ArrayList<>();

        for (int i = 0;i<l1.length;i++)
        {
            for (int j = 0;j<l2.length;j++)
            {
                if(l1[i] == l2[j])
                {
                    commonEle.add(l1[i]);
                    break;
                }
            }
        }
        System.out.println("Common Elements from both arrays are: "+commonEle);
    }
}
