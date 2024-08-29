import java.util.Scanner;

public class PendapatanObjekWisata {
  public static void main(String[] args) {
    int harga_d, harga_a;
    int jumlah_d, jumlah_a;

    Scanner scn = new Scanner(System.in);
    harga_d = 10000;
    harga_a = 5000;

    System.out.println("Harga Tiket Pengunjung Dewasa = " + harga_d);
    System.out.println("Harga Tiket Pengunjung Anak-Anak = " + harga_a);
    System.out.print("Jumlah Pengunjung Dewasa : ");
    jumlah_d = scn.nextInt();
    System.out.print("Jumlah Pengunjung Anak-Anak : ");
    jumlah_a = scn.nextInt();

    int pendapatan_d = harga_d * jumlah_d;
    int pendapatan_a = harga_a * jumlah_a;
    int total_pendapatan = pendapatan_d + pendapatan_a;
    System.out.println("Total Pendapatan = " + total_pendapatan);

    scn.close();
  }
}
