package algoritmos;

public class AlgoritmoPalabraPalindrome {

    static boolean palindromo(String[] palabra) {
        //Quitar espacios y convertirlo a minusculas para hacer las comparaciones
        boolean resultado = true;

        for (String palabraPalindromo : palabra) {
            //TODO: Mejorar algoritmo para que permita ingresar oraciones palindromes.
            String modificado = palabraPalindromo.replaceAll(" ", "").toLowerCase();
            int i = 0;
            int largoPalabra = modificado.length();
            while (i < largoPalabra / 2) {
                if (modificado.charAt(i) != modificado.charAt(modificado.length() - 1 - i)) {
                    System.out.println("Palabra " + modificado + ", no es palindromo");
                    resultado = false;
                }
                i++;
            }
            System.out.println("Palabra " + modificado + ", es palindromo");
        }
        return resultado;
    }

    // Concepto de no tener varios return, solo aplicar uno en una funcion

    public static void main(String[] args) {
        String[] palabras = {"OSO", "RECONOCER", "RODRIGO"};
        palindromo(palabras);

    }
}

