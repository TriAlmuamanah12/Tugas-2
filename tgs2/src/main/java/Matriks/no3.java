package Matriks;
public class no3 {
    public static void main(String args[]){
        int [][] A = {
            {3, 4, 5},
            {2, 6, 7}
                
        };
        int [][] B = {
            {3, 7},
            {8, 5},
            {3, 1}
        };
        
        if(A[0].length == B.length){
            int [][] C = new int[A.length][B[0].length];
            for(int i=0; i<A.length; i++) {
                 for(int j=0; j<B[0].length; j++) {
                     for(int k=0; k<A[0].length; k++) {
                         C[i][j] += A[i][k] * B[k][j];
                     }
                 }
            }
            for(int[] c: C) {
                for(int i: c) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Ukuran kolom A tidak sama dengan baris b");
        }
    }
    
}
