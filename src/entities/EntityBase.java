/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
@MappedSuperclass
public abstract class EntityBase {
    public EntityBase() {
    }
    
    public EntityBase(Integer id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Integer id;
    
    public Integer getID(){
        return this.id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntityBase other = (EntityBase) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
 
} 
