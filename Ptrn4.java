import java.util.Scanner;

public class Ptrn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ptrval = 2;
        int colval = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= colval; j++) {
                System.out.print(ptrval +" ");
                if (j <= colval / 2) {
                    // System.out.print("col  " + colval /2+" ");
                    ptrval += 2;
                    
                } else {
                    // System.out.print("els  " + colval /2+" ");
                    ptrval -= 2;
                }

            }
            System.out.println();
            colval += 2;
            ptrval = 2;
        }
    }
}
