import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int ans1 = 1;
        int ans2 = 1;
        for (int i = n; i > 0; i--) {
            ans1 = ans1 * i;

        }
        for (int j = n2; j > 0; j--) {
            ans2 = ans2 * j;

        }
        System.out.println(ans1 - ans2);

    }

}
