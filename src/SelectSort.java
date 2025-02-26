public class SelectSort {

    public static void selectSort(){
        int[] arr = {52,10,1,2,3,4,8,7,9,1000,222,555,4};

        // sap xep
        // b1: duyet tu [0;n-2] (vi khi duyet den n-2 thi n-1 tu dung vi tri)
        // b2: tim  min tu [i+1;n-1]
        // b3: thay doi vi tri neu can
        for (int i =0;i<arr.length-1;i++){
            // gs indexMin = i;
            int indexMin=i;

            // tim min
            for (int j=i+1;j< arr.length;j++){
                if (arr[indexMin]>arr[j]){
                    indexMin=j;
                }
            }

            // neu indexMin != i thi phai doi vi tri
            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin]=arr[i];
                arr[i]=temp;
            }
        }

        // in
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        System.out.print("Mang:");
        selectSort();
    }
}
