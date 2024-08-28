import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;

        while (true){
            n = n / i;
            if(n < 1){
                count++;
                System.out.print(count);
                break;
            }
            i++;
            count++;
        }

    }
}