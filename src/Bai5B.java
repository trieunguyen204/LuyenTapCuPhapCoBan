import java.util.Scanner;

public class Bai5B {
    // kiem tra so nguyen to
    // so nguyen to : lon hon 1+ chi chia het cho 1 va chinh no
    public static boolean isPrime(int prime){
        boolean isPrimeIs =true;
        for (int i=2;i<= Math.sqrt(prime);i++){
            if (prime%i==0){
                return !isPrimeIs;
            }
        }
        if (prime <= 1) {
            return false;
        }

        return isPrimeIs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n can kiem tra: n=");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("So nguyen n la sau nguyen to? :"+isPrime(n));
    }
}
