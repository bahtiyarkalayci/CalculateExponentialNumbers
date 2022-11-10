import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
       // n power p
        int n,p,power=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number=");
        n= scanner.nextInt();
        System.out.println("enter the power of number");
        p=scanner.nextInt();

        for (int i=1;i<=p;i++){
            power=power*n;
        }
        System.out.println("power="+power);
    }
}
