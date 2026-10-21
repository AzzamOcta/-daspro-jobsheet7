import java.util.Scanner;

public class JuraganParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        
        do {
            System.out.print("Masukkan jenis kendaraan: mobil(1), motor(2), keluar(0): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;

                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total bayar: " + total);

    }
}