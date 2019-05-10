/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ismael
 */
@Entity
@Table(name = "COMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findByCodigocompra", query = "SELECT c FROM Compra c WHERE c.codigocompra = :codigocompra"),
    @NamedQuery(name = "Compra.findByDatacompra", query = "SELECT c FROM Compra c WHERE c.datacompra = :datacompra"),
    @NamedQuery(name = "Compra.findByValorcompra", query = "SELECT c FROM Compra c WHERE c.valorcompra = :valorcompra")})
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOCOMPRA")
    private Integer codigocompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATACOMPRA")
    @Temporal(TemporalType.DATE)
    private Date datacompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALORCOMPRA")
    private double valorcompra;

    public Compra() {
    }

    public Compra(Integer codigocompra) {
        this.codigocompra = codigocompra;
    }

    public Compra(Integer codigocompra, Date datacompra, double valorcompra) {
        this.codigocompra = codigocompra;
        this.datacompra = datacompra;
        this.valorcompra = valorcompra;
    }

    public Integer getCodigocompra() {
        return codigocompra;
    }

    public void setCodigocompra(Integer codigocompra) {
        this.codigocompra = codigocompra;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public double getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(double valorcompra) {
        this.valorcompra = valorcompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocompra != null ? codigocompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codigocompra == null && other.codigocompra != null) || (this.codigocompra != null && !this.codigocompra.equals(other.codigocompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Compra[ codigocompra=" + codigocompra + " ]";
    }
    
}
