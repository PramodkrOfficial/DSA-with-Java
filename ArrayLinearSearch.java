import java.util.Scanner;
public class ArrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = addArray(n);
        int val = sc.nextInt();
        System.out.println(findArray (arr,val));
        sc.close();
    }

    public static int[] addArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int findArray(int arr[], int val){
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val){
                return i;
            }
         } 
         return -1;  
    }

}
