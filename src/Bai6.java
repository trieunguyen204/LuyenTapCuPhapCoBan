import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    // Mang n ptu , in ra max, min, sum,gttb, sx tang dan
    public static void print(int n) {
        int[] array_1 = new int[n]; // khoi tao mang n ptu

        Scanner sc = new Scanner(System.in);

        // nhap n ptu cho mang n
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + "cua mang array_1:");
            array_1[i] = sc.nextInt();
        }

        // tim max,min,average,sum su dung ham co san hoac code thuat toan
        int min = 10000, max = 0, sum = 0;
        double average = 0;

        // neu mang rong
        if (array_1.length == 0) {
            System.out.println("Mang rong!");
        } else {
            min = Arrays.stream(array_1).min().getAsInt();
            max = Arrays.stream(array_1).max().getAsInt();
            sum = Arrays.stream(array_1).sum(); // da tra ve int nen kh dung getAsInt()
            average = Arrays.stream(array_1).average().getAsDouble();
            // sap xep selectSort
            // b1:duyet tu dau den cuoi mang
            // b2:duyet den phan tu thu i, tim min (max) tren doan [i;n-1] (nhung code chi sx den n-2 vi index=n-1 tu dung)
            // roi doi cho
            // tim min + index[i],index[doi]
            // b3:lap

            for (int i=0;i<array_1.length-1;i++){
                int indexMin =i; // gs min tại index = i
                //tim min tren doan index [i+1;n-1]
                for (int j=i+1;j<n;j++){
                    if (array_1[indexMin]>array_1[j]){
                        indexMin=j;
                    }
                }

                if (indexMin != i) { // neu min khong tai index = i  thi doi cho, tranh mat thoi gian
                    int temp=array_1[i];
                    array_1[i]=array_1[indexMin];
                    array_1[indexMin]=temp;
                }

            }



        }
        System.out.print("Mang ban vua nhap la:");
        for (int i =0;i<n;i++){
            System.out.print(array_1[i] +" ");
        }
        System.out.println("\nmin = "+min);
        System.out.println("max = "+max);
        System.out.println("sum = "+sum);
        System.out.println("average = "+average);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang : n =");
        int n=sc.nextInt();

        System.out.println("_________________________________________");
        System.out.println("Bat dau nhe !");
        System.out.println("_________________________________________");
        print(n);
        System.out.println("_________________________________________");
    }


}
