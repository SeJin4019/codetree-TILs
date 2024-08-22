import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.next();
        int p1t = sc.nextInt();

        String p2 = sc.next();
        int p2t = sc.nextInt();

        String p3 = sc.next();
        int p3t = sc.nextInt();

        int em = 0;
        if(p1.equals("Y") && p1t >= 37){
            em += 1;
        } 
        if(p2.equals("Y") && p2t >= 37){
            em +=1;
        }
        if(p3.equals("Y") && p3t >= 37){
            em +=1;
        }

        if(em >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}