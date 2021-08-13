package ejerciciosherencia3;

public class AutoDiesel extends Auto{

    public AutoDiesel(String color, String tipoCombustible, String marca) {
        super(color, tipoCombustible, marca);
    }

    @Override
    public String sonido() {
        return "ROM ROM";
    }

    public String sonidoAutoDiesel(){
        return "ROM ROM";
    }
}
