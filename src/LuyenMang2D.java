import java.util.Scanner;

public class LuyenMang2D {
    // nhap vao 1 ma tran kich thuoc mxn
    // tim max
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap m = ");
        int m = sc.nextInt();
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int[][] arr2D = new int[m][n];

        int max = 0;

        // nhap ma tran
        for (int i=0;i<arr2D.length;i++){
            for (int j=0;j<arr2D[i].length;j++){
                System.out.print("Nhap phan tu "+i +" "+j +" :");
                arr2D[i][j]= sc.nextInt();

            }
        }

        System.out.println("Ma Tran :");
        for (int[] i : arr2D
        ) {

            for (int j : i
            ) {
                System.out.print(j);
                if (max < j) {
                    max=j;
                }
            }
            System.out.println();

        }

        System.out.println("max = "+max);


    }
}
