import proxy.BanqueWS;
import proxy.Banqueservice;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        Banqueservice stub = new BanqueWS().getBanqueservicePort();
        System.out.println(stub.convert(7600));
        Compte cp= stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
