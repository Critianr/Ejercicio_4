package model;

public class Req2 {
    private String fechaInicio;
    private int financiable;
    private int estrato;
    private double porcetaje;


public Req2(String fechaInicio, int financiable, int estrato, double porcetaje) {
        this.fechaInicio = fechaInicio;
        this.financiable = financiable;
        this.estrato = estrato;
        this.porcetaje = porcetaje;
    }


@Override
public String toString() {
    return "Req2 [estrato=" + estrato + ", fechaInicio=" + fechaInicio + ", financiable=" + financiable + ", porcetaje="
            + porcetaje + "]";
}






}
