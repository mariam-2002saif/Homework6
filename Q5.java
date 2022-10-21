import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        String w;
        int sum=0;
        Scanner m=new Scanner(System.in);
        w=m.next();
        for (int i = 0; i <=w.length()-1 ; i++) {
            if (w.charAt(i)=='a'||w.charAt(i)=='u'||w.charAt(i)=='o'||w.charAt(i)=='i'
                    ||w.charAt(i)=='e'||w.charAt(i)=='y')
            {sum=sum+1;}
        }
        System.out.println("number of vowels:"+sum);
    }
}
