import java.util.Scanner;
public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int tmp = n;
        int numtmp = n;
        int rem = 0;
        int ans = 0;
        while (tmp != 0) {
            tmp = tmp/10;
            count++;
        }
        for (int i = count; i >= 0; i--) {
            rem = numtmp % 10;
            ans = ans + (int) Math.pow(rem, count);
            numtmp = numtmp / 10;

        }
        if (ans == n) {
            System.out.println("ans is Armstrong Number :- " + ans );
        }
        else{
            System.out.println("please chose the correct number");
        }
    }
}
