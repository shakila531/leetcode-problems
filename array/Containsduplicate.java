package array;
import java.util.*;

public class Containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;

            }
            set.add(num);
        }
        return false;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Containsduplicate cd = new Containsduplicate();
        boolean result = cd.containsDuplicate(arr);
        System.out.println("Contains duplicate: " + result);
    }
    
}
