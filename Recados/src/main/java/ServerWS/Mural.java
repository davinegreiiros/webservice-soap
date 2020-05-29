/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerWS;

/**
 *
 * @author Davi
 */
public class Mural {
    private int codigo;
    private String texto;
    private String usuario;
    
    public Mural(int codigo,String texto, String usuario){
        this.codigo = codigo;
        this.texto = texto;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
