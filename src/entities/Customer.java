/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Luis
 */
@Entity
public class Customer extends EntityBase implements Serializable {

    public Customer() {
    }

    public Customer(String rfc, String name, String address, String phone) {
        this.rfc = rfc;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Column
    private String rfc;

    public Customer(Integer id) {
        super(id);
    }

    public String getRfc() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "entities.Customer[ id=" + id + " ]";
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
