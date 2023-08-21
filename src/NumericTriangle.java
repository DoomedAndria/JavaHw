import java.util.Scanner;

public class NumericTriangle {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("input number of rows: ");
        int N = scan.nextInt();
        int [][] triangle = new int[N][N];

        for (int i = 0; i < N; i++) {
            int[] row = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                row[j] = scan.nextInt();
            }
            triangle[i] = row;
        }
        int [] values = new int[N];

        System.out.println("\nmax sum is: "+max_sum(triangle,0,0,values)[0][0]);
        for (int a :max_sum(triangle,0,0,values)[1]){
            System.out.print(a+" -> ");
        }
    }

    static int[][] max_sum(int [][] triangle,int x,int y ,int [] values){
        int[] values1 = values.clone();
        if(x==triangle.length-1){
            values1[x] = triangle[x][y];
            return new int[][]{{triangle[x][y]},values1};
        }
        else {
            int[][] v1 = max_sum(triangle,x+1,y,values1);
            int[][] v2 = max_sum(triangle,x+1,y+1,values1);
            if(v1[0][0] > v2[0][0])
               v2 = v1;
            v2[0][0]+= triangle[x][y];
            v2[1][x] = triangle[x][y];
            return v2;
        }
    }
}
