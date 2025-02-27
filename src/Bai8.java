import java.util.Scanner;

public class Bai8 {
    // tinh tong cac phan tu trong ma tran(Mang 2 chieu) kich thuoc m x n
    public static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap m:");
        int m = sc.nextInt();
        System.out.print("Nhap n:");
        int n = sc.nextInt();

        // khoi tao kich thuoc mang
        int[][] arr2D = new int[m][n];

        // in mang: su dung for-each
       /* for (int[] i : arr){
            for (int j : i){
                sout(arr2D[j])
            }
        }*/
        for (int i=0;i<arr2D.length;i++){
            for (int j=0;j<arr2D[i].length;j++){
                System.out.print("Nhap phan tu "+i+" x "+j+" :");
                arr2D[i][j]= sc.nextInt();
            }
        }
        System.out.println("---------------------");
        // in
        for (int[] i : arr2D) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        // tinh tong: dong for-each
        int sumArr=0;
        for (int[] i : arr2D) {
            for (int j : i) {
                sumArr+=j;
            }
        }
        System.out.println("tong cac phan tu: sum="+sumArr);

    }

    public static void main(String[] args) {
        sum();
    }
}
