package array;
import java.util.*;
public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String ans = " ";
        for(int i = 0; i < arr[0].length(); i++){
            char ch = arr[0].charAt(i);
            for(int j = 1; j < arr.length; j++){
                if(i >= arr[j].length() || arr[j].charAt(i) != ch){
                    System.out.println(ans);
                    return;
                }
            }
            ans += ch;
        }
        System.out.println(ans);
    }
}
    

