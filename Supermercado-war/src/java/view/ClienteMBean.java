/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ejb.Cliente;
import ejb.Compra;
import ejb.CompraFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ismael
 */
@ManagedBean
@RequestScoped
public class ClienteMBean {
    
    @EJB
    private CompraFachada compraFachada;
    private Cliente cliente;

    public List<Compra> getListaClientes() {
//        return CompraFachada.getListaClientes();
        return null;
    }
    /**
     * Creates a new instance of ClienteMBean
     */
    public ClienteMBean() {
    }
    
    public String cadastrarCliente() {
        
    }
    
    
}
