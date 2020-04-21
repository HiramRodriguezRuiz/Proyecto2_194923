/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class CustomerRepositoryImpl extends RepositoryBase<Customer> implements CustomerRepository{
    
    public CustomerRepositoryImpl(EntityManager entityManager,Class<Customer>cls){
        super(entityManager,cls);
    }
    
    @Override
    public List<Customer> findByName(String name){
        TypedQuery<Customer> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.name = :name",this.cls); 
        q.setParameter("name",name);
        return q.getResultList();
    }
}
