import java.util.Scanner;

public class Bai5A {
    // tinh tong cac so tu 1 den n
    public static int tinhTong(int number){
        int sum=0;
        // for
        for (int i=1;i<=number;i++){
            sum+=i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("Tong cac so tu nhien tu 1 den n la : sum ="+tinhTong(n));

    }
}
