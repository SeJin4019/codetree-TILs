import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int width = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();

            System.out.println(width * height);
            if(c.equals("C")) break;
        }
        
    }
}