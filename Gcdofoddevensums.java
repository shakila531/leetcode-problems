import java.util.Scanner;
class Gcdofoddevensums{
    public int gcd(int n){
        int oddsum = 0;
        int evensum = 0;
        for(int i = 1; i <= n; i++){
                oddsum = oddsum + (2*i-1);
        }
        for(int i = 1; i <= n; i++){
                evensum = evensum + (2*i);
            
        }
        return getGcd(oddsum,evensum);
    }
    public int getGcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int num = sc.nextInt();
        Gcdofoddevensums obj = new Gcdofoddevensums();
        int result = obj.gcd(num);
        System.out.println(result);
        
    }
}
