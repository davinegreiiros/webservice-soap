/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerWS;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Davi
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    public static ArrayList<Mural> recados = null;
    
    
    @WebMethod(operationName = "cadastrar")
    public void cadastrar(@WebParam(name = "codigo") int codigo, @WebParam(name = "texto")String texto,
                 @WebParam(name = "usuario")String usuario) {
        if(recados == null) recados = new ArrayList<>();
        Mural novo = new Mural(codigo,texto,usuario);
        recados.add(novo);
    }
    
    @WebMethod(operationName = "consultarTodos")
    public ArrayList<Mural> consultarTodos(){
        return recados;
        
    }
    
    @WebMethod(operationName = "removerRecados")
    public String removerRecados(Mural recado){      
      for(Mural mural:recados){
          if(mural.getCodigo() == recado.getCodigo()){
              recados.remove(mural);
          }
      }
        String mensagem = "Recado removido com sucesso";
        
        return mensagem;
    }
}
