import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while(true){
            int age = sc.nextInt();
            if(age < 30){
                total += age;
                count++;   
            }
            
            if(age >= 30) {
                System.out.printf("%.2f", (double)total / count);
                break;
            }
        }
    }
}