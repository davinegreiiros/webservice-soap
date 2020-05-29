/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recadosclient;

import serverws.Mural;

/**
 *
 * @author Davi
 */
public class NewMain {

    public static void main(String[] args) {
        
        try {
            serverws.NewWebService_Service service = new serverws.NewWebService_Service();
            serverws.NewWebService port = service.getNewWebServicePort();
            int codigo = 2;
            java.lang.String texto = "recado teste";
            java.lang.String usuario = "negreiiros25";
            port.cadastrar(codigo, texto, usuario);
            System.out.println("Cadastrado com sucesso!");
        } catch (Exception ex) {
           
        }
        
        try { // Call Web Service Operation
            serverws.NewWebService_Service service = new serverws.NewWebService_Service();
            serverws.NewWebService port = service.getNewWebServicePort();
            java.util.List<serverws.Mural> result = port.consultarTodos();
            for(Mural m: result){
                System.out.println(m.getTexto());
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        try { // Call Web Service Operation
            serverws.NewWebService_Service service = new serverws.NewWebService_Service();
            serverws.NewWebService port = service.getNewWebServicePort();
            serverws.Mural arg0 = new serverws.Mural();
            java.lang.String result = port.removerRecados(arg0);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        
    }
    
}
