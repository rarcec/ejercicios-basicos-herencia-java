package ejerciciosherencia1;

import java.util.List;

/**
 * Herencia de Ventas con Departamento (Clase Padre), hereda todos los metodos
 */

public class Ventas extends DepartamentoImpl {

    public Ventas(List<Empleado> empleados, String name) {
        super(empleados, name);
    }

    @Override
    public int salario() {
        //60%
        return super.salario() * 60 / 100 + super.salario();
    }

}
