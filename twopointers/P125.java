package Two pointers;
import java.util.Scanner;
public class P125 {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char l =Character.toLowerCase(s.charAt(left));
            char r =Character.toLowerCase(s.charAt(right));
            if(l != r){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        P125 p125 = new P125();
        System.out.println(p
    
}
