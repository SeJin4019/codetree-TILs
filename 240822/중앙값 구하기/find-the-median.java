import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int med = 0;
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        if(a>=b) {
            if(b>=c) {
                med = b;
            }else if(c<=a) {
                med = c;
            }else {
                med = a;
            }	
        }else if(a>c) {
            med = a;
        }else if(b>c) {
            med = c;
        }else {
            med = b;
        }
        System.out.println(med);

    }
}