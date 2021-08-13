package ejerciciosherencia3;

public abstract class Auto {

    private String color;
    private String tipoCombustible;
    private String marca;

    public Auto(String color, String tipoCombustible, String marca) {
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.marca = marca;
    }

    public abstract String sonido();


}
