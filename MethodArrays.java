import java.util.Scanner;

public class MethodArrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        input(a);
        output(a);
    }
    public static void input(int[] b)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input the element");
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
    }
    public static void output(int[] c)
    {
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
