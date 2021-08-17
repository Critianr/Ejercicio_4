package model;

public class Req3 {
    private int idProyecto;
    private String pagado;
    private String clasificacion;
    public Req3(int idProyecto, String pagado, String clasificacion) {
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.clasificacion = clasificacion;
        //TODO inicializar los atributos usando los parametros
    }
    //TODO crear el toString usando el autogenerador, (click derecho->source action->generate toString )
    @Override
    public String toString() {
        return "Req3 [clasificacion=" + clasificacion + ", idProyecto=" + idProyecto + ", pagado=" + pagado + "]";
    }
    
   


}
