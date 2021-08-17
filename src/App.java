import controller.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller("jdbc:mysql://localhost:3306/proyectos");    
    
 controller.req1();
 controller.printReq1();
 controller.req2();
 controller.printReq2();
 controller.req3();
 controller.printReq3();

    }
}
