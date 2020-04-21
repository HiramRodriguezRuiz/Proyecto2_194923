/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class ProductRepositoryImpl extends RepositoryBase<Product> implements ProductRepository{
    
    public ProductRepositoryImpl(EntityManager entityManager, Class<Product>cls){
        super(entityManager,cls);
    }

    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.name = :name",this.cls); 
        q.setParameter("name",name);
        return q.getResultList();
    }

    @Override
    public List<Product> findByCategory(Category category) {
        TypedQuery<Product> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.category = :category",this.cls); 
        q.setParameter("category",category);
        return q.getResultList();
    }
    
}
