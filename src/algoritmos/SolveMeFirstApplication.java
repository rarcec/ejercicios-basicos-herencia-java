package algoritmos;

public class SolveMeFirstApplication {

    static int solveMeFirst(int a, int b) throws Exception {

        if (a <= 1 && b <= 1000) {
            System.out.println("Problemas de contraints: a = " + a + " b = " + b);
            throw new Exception("Problemas de Constraints");
        }
        System.out.println("La suma de a + b = " + (a + b));
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        solveMeFirst(50, 30);
    }
}
