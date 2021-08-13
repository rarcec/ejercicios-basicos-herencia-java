package ejerciciosherencia1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaApplication {

    public static void main(String[] arg) {
        /*
        Desarrollar un programa que conociendo para cada departamento de una empresa, el total de trabajadores
        y la cantidad de ellos que se matricularon en un curso de programacion, calcula el % que representa el
        total de trabajadores.
         - Dato: La empresa tiene 3 departamentos
         */

        // empleados > 2
        // departamentos = 3
        // cantidad de matriculados en un curso de programacion


        /*
            Tarea: La empresa exige que tenga un depto de ventas, marketing, TI
            Dejar topdo el programa instanciado
            Crear la empresa
            crear depto,
            crear empleados
            crear curso
            Estudio This.

         */

        List<Empleado> empleadosDeptoMarketing = new ArrayList<>();
        List<Empleado> empleadosDeptoTi = new ArrayList<>();
        List<Empleado> empleadosDeptoVentas = new ArrayList<>();
        List<Empleado> empleadosDeptoRecursosHumanos = new ArrayList<>();
        List<Empleado> empleadosDeptoUx = new ArrayList<>();
        List<Departamento> departamentos = new ArrayList<>();

        /**
         * Depto de Marketing
         */
        Empleado empleado = new Empleado("Alejandro");
        empleado.setCurso(new Curso());
        empleadosDeptoMarketing.add(empleado);
        Marketing marketing = new Marketing(empleadosDeptoMarketing, "Marketing");
        System.out.println("Salario Marketing: " + marketing.salario());

        /**
         * Depto de TI
         */
        Empleado empleadoDeptoTi = new Empleado("Scarlett");
        empleadosDeptoTi.add(empleadoDeptoTi);
        Ti ti = new Ti(empleadosDeptoTi, "TI");
        System.out.println("Salario TI: " + ti.salario());
        ti.salario("El salario es: ");
        System.out.println("Salario Entero:" + ti.salario(130));

        /**
         * Depto de Ventas
         */
        Empleado empleadoDeptoVentas = new Empleado("Ricardo Perez");
        empleadosDeptoVentas.add(empleadoDeptoVentas);
        Ventas ventas = new Ventas(empleadosDeptoVentas, "Ventas");
        System.out.println("Salario Ventas: " + ventas.salario());

        /**
         * Depto de Recursos Humanos
         */
        Empleado empleadoDeptoRecursosHumanos = new Empleado("Juan Soto");
        empleadosDeptoRecursosHumanos.add(empleadoDeptoRecursosHumanos);
        RecursosHumanos recursosHumanos = new RecursosHumanos(empleadosDeptoRecursosHumanos, "Recursos Humanos");
        System.out.println("Salario Recursos Humanos: " + recursosHumanos.salario());

        /**
         * Depto de UX
         */
        Empleado empleadoDeptoUx = new Empleado("Felipe Soto");
        empleadosDeptoUx.add(empleadoDeptoUx);
        Ux ux = new Ux(empleadosDeptoUx, "UX");
        System.out.println("Salario UX: " + ux.salario());

        /**
         * Agregar Departamentos
         */
        departamentos.add(marketing);
        departamentos.add(ti);
        departamentos.add(ventas);
        departamentos.add(recursosHumanos);
        departamentos.add(ux);

        /**
         * Crear Empresa
         */
        Empresa empresaImpl2 = new Empresa2Impl(departamentos);
        Empresa empresaImpl = new EmpresaImpl(ti, ventas, marketing);
        new AsociacionEmpresas(empresaImpl2);

        /**
         * Salida del Programa
         */
        System.out.println("Total de empleados Empresa 2: " + empresaImpl2.sumaTodosLosEmpleados());
        System.out.println("Cantidad de Empleados que tienen un curso Empresa 2: " + empresaImpl2.empleadosQueTienenUnCurso());
        System.out.println("Porcentaje de Trabajadores que tienen un curso Empresa 2: " + empresaImpl2.porcentajeDeEmpleadosQueTieneUnCurso());

        System.out.println("Total de empleados: " + empresaImpl.sumaTodosLosEmpleados());
        System.out.println("Cantidad de Empleados que tienen un curso: " + empresaImpl.empleadosQueTienenUnCurso());
        System.out.println("Porcentaje de Trabajadores que tienen un curso: " + empresaImpl.porcentajeDeEmpleadosQueTieneUnCurso());


    }
}
