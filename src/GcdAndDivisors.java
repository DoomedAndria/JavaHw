import java.util.Arrays;

public class GcdAndDivisors {
    public static void main(String[] args) {

        for (int a : coprime_divisors(88, 99)) {
            System.out.println(a);
        }
    }

    static int GCD(int x, int y) {
        while (y != 0) {
            int k = y;
            y = x % y;
            x = k;
        }
        return x;
    }

    static int[] divisors(int a) {
        int[] divs = new int[a];
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                divs[c] = i;
                c++;
            }
        }
        return Arrays.copyOf(divs, c);
    }

    static int[] coprime_divisors(int p, int q) {
        int c = 0;
        int[] divs = divisors(p);
        int[] coprimes = new int[divs.length];
        for (int d : divs) {
            if (GCD(d, q) == 1) {
                coprimes[c] = d;
                c++;
            }
        }
        return Arrays.copyOf(coprimes, c);
    }

    static double floating_sum(int a,int b,int c,int d){
        return (double) a/b + (double) c/d;
    }
}
