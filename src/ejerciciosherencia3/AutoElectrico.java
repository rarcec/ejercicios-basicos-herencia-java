package ejerciciosherencia3;

public class AutoElectrico extends Auto{

    public AutoElectrico(String color, String tipoCombustible, String marca) {
        super(color, tipoCombustible, marca);
    }

    @Override
    public String sonido() {
        return "RING RING";
    }

    public String sonidoAutoElectrico(){
        return "RING RING";
    }


}
