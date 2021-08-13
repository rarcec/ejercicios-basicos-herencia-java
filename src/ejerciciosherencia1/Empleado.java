package ejerciciosherencia1;

public class Empleado {

    private String name;
    private Curso curso;

    public Empleado(String name){
        System.out.println("Bienvenid@ emplead@ " + name);
        this.name = name;
    }

/*    public boolean empleadoTieneCurso(){
        boolean tieneCurso = true;
        if(curso == null){
            System.out.println("Empleado no tiene curso");
            tieneCurso = false;
        }
        return tieneCurso;
    }*/
    //TODO: Escribir en papel la depuracion de el algoritmo de arriba

    /**
     * Metodo que nos permite validar si el empleado tiene un curso.
     * @return boolean
     */

    public boolean empleadoTieneCurso() {
        return this.curso != null;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Curso getCurso() {
        return curso;
    }
}
