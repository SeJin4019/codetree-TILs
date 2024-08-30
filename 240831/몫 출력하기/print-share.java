import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            if(count <= 3){
                int num = sc.nextInt();
                if(num % 2 != 0) continue;
                if(num % 2 == 0){
                    System.out.println(num / 2);
                    count ++;
                }
            }else{
                break;
            }
            
        }
    }
}