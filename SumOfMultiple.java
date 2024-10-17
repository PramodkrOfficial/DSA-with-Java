import java.util.Scanner;


public class SumOfMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] pramod = new int[num];
        int value = 0;
        int sum[] = new int[num];
        for (int i = 0; i < num; i++) {
            pramod[i] = sc.nextInt();
            // System.out.println(pramod[i]);
        }
        for (int i = 0; i < num; i++) {
            value = pramod[i];
            for (int j = 0; j < value; j++) {
                if (j % 3 == 0 || j % 5 == 0) {
                    sum[i] = sum[i] + j;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            
            System.out.println(sum[i]);                                                              
        }
    }
    
}
