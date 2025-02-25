import java.util.Scanner;

public class Bai4 {
    // nhap vao so 1-7, sau do hien thi thu 1: cn 2: t2 ..
    public static void nhapVaHienThi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so tu 1 den 7:");
        int number = scanner.nextInt();
        scanner.close();// dong nhap

        switch (number) {
            case 1:
                System.out.println("CN");
                break;
            case 2:
                System.out.println("\nThu 2");
                break;
            case 3:
                System.out.println("\nThu 3");
                break;
            case 4:
                System.out.println("\nThu 4");
                break;
            case 5:
                System.out.println("\nThu 5");
                break;
            case 6:
                System.out.println("\nThu 6");
                break;
            case 7:
                System.out.println("\nThu 7");
                break;
            default:
                System.out.println("Nhap ngu vllllllllL!");
        }
    }

    public static void main(String[] args) {
        nhapVaHienThi();
    }

}
