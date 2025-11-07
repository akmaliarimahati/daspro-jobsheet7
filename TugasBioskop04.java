import java.util.Scanner;

public class TugasBioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jmlTiket, totalTiket = 0;
        double totalHarga = 0, totalPenjualanSehari = 0, diskon = 0;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan bioskop (ketik 'selesai' jika pelanggan sudah tidak ada): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("selesai")) {
                System.out.println("Pelanggan sudah cukup.");
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();
            sc.nextLine();
            if (jmlTiket < 0) {
                System.out.println("Input jumlah tiket tidak valid (negatif)");
                continue;
            }

            totalHarga = jmlTiket * hargaTiket;

            if (jmlTiket > 4 && jmlTiket < 10) {
                diskon = totalHarga * 0.1;
            } else if (jmlTiket > 10) {
                diskon = totalHarga * 0.15;
            } else {
                diskon = 0;
            }

            totalHarga -= diskon;
            totalPenjualanSehari += totalHarga;
            totalTiket += jmlTiket;
            
            System.out.println("Total yang harus dibayarkan sebesar: Rp. " + (int) totalHarga);
        } while (true);
        
        System.out.println("------------------------------------------------------");
        System.out.println("\nLaporan dalam sehari");
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total penjualan tiket sehari: Rp. " + (int) totalPenjualanSehari);
    }
}
