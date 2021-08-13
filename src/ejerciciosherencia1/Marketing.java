package ejerciciosherencia1;

import java.util.List;

/**
 * Herencia de Marketing con Departamento (Clase Padre), hereda todos los metodos
 */

public class Marketing extends DepartamentoImpl {

    public Marketing(List<Empleado> empleados, String name) {
        super(empleados, name);
    }

/*    @Override
    public int salario() {
        // 20% mas de salario
        return super.salario() * 20 / 100 + super.salario();
    }*/


}
