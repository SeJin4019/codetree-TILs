import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = false;

        for(int i = a; i <= b; i++){
            if(i % 1920 == 0 && i % 2880 == 0){
                flag = true;
            }
        }
        if(flag){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}