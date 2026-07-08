package Two pointers;
import java.util.Scanner;

public class P167 {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
    
        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }

        return new int[]{};
    
        
    }
    public static void main(String[] args) {
        P167 p167 = new P167();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = p167.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }
    
}
