import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "Дарья";
        char[] words = str.toCharArray();
        System.out.println(words);
        int n = words.length;
        char[] a = Arrays.copyOfRange(words, 0, (n+1)/2);
        char[] b = Arrays.copyOfRange(words, (n+1)/2, n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));



    }
}