/*
SUM & AVERAGE

Deskripsi :
Diberikan kumpulan bilangan bulat dalam bentuk array:

Array A1 = [ 7, 10, 5, 3, 5, 12, 1, 9, 18, 12 ]

Tulislah sebuah program yang dapat menghitung total (SUM) dan rata-rata (AVERAGE) dari nilai-nilai dalam array tersebut. Total adalah hasil penjumlahan semua nilai, sementara rata-rata adalah nilai rata-rata dari keseluruhan elemen array, dihitung dengan membagi total dengan jumlah elemen.

Contoh Array :
*-- Array 1 --*
A1 = [7, 10, 5, 3, 5, 12, 1, 9, 18, 12]

*- Output -*
Total: 82
Rata-rata: 8.2

*-- Array 2 --*
A2 = [4, 8, 15, 16, 23, 42]

*- Output -*
Total: 108
Rata-rata: 18.0

*-- Array 3 --*
A3 = [3, 20, 9, 12, 6, 18, 21, 24]

*- Output -*
Total: 113
Rata-rata: 14.125
*/

public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {7, 10, 5, 3, 5, 12, 1, 9, 18, 12};
        double[] result = calculateSumAndAverage(arr);
        double total = result[0];
        double avg = result[1];
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + avg);
    }

    public static double[] calculateSumAndAverage(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        double avg = (double) total / arr.length;
        return new double[]{total, avg};
    }
}
