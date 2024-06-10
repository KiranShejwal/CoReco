
public class ReverseWords{
    public void reverseWords(String str){
        String[] strArr = str.split(" ");

        String result = "";
        for(int i = 0;i<strArr.length;i++)
        {
            String revWords = strArr[i];
            String rev = "";
            for (int j = revWords.length()-1; j>=0; j--) {
                rev = rev+revWords.charAt(j);
            }
            result = result+rev+" ";
        }
        System.out.println("After Words Reversal: "+result);
    }
}


