import java.util.Scanner;
public class Ptrn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colnum = 1;
        int ptrval = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= colnum; j++) {
                System.out.print(ptrval);
                if (j <= colnum/2) {
                    ptrval++;
                }else{
                    ptrval--;
                }
                
            }
            colnum += 2;
            System.out.println();
            ptrval = 1;
        }
    }

}
