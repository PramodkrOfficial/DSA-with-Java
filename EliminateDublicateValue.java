import java.util.*;

public class EliminateDublicateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i])==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
