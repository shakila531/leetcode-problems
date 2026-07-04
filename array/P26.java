package array;

import java.util.Arrays;
import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(i==0 || arr[i] != arr[i-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, count)));
    }
}

    

