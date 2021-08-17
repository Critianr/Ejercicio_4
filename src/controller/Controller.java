package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Req1;
import model.Req2;
import model.Req3;
import service.JDBCService;

public class Controller {
    private ArrayList<Req1> req1s;
    private ArrayList<Req2> req2s;
    private ArrayList<Req3> req3s;
    private JDBCService conectorDB;

    public Controller(String url) {
        super();
        this.req1s = new ArrayList<>();
        this.req2s = new ArrayList<>();
        this.req3s = new ArrayList<>();
        // TODO inicializar las listas de reqs
        conectorDB = new JDBCService(url);
    }

    public void req1() {
        ResultSet resultado1 = conectorDB.getReq1DB();
        try {
            while (resultado1.next()) {
                Req1 requeriemiento1 =  new Req1(resultado1.getInt("total"), resultado1.getInt("ID_Proyecto"), resultado1.getString("pagado") ,resultado1.getString("Proveedor"));
                req1s.add(requeriemiento1);
            }
        } catch (SQLException e) {
            System.out.println("ruta del error");
            e.printStackTrace();
        }
        
    }
    public void req2() {
        // TODO logica de llenado de la lista req2s
        ResultSet resultado2 = conectorDB.getReq2DB();
        try{
            while (resultado2.next()) {
                Req2 requerimiento2 = new Req2(resultado2.getString("Inicio"), resultado2.getInt("financiable"), resultado2.getInt("estrato"), resultado2.getDouble("Proyecto.Porcentaje_Cuota_Inicial * 100"));
                req2s.add(requerimiento2);
                
            }
        }catch (SQLException e){
            System.out.println("ruta del error");
            e.printStackTrace();
        }
    }

    public void req3() {
        // TODO logica de llenado de la lista req3s
        ResultSet resultado3 = conectorDB.getReq3DB();
        try{
            while (resultado3.next()) {
                Req3 requerimiento3 = new Req3(resultado3.getInt("Proyecto.ID_Proyecto"), resultado3.getString("pagado"), resultado3.getString("clasificacion"));
                req3s.add(requerimiento3);
                
            }
        }catch (SQLException e){
            System.out.println("ruta del error");
            e.printStackTrace();
        }
    }

    public void printReq1() {
        for (Req1 req1 : req1s) {
            System.out.println(req1);
        }
    }

    public void printReq2() {
        for (Req2 req2 : req2s) {
            System.out.println(req2);
        }
    }

    public void printReq3() {
        for (Req3 req3 : req3s) {
            System.out.println(req3);
        }
    }
}
