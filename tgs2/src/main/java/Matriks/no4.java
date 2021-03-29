package Matriks;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args){
        int i, j, m, n;
        int matriks[][] = new int[2][3];
        int transpose[][] = new int[3][2];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris Matriks : ");
        m = scan.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks : ");
        n = scan.nextInt();
        System.out.print("Masukkan Elemen Matriks : ");
        for(i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks : ");
        for(i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose matriks: ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    
}
