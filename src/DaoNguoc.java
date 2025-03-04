import java.util.Scanner;

public class DaoNguoc {
    // dao nguoc mang
    public static void main(String[] args) {
        System.out.println("------------------");

        // nhap mang
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: number=");
        int number = scanner.nextInt();

        int[] arr1= new int[number];

        /*int count=1;
        for (int i: arr1){
            System.out.print("Moi ngai nhap phan tu thu "+count+" :");
            i= scanner.nextInt();
            count++;
        }*/
        for (int i=0; i<arr1.length;i++){
            System.out.print("Moi ngai nhap phan tu thu "+i+" :");
            arr1[i]=scanner.nextInt();
        }
        //in arr
        System.out.print("Mang vua nhap :");
        for (int i:arr1){
            System.out.print(i+" ");
        }
        // {1,2,3,4,5,5,6,7}
        // i<(n-1)-i
        // dao nguoc
        for (int i=0;i<(arr1.length - i);i++){
            int temp=arr1[i];
            arr1[i]=arr1[number-1-i];
            arr1[number-1-i]=temp;
        }
        System.out.print("\nMang vua sap xep :");
        for (int i : arr1) {
            System.out.print(i + " ");
        }




        System.out.println("------------------");









    }

}
