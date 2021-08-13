package ejerciciosherencia3;

import java.util.List;

public class Concesionaria {

    private List<Auto> auto;

    public Concesionaria(List<Auto> auto) {
        this.auto = auto;
    }

    public int cantidadDeAutosDiesel() {

        int contador = 0;
        for (Auto auto : auto) {
            if (auto instanceof AutoDiesel) {
                contador++;
            }
        }
        return contador;
    }

    public int cantidadDeAutosElectricos() {
        int contador = 0;
        for (Auto auto : auto) {
            if (auto instanceof AutoElectrico) {
                contador++;
            }
        }
        return contador;
    }

    public int cantidadAutosGasolina() {
        int contador = 0;
        for (Auto auto : auto) {
            if (auto instanceof AutoGasolina) {
                contador++;
            }
        }
        return contador;
    }

    public void imprimirSonidosDeAutos() {

        for (Auto auto : this.auto) {
            if (auto instanceof AutoDiesel) {
                AutoDiesel autoDiesel = (AutoDiesel) auto;
                System.out.println("Sonido Auto Diesel: " + autoDiesel.sonidoAutoDiesel());
            } else if (auto instanceof AutoGasolina) {
                AutoGasolina autoGasolina = (AutoGasolina) auto;
                System.out.println("Sonido Auto Gasolina: " + autoGasolina.sonidoAutoGasolina());
            } else if (auto instanceof AutoElectrico) {
                AutoElectrico autoElectrico = (AutoElectrico) auto;
                System.out.println("Sonido Auto Diesel: " + autoElectrico.sonidoAutoElectrico());
            }
        }
    }

}
