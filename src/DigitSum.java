import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int ten_power = (int)Math.log10(n);

        for (int i = ten_power; i >= 0 ; i--) {
            int pow = (int)Math.pow(10,i);
            sum += n/pow;
            n %= pow;
        }
        System.out.print(sum);
    }
}
