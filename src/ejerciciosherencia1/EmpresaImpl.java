package ejerciciosherencia1;

public class EmpresaImpl extends Empresa {

    private Marketing marketing;
    private Ventas ventas;
    private Ti ti;


    public EmpresaImpl(Ti ti, Ventas ventas, Marketing marketing) {
        setMarketing(marketing);
        setTi(ti);
        setVentas(ventas);
        System.out.println("Empresa Creada");


        /**
         * ##### Definición Encapsulamiento
         * Encapsulamiento los elementos de una clase deben ser controlados en el sentido de su acceso
         *
         * El concepto de encapsulamiento hace referencia a limitar el acceso a la variables de una clase,
         * de tal forma que podamos tener un mayor control sobre ellas. Normalmente utilizando los metodos get/set
         */

    }

    @Override
    public int sumaTodosLosEmpleados() {
        return this.ti.totalEmpleados() + this.ventas.totalEmpleados() + this.marketing.totalEmpleados();
    }

    @Override
    public int empleadosQueTienenUnCurso() {
        return this.marketing.cantidadEmpleadosQueTieneUnCurso() + this.ventas.cantidadEmpleadosQueTieneUnCurso() + this.ti.cantidadEmpleadosQueTieneUnCurso();
    }

    @Override
    public float porcentajeDeEmpleadosQueTieneUnCurso() {
        return (empleadosQueTienenUnCurso() * 100) / sumaTodosLosEmpleados();
    }

    //Multiplicar los que tienen un ncurso * 100/ total trabajadores

    public void setMarketing(Marketing marketing) {
        if (marketing == null) {
            throw new NullPointerException("Marketing no puede ser Nulo");
        }
        this.marketing = marketing;
    }

    public void setVentas(Ventas ventas) {
        if (ventas == null) {
            throw new NullPointerException("Ventas no puede ser Nulo");
        }
        this.ventas = ventas;
    }

    public void setTi(Ti ti) {
        if (ti == null) {
            throw new NullPointerException("Ti no puede ser Nulo");
        }
        this.ti = ti;
    }
}
