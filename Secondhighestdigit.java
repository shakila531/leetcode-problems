import java.util.Scanner;
public class Secondhighestdigit {
    public int secondhighest(String s){
        int first = -1;
        int second = -1;
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(digit > first){
                    second = first;
                    first = digit;
                }
                else if(digit != first && digit > second){
                    second = digit;
                }
            }
        }
        return second;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        Secondhighestdigit obj = new Secondhighestdigit();
        int result = obj.secondhighest(str);
        System.out.println(result);
    }

    
}
