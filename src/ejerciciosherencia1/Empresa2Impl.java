package ejerciciosherencia1;

import java.util.List;

public class Empresa2Impl extends Empresa {

    private List<Departamento> departamentos;

    @Override
    public int sumaTodosLosEmpleados() {

/*      int totalEmpleadosMarketing = 0;
        int totalEmpleadosVentas = 0;
        int totalEmpleadosTi = 0;
        int totalEmpleadosRRHH = 0;*/

        int sumaTotalEmpleados = 0;

        for (Departamento departamento : departamentos) {
            sumaTotalEmpleados += departamento.totalEmpleados();

        /*  if (departamento instanceof Marketing) {
                Marketing marketing = (Marketing) departamento;
                totalEmpleadosMarketing = marketing.totalEmpleados();
            } else if (departamento instanceof Ventas) {
                Ventas venta = (Ventas) departamento;
                totalEmpleadosVentas = venta.totalEmpleados();
            } else if (departamento instanceof Ti) {
                Ti ti = (Ti) departamento;
                totalEmpleadosTi = ti.totalEmpleados();
            } else if (departamento instanceof RecursosHumanos) {
                RecursosHumanos recursosHumanos = (RecursosHumanos) departamento;
                totalEmpleadosRRHH = recursosHumanos.totalEmpleados();
            }*/
        }
        //return totalEmpleadosMarketing + totalEmpleadosVentas + totalEmpleadosTi + totalEmpleadosRRHH;
        return sumaTotalEmpleados;
    }

    @Override
    public int empleadosQueTienenUnCurso() {
        int totalEmpleadosQueTienenUnCurso = 0;
        for (Departamento departamento : departamentos) {
            totalEmpleadosQueTienenUnCurso += departamento.cantidadEmpleadosQueTieneUnCurso();
        }
        /*for (Empleado empleado : empleados) {
            if(empleado.empleadoTieneCurso()){
                totalEmpleadosQueTienenUnCurso += 1;
            }
        }*/
        return totalEmpleadosQueTienenUnCurso;

    }

    @Override
    public float porcentajeDeEmpleadosQueTieneUnCurso() {
        return (empleadosQueTienenUnCurso() * 100) / sumaTodosLosEmpleados();
    }

    public Empresa2Impl(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    //Tarea
    /**
     *  Crear departamento de RRHH. OK
     *  Agregar a esta empresa el departamento de RRHH OK
     *  En Metodo sumaTodosLosEmpleados se deben contemplar los trabajdores de RRHH. OK
     *  Refactorizar Metodo sumaTodosLosEmpleados sin condicionales y solo 1 for. OK
     *  Crear Depto de UX y se lo agregamos a la Empresa. OK
     *  Evaluar el cambio de codigo para el metodo sumaTodosLosEmpleados.
     *
     */


}
