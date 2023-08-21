import java.util.Scanner;

public class Vases {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int F = scan.nextInt();
        int V = scan.nextInt();

        int[][] T = new int[F][V];
        int[] indexes = new int[F];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < V; j++) {
                T[i][j] = scan.nextInt();
            }
            indexes[i] = i; //initialize indexes array
        }
        int sum = 0;
        int[] max_places = indexes.clone();
        while (true) {
            int t_s = 0;
            for (int i = 0; i < F; i++) {
                t_s += T[i][indexes[i]];
            }
            if (t_s > sum) {
                sum = t_s;
                max_places = indexes.clone();
            }
            if (indexes[0] == V - F)
                break;
            increment_iteration_indexes(indexes, F, V);
        }
        System.out.println(sum);
        for (int a : max_places) {
            System.out.print(a + 1 + " ");
        }
    }
    static void increment_iteration_indexes(int[] indexes, int F, int V) {
        for (int i = F - 1; i >= 0; i--) {
            if (V - F + i != indexes[i]) {
                indexes[i]++;
                for (int j = i + 1; j < F; j++) {
                    indexes[j] = indexes[j - 1] + 1;
                }
                break;
            }
        }
    }

}
