import java.util.Scanner;

public class timMinFor {
    //tim min(max)
    public static void main(String[] args) {
        int[] array1 = {100,50,2,99,100,5};
        // tim min
        int min=array1[0];
        for (int i=0;i<array1.length;i++){
            if (min>array1[i]){
                min=array1[i];
            }
        }
        System.out.println("min ="+min);
    }
}
