import java.util.Scanner;

public class Bai5C {
    public static void print(int n){
        for (int i=1;i<=n;i++){
            System.out.println("Bang cuu chuong :"+i);
            for (int j=1;j<=10;j++){
                System.out.print(i+"x"+j+"="+(i*j));
                System.out.println();
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Nhap tu 1 den 9:");
        int number=scanner.nextInt();

        System.out.println("bang cuu chuong tu tu 1 den "+number);
        print(number);
    }
}
