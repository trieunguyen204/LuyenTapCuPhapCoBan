public class Bai11 {
    // tich 2 ma tran
    // cij=xichMa(a[ik]*b[kj])
    // dk nhan : mxn * nxk
    public static void main(String[] args) {
        int[][] arr1={
                {1,2,3}
                ,{4,5,6}
        }
        ,arr2={
                {7,8}
                ,{9,10}
                ,{11,12}
        };
        int cot=arr2[0].length;
        int[][] c= new int[2][2];

        for (int i=0;i< arr1.length;i++){
            for (int j=0;j<cot;j++){
                int sum=0;
                for (int k=0;k<arr1[i].length;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("Ma tra c:");
        for (int[] i: c
             ) {
            for (int j : i){
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
}
