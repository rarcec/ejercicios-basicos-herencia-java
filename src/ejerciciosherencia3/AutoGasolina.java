package ejerciciosherencia3;

public class AutoGasolina extends Auto{

    public AutoGasolina(String color, String tipoCombustible, String marca) {
        super(color, tipoCombustible, marca);
    }

    @Override
    public String sonido() {
        return "RUN RUN";
    }

    public String sonidoAutoGasolina(){
        return "RUN RUN";
    }
}
