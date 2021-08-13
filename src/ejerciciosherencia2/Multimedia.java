package ejerciciosherencia2;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private Integer duracion;

    public Multimedia(String titulo, String autor, Formato formato, Integer duracion) {

        if (equals(titulo, autor)) {
            System.out.println("El titulo y el autor son iguales");
            throw new RuntimeException("El titulo y el autor son iguales");
        } else {
            this.titulo = titulo;
            this.autor = autor;
            this.formato = formato;
            this.duracion = duracion;
        }

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public Integer getDuracion() {
        return duracion;
    }

    private boolean equals(String autor, String titulo) {
        return autor.equals(titulo);
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duracion=" + duracion +
                '}';
    }
}
