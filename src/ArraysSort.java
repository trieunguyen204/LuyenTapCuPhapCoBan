import java.util.Arrays;

public class ArraysSort {
    public static void arraysSort(){
        int[] arr={5,1,4,2,3,6,7,8,9};

        Arrays.sort(arr); // chi sap xep tang dan


        // sap xep giam dan = dao vi tri cua i cho (n-1)-i
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

       /* for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        // in mang
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        arraysSort();
    }
}
