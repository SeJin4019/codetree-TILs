import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int st = 1;

        while(true){
            if(st != N){
                st = st * 2;
                count += 1;
            }else{
                System.out.print(count);
                break;
            }
        }
    }
}