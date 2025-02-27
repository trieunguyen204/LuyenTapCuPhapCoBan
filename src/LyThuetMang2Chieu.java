public class LyThuetMang2Chieu {
    public static void main(String[] args) {
        // mang 2 chieu
        int[][] arr2D= new int[2][3]; // khoi tao so phan tu cua mang 2 chieu
        int[][] arr2D_1={ // khoi tao gia tri cua mang 2 chieu
                {1,2,3}
                ,{4,5,7}
        };

        // duyet mang 2 chieu
        // duyet tung mang 1
        for (int i=0;i<arr2D_1.length;i++){
            for (int j=0;j<arr2D_1[i].length;j++){
                System.out.print(arr2D_1[i][j]+" ");
            }
            System.out.println();

        }
    }


}
