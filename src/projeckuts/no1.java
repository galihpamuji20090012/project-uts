
package projeckuts;
public class no1 {
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) { 
            int key = A[i]; 
            int j = i - 1; 
            while((j >= 0) && (A[j] > key)) { 
                A[j + 1] = A[j];
                j--; 
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {3 ,10 ,4 ,2 ,8 ,13};
        no1.tampil(A);
        no1.insertionSort(A);
        no1.tampil(A); 
        
        System.out.println();
        System.out.println("galih pamuji");
    }
}

