public class LyThuyetMang3Chieu {
    public static void main(String[] args) {
        // mang 3 chieu
        // khai bao mang 3 chieu
        int[][][] arr3D;

        // khoi tao so phan tu cua mang 3 chieu
        int[][][] arr3d_1 = new int[2][3][4];

        // khoi tao gia tri cua mang 3 chieu
        int[][][] arr3D_2 = {
                {{1, 2, 3, 4}, {2, 3, 4, 5}, {4, 5, 6, 7}}
                , {{4, 2, 1, 5}, {4, 5, 6, 8}, {5, 6, 4, 7}}
        };
        // in mang 3 chieu
        for (int i = 0; i < arr3D_2.length; i++) {
            for (int j =0;j<arr3D_2[i].length;j++){
                for (int k = 0;k<arr3D_2[i][j].length;k++){
                    System.out.print(arr3D_2[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }

    }
}
