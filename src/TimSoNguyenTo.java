public class TimSoNguyenTo {

    public static boolean kiemTra(int number){
        boolean isPrime=true;

        // so nguyen to: chi chia het cho 1 va chinh no, lon hon 1
        // n <=1 ktm, n=2 tm n=3 tm
        // n>3(else) : n%i==0 return false;
        //[2;n-1]
        // n = a.b (hoac c^2); a<c
        // 8=2.4; 2<can(8)

        if (number <= 1) {
            isPrime=false;
        } else if (number==2 || number==3) {
            isPrime=true;
        }else {
            for (int i =2;i<=Math.sqrt(number);i++){
                if (number % i == 0) {
                    isPrime=false;
                }
            }
        }

        return isPrime;
    }


    public static void main(String[] args) {
        // tim so nguyen to trong mang

        // nhap mang
        int[] arr1 = {100,5,4444,666,21,10,0,2,3,9};

        // in mang
        System.out.print("Mang la:");
        for (int i:arr1){
            System.out.print(i +" ");
        }
        System.out.println();

        // tim so nguyen to trong mang
        // duyet -> kiem tra
        System.out.print("Cac so nguyen to trong mang :");
        for (int i=0;i<arr1.length ; i++){
            if (kiemTra(arr1[i])){
                System.out.print(arr1[i] +" ");
            }

        }
    }
}
