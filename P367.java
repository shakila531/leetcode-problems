import java.util.Scanner;
class P367 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i * i <= n; i++){
            if(i * i == n){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
