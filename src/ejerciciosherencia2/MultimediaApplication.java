package ejerciciosherencia2;

public class MultimediaApplication {

    public static void main(String[] args) {

        String titulo = "Appetite For Destruction";
        String autor = "Guns N Roses";
        int duracion = 10;

        Multimedia multimedia = new Multimedia(titulo, autor, Formato.avi, duracion);
        System.out.println("Multimedia: " + multimedia.toString());


    }
}
