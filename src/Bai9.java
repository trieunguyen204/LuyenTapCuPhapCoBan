import java.util.Scanner;

public class Bai9 {
    // tinh tong: tung cot cua ma tran
    // a b c
    // c d e
    // sum1=a+c ; sum2 = b+d; sum 3= c+e
    public static void main(String[] args) {
        // nhap ma tran kich thuoc mXn
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap m = ");
        int m = sc.nextInt();
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        // nhap ma tran
        int[][] arr2D = new int[m][n];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print("Nhap phan tu thu "+i+" "+j +" :");
                arr2D[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Ma tran:");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }


        // tinh tong
        for (int j = 0; j <n; j++) {
            int sum=0;
            for (int k =0;k<m;k++){
                sum+=arr2D[k][j];
            }
            System.out.println("sum"+j+" ="+sum);
        }
    }
}
