/*
2. Buatlah program dengan menggunakan bahasa pemrograman java untuk menginput 1 buah bilangan bulat positif dan menampilkan angka berapa saja yang dapat membagi angka tersebut tanpa sisa (gunakan perulangan do-while) [Bobot: 20]
Contoh output program:
Input Sebuah angka : 30 <inputan>
================================================
Angka yang dapat membagi 30 tanpa sisa adalah:
1, 2, 3, 5, 6, 10, 15, 30
*/

import java.util.Scanner;

public class PembagianTanpaSisa {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int bilangan_x;
    System.out.print("Input Sebuah angka : ");
    bilangan_x = scn.nextInt();
    System.out.println("===============================");
    System.out.println("Angka yang dapat membagi " + bilangan_x + " tanpa sisa adalah:");

    int angka_i = 1;
    do {
      if(bilangan_x % angka_i == 0) {
        System.out.print(angka_i);

        if(angka_i != bilangan_x) {
          System.out.print(", ");
        }
      }
      angka_i += 1;
    }while(angka_i <= bilangan_x);

    scn.close();
  }
}
