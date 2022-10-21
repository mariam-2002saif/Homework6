import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int sum_ev=0,a,b,c,sum_od=0;
        int sum_odd=0;
        Scanner x=new Scanner(System.in);
        for (int i = 2; i <=100 ;i++) {
            if(i%2==0)
                sum_ev=sum_ev+i;
        }
        System.out.println(sum_ev);
        a=x.nextInt();
        b=x.nextInt();
        for (int i=a; i<=b; i++) {
            sum_odd=sum_odd+i;
        }
        System.out.println(sum_odd);
        c=x.nextInt();
        while (c>0)
        {int r=c%10;
        if (r%2!=0)
        {sum_od=sum_od+r;}
        c/=10;}
        System.out.println(sum_od);
    }
}
