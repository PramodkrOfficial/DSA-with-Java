import java.util.Scanner;
import java.lang.Math;
public class NumToWord {
    public static void main(String[] args) {
        String arr[] = { "zero ", "one ", "two ", "three ", "four ", "five", "six", "seven", "eight", "nine" };
        StringBuffer ans = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int count = 0;
        while (tmp != 0) {
            tmp =tmp/10;
            count++;
        }
        System.out.println(count);

        while (n != 0) {
            tmp = n/(int)Math.pow(10, count);
             ans.append(arr[tmp]);
            System.out.println(tmp);
            count--;
            n = n/10;

        }
        System.out.println(ans);
    }
}
