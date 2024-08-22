import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if(a < b){
            max = b;
        }else{
            max = a;
        }

        if(max < c){
            max = c;
        }else{
            max = max;
        }

        System.out.println(max);
    }
}