import java.util.Scanner;
public class PrintKLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        int subarr = sc.nextInt();
        for (int i = n-subarr; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
