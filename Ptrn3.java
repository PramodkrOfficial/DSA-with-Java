import java.util.Scanner;
public class Ptrn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colnum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= colnum; j++) {
                System.out.print(j);
            }
            System.out.println();
            colnum++;
        }
    }
}
