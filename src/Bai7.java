import java.util.Scanner;

public class Bai7 {
    // nhap va xuat mang 2 chieu
    public static void nhapAndXuat(int m, int n){
        Scanner sc=new Scanner(System.in);
        // khai bao mang 2 chieu: mang co kich thuoc m x n
        int[][] arr2D=new int[m][n];

        // nhap mang
        for (int i =0;i<arr2D.length;i++){ // arr2D tra ve so hang cua mang 2 chieu
            for (int j =0;j<arr2D[i].length;j++){ // arr2D[i].length tra ve so cot cua hang i
                System.out.print("Nhap phan tu "+i+" x "+j+" :");
                arr2D[i][j]=sc.nextInt();
            }
        }

        // xuat mang
        System.out.println("Mang 2 chieu cua ban la:");
        for (int i =0;i<arr2D.length;i++){
            for (int j =0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhapAndXuat(3,3);
    }
}
