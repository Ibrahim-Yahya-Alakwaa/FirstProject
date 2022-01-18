import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("input the element");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
