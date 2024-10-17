import java.util.Scanner;

public class NumLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cn = 1;
        for (int i = 1; i <= n; i++) {
            int pv = i;
            for (int j = 1; j <= cn; j++) {
                System.out.print(pv);
                if (j <= cn/2) {
                    pv++;
                } else {
                    pv--;
                }
            }
            cn += 2;
            System.out.println( );
        }
    }
}
