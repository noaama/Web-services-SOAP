import jakarta.xml.ws.Endpoint;
import ws.Banqueservice;

public class ServerJws {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new Banqueservice());
        System.out.println("Web service déployé sur  http://0.0.0.0:9191/");
    }

}
