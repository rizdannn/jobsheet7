import java.util.Scanner;

public class penjualanTiketBioskop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int i = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Masukkan jumlah tiket yang dibeli oleh setiap pelanggan.");
        System.out.println("Masukkan '0' untuk mengakhiri\n");

        while (true) {
            System.out.print("Jumlah tiket dibeli hari ke " + (i + 1) + "(ketik '0' untuk mengakhiri): ");
            int jumlah = sc.nextInt();

            if (jumlah == 0) {
                break;
            }

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! Coba lagi.\n");
                continue;
            }

            double totalHarga = jumlah * HARGA_TIKET;
            double diskon = 0;

     
            if (jumlah > 10) {
                diskon = 0.15 * totalHarga; 
            } else if (jumlah > 4) {
                diskon = 0.10 * totalHarga; 
            }

            double totalBayar = totalHarga - diskon;

          
            System.out.println("Harga sebelum diskon : Rp." + (int) totalHarga);
            System.out.println("Diskon               : Rp." +(int) diskon);
            System.out.println("Total bayar          : Rp." + (int) totalBayar);


            totalTiketTerjual += jumlah;
            totalPenjualan += totalBayar;

            i++;
        }
      
       
        System.out.println("\n=== Rangkuman Penjualan  ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp." + (int) totalPenjualan);

       
    }
}
