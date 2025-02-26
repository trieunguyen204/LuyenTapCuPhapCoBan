public class sumInArray {
    // pt tinh sum in array
    public static int sumArray(){
        int sum=0;

        // khoi tao array
        int[] arr ={1,2,3,5,4,6,7,8,9,4,5,6,3,5,4};

        // tinh tong
        for (int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }

        return sum;
    }
    public static void print(){
        int[] arr ={1,2,3,5,4,6,7,8,9,4,5,6,3,5,4};


        // in
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.print("Arr:");
        print();
        System.out.println("\nTong in arr: sum ="+sumArray());
        System.out.println("-------------------------------------");

    }
}
