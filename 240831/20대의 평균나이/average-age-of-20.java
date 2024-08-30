import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while(true) {
            int age = sc.nextInt();
            if(age>29 || age<20) {
                System.out.printf("%.2f", sum/count);
                break;
            }
            sum+=age;
            count++;
        }
    }
    }
}