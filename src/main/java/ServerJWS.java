import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args){

        Endpoint.publish("http://localhost:9191/",new BankService());

        System.out.println("Web service déployé sur http://localhost:9191");

    }
}
