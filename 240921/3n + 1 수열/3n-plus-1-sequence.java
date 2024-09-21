import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();

        while(true){
            if(N != 1){
                if(N % 2 == 0){
                    N = N / 2 ;
                    count += 1;
                }
                else{
                    N = (N * 3) + 1 ;
                    count += 1;
                }
            }else{
                System.out.print(count);
                break;
            }
        }
    }
}