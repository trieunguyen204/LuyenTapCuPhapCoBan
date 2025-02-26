public class searchMaxFor {
    public static int maxArray(){
        int[] arr={4,5,4,7,1,2,3,6,4,5,8,7,1,4,5,6,45,111111,2121,11,45};
        int max = arr[0];

        // tim max = for
        for (int i =0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("Max in arr : Max ="+maxArray());
        System.out.println("-----------------------");
    }
}
