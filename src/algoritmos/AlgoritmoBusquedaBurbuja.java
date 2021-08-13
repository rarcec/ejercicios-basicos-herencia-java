package algoritmos;

public class AlgoritmoBusquedaBurbuja {

    // Entrada sera de 9, 8, 7, 6, 5, 1, 2, 3, 4

    public static void burbuja(int[] A) {

        int j = 0;
        int aux = 0;
        for (int i = 0; i < A.length - 1; i++) {
            System.out.println(j);
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] entrada = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        burbuja(entrada);
    }

    // Cuando es una palabra palindrome
    // OSO -


}
