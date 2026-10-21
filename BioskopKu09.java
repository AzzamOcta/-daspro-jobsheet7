import java.util.Scanner;

public class BioskopKu09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tiket, total, potongan;
        double totalHargaSeHari = 0;
        double totalTiketSeHari = 0;
        double harga = 50000;
        double diskon;
        int i = 1;
        String adaPelanggan;
        String tumbal;
        // String nama;

            System.out.println("======= PROGRAM MENGHITUNG PENDAPATAN HARIAN =======");

            do {
                System.out.println("\n'Ya' jika ada pelanggan, 'Tidak' jika bioskop tutup:");
                adaPelanggan = sc.nextLine();
                // tumbal = sc.nextLine();
                
                
                if (adaPelanggan.equalsIgnoreCase("ya")) {
                    System.out.print("Masukkan jumlah pemasukan tiket ke-"+ i +": ");
                    tiket = sc.nextDouble();
                    
                    if (tiket < 0) {
                        
                    }

                    if (tiket >= 10) {
                        diskon = 0.15;
                    } else if (tiket >= 4) {
                        diskon = 0.10;
                    } else if (tiket >= 0) {
                        diskon = 0;
                    } else {
                        tumbal = sc.nextLine();
                        System.out.println("jumlah tiket tidak valid. masukkan ulang tiket");
                        continue;
                    }

                } else  {
                    System.out.println("bioskop telah tutup");
                    break;
                }
                
                potongan = (harga * tiket) * diskon;
                total = harga * tiket - potongan;
                System.out.println(total);
                
                totalTiketSeHari = totalTiketSeHari + tiket;
                totalHargaSeHari = totalHargaSeHari + total;
                
                tumbal = sc.nextLine();
                i++;
            } while (adaPelanggan.equalsIgnoreCase("ya"));

        System.out.println("Total tiket terjual hari ini: " + (int)totalTiketSeHari);
        System.out.println("Total pendapatan hari ini: " + (int)totalHargaSeHari);

        System.out.println("\n====== YES PULANG ======");
    }
}
