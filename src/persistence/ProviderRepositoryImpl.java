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
public class ProviderRepositoryImpl extends RepositoryBase<Provider> implements ProviderRepository{
    
    public ProviderRepositoryImpl(EntityManager entityManager,Class<Provider>cls){
        super(entityManager,cls);
    }
    @Override
    public List<Provider> findByName(String name) {
        TypedQuery<Provider> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.name = :name",this.cls); 
        q.setParameter("name",name);
        return q.getResultList();
    }
    
}
