public class ElemenArray {
  public static void main(String[] args) {
    int[] arr = {20, 23, 25, 21, 29};

    for(int i=0; i < arr.length; i++) {
      // index (i) = 0 sampai 4
      int nilai = arr[i];
      System.out.println("Isi elemen dengan indeks " + i + " : " + nilai);
    }
  }
}
