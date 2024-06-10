public class MainApp {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String is: "+str);

        ReverseString rv = new ReverseString();
        rv.reverseString(str);
        ReverseWords rw = new ReverseWords();
        rw.reverseWords(str);


    }
}