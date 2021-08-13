package ejerciciosherencia1;

import java.util.List;

/**
 * Herencia de TI con Departamento (Clase Padre), hereda todos los metodos
 */
public class Ti extends DepartamentoImpl {

    public Ti(List<Empleado> empleados, String name) {
        super(empleados, name);
    }

    @Override
    public int salario() {
        // 50%
        //return super.salario() * 50 / 100 + super.salario();
        return 100;
    }

}
