package model;

public class Req1 {
    private int total;
    private int idProyecto;
    private String pagado;
    private String proveedor;

    public Req1(int total, int idProyecto, String pagado, String proveedor) {
        // TODO inicializar los atributos usando los parametros
        this.total = total;
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.proveedor = proveedor;
    }
    // TODO crear el toString usando el autogenerador, (click derecho-+

    @Override
    public String toString() {
        return "Req1 [idProyecto=" + idProyecto + ", pagado=" + pagado + ", proveedor=" + proveedor + ", total=" + total
                + "]";
    }
    

}
