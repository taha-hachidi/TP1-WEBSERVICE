package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//Pojo : une simple classe java (plain old java object)

@WebService(serviceName = "Banquews")
public class BankService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name="montant") double mt){
        return mt*10.54;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name="code")int code){
        return new Compte(code,Math.random(),new Date());
    }

    @WebMethod(operationName = "listCompte")
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1,Math.random(),new Date()),
        new Compte(2,Math.random(),new Date()),
        new Compte(3,Math.random(),new Date())
        );
    }


}
