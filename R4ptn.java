import java.util.Scanner;

public class R4ptn {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st =n;
    
        // System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {
                   
                System.out.print("*");
            }
            st--;
            System.out.println();
        }
    }
}