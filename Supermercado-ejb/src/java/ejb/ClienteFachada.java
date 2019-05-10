/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Ismael
 */
@Stateless
@LocalBean
public class ClienteFachada {
    
    @PersistenceContext(unitName = "Supermercado-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    
    // Metodo que retorna a lista de Compras armazenada na tabela Compra
    public List<ejb.Compra> getListaCompras() {
        Query query = em.createNamedQuery("Compras.findAll");
        return query.getResultList();
    }
}
