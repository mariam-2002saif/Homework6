import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int n,mood;
        Scanner m=new Scanner(System.in);
        n=m.nextInt();
        for (int i = n; i >n ; i--) {

            mood=n%2;
            n=n/2;
            System.out.println(mood);
        }
    }
}
