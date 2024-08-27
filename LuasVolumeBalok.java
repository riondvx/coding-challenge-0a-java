import java.util.Scanner;

public class LuasVolumeBalok {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int panjang, lebar, tinggi, volume, luas_permukaan;

    System.out.print("Masukkan Panjang Balok : ");
    panjang = scn.nextInt();
    System.out.print("Masukkan Lebar Balok : ");
    lebar = scn.nextInt();
    System.out.print("Masukkan Tinggi Balok : ");
    tinggi = scn.nextInt();

    volume = panjang * lebar * tinggi;
    luas_permukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

    System.out.println("Volume = " + volume);
    System.out.println("Luas Permukaan = " + luas_permukaan);

    scn.close();
  }
}
