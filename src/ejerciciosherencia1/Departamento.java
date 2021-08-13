package ejerciciosherencia1;

public interface Departamento {
    int salario();

    //funcion que permite devolver un String + salario
    // Sobre Carga de metodos.

    int totalEmpleados();

    int cantidadEmpleadosQueTieneUnCurso();

    default int salario(String parametro) {
        int salario = salario();
        System.out.println(parametro + salario);
        return salario;
    }

    default int salario(Integer parametro) {
        int salario = salario();
        return salario + parametro;
    }
}
