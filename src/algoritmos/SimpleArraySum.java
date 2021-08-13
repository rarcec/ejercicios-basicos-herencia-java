package algoritmos;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {


     public static int arraySum(List<Integer> ar){
         int suma = 0;
         for(int i = 0; i < ar.size(); i++){
             suma += ar.get(i);
         }
         System.out.println("Suma Total: " + suma);
         return suma;
     }
    public static void main(String[] args) {

        List<Integer> ar = Arrays.asList(3, 1, 4);
        arraySum(ar);
    }
}
