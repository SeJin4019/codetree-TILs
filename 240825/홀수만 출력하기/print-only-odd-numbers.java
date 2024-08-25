import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < n+1; i++){
            int s = sc.nextInt();

            if(s % 2 != 0 && s % 3 == 0){
                System.out.println(s);
            }
        }
    }
}