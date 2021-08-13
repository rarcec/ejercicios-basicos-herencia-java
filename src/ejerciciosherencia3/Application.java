package ejerciciosherencia3;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Una concesionaria recibe 3 tipos de autos, Electrico, Diesel, Gasolina
        // Los autos tienen color, tipo de combustible, marca
        // Queremos saber cuantos autos de cada tipo tienen

        AutoElectrico autoElectrico = new AutoElectrico("Rojo", "Shell", "Toyota");

        AutoDiesel autoDiesel = new AutoDiesel("Gris", "Nafta", "Chevrolet");
        AutoGasolina autoGasolina = new AutoGasolina("morado", "gasolina", "Honda");

        List<AutoGasolina> listaAutosGasolina = new ArrayList<>();
        listaAutosGasolina.add(autoGasolina);

        List<AutoDiesel> listaAutoDiesel = new ArrayList<>();
        listaAutoDiesel.add(autoDiesel);

        List<AutoElectrico> listaAutosElectricos = new ArrayList<>();

        listaAutosElectricos.add(autoElectrico);


        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(autoElectrico);
        listaAutos.add(autoDiesel);
        listaAutos.add(autoElectrico);

        Concesionaria concesionaria = new Concesionaria(listaAutos);

        System.out.println("Cantidad De autos Electricos: " + concesionaria.cantidadDeAutosElectricos());
        System.out.println("Cantidad De autos Diesel: " + concesionaria.cantidadDeAutosDiesel());
        System.out.println("Cantidad De autos Gasolina: " + concesionaria.cantidadAutosGasolina());
        //concesionaria.imprimirSonidosDeAutos();
        System.out.println("Sonido autos Electricos: " + autoDiesel.sonido());
        System.out.println("Sonido autos Diesel: " + autoElectrico.sonido());
        System.out.println("Sonido Gasolina: " + autoGasolina.sonido());


        // Tarea
        // Hacer el algoritmos de sonidos de autos con un solo for. Listo
        // Hacer la funcion sonido en Auto y redefinirla por cada tipo de Auto (La funcion sonido es Abstracta) Listo
        // Aplicar estos conceptos en el ejercicio anterior de Empresa.
        // Algoritmo y traceo de la palabra Palindrome Ej: OSO

    }

}
