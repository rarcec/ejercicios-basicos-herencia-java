package ejerciciosherencia1;

import java.util.List;

/**
 * Clase Plantilla Departamento;
 * Esta clase no puede ser instanciada o creada ya que mediante herencia nos permite solo tener 3 departamentos
 * Ventas - TI - Marketing
 */
public abstract class DepartamentoImpl implements Departamento {

    private final int salarioBase = 500;

    private String name;
    private List<Empleado> empleados;

    public DepartamentoImpl(List<Empleado> empleados, String name) {
        this.name = name;
        this.empleados = empleados;
    }

    @Override
    public int salario() {
        return salarioBase;
    }

    //funcion que permite devolver un String + salario
    // Sobre Carga de metodos.

    @Override
    public int totalEmpleados() {
        return this.empleados.size();
    }

    public String saludo() {
        return "Hola";
    }

    public String getName() {
        return name;
    }

    /**
     * Metodo que calcula la cantidad de empleados que tiene un curso
     */
    @Override
    public int cantidadEmpleadosQueTieneUnCurso() {

        int cantidad = 0;
        for (Empleado empleado : this.empleados) {
            if (empleado.empleadoTieneCurso()) {
                cantidad += 1;
            } else {
                System.out.println("Empleado no tiene curso: " + empleado.getName());
            }
/*            if (empleado.getCurso() != null) {
                cantidad += 1;
            } else {
                System.out.println("Empleado no tiene curso: " + empleado.getName());
            }*/
        }
        return cantidad;
    }



}
