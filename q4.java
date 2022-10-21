import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        String w;
        Scanner m=new Scanner(System.in);
        w=m.next();
        for (int i=w.length()-1 ;i>=0; i--) {
            System.out.println((w.charAt(i)));

        }
    }
}
