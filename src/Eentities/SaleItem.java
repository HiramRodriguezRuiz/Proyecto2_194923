/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eentities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Martha
 */
@Entity
@Table(name = "sale_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaleItem.findAll", query = "SELECT s FROM SaleItem s")
    , @NamedQuery(name = "SaleItem.findById", query = "SELECT s FROM SaleItem s WHERE s.id = :id")
    , @NamedQuery(name = "SaleItem.findByProductId", query = "SELECT s FROM SaleItem s WHERE s.productId = :productId")
    , @NamedQuery(name = "SaleItem.findBySaleId", query = "SELECT s FROM SaleItem s WHERE s.saleId = :saleId")
    , @NamedQuery(name = "SaleItem.findByPrice", query = "SELECT s FROM SaleItem s WHERE s.price = :price")
    , @NamedQuery(name = "SaleItem.findByQuantity", query = "SELECT s FROM SaleItem s WHERE s.quantity = :quantity")
    , @NamedQuery(name = "SaleItem.findByTotal", query = "SELECT s FROM SaleItem s WHERE s.total = :total")})
public class SaleItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "sale_id")
    private Integer saleId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "total")
    private Float total;

    public SaleItem() {
    }

    public SaleItem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaleItem)) {
            return false;
        }
        SaleItem other = (SaleItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Eentities.SaleItem[ id=" + id + " ]";
    }
    
}
