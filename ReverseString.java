
public class ReverseString {
    public void reverseString(String str) {
        String result = "";
        for(int i = str.length() - 1;i>=0;i--)
        {

            result+= str.charAt(i);
        }
        System.out.println("After String Reversal: "+result);
    }
}
