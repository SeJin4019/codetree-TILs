import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;

        for(int i = i; i <= b; i++){
            if(a % i == 0){
                prod *= i;
            }
        }

        System.out.print(prod);
    }
}