import java.util.Scanner;

public class SegitigaAngka3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Masukkan berapa banyak baris : ");
    int n_baris = scn.nextInt();

    int bilangan = 0;

    for(int b=1; b <= n_baris; b++) {
      for(int k=n_baris-b-1; k >= 0; k--) {
        System.out.print("  ");
      }
      for(int k=1; k <= b; k++) {
        System.out.print(bilangan + " ");
        bilangan += 1;
        bilangan %= 10;
      }
      System.out.println();
    }

    scn.close();
  }
}
