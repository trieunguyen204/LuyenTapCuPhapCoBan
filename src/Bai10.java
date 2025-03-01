public class Bai10 {
    // kiem tra mang tran doi xung
    // ma tran doi xung = vuong + doi xung(M[ij]=M[ji])
    public static boolean kiemTraDoiXung(int[][] arr2D){
        boolean doiXung=true;
        for (int i=0;i<arr2D.length;i++){
            for (int j=i+1;j<arr2D.length;j++){ // dung j=i+1 vi chi kiem tra nua tren cua duong cheo chinh
                if (arr2D[i][j]!=arr2D[j][i]){
                    doiXung=false;
                }
            }
        }

        return doiXung;
    }

    public static void main(String[] args) {
        int[][] mangTest={
                {1,2,3}
                ,{2,5,6}
                ,{3,6,9}
        };
        System.out.println("Mang nay co doi xung khong? :"+kiemTraDoiXung(mangTest));
    }
}
