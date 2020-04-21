/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.Category;
import java.util.List;
import javax.persistence.*;

public class CategoryRepositoryImpl extends RepositoryBase<Category> implements CategoryRepository{
    
    public CategoryRepositoryImpl(EntityManager entityManager,Class<Category> cls){
        super(entityManager,cls);
    }
    @Override
    public List<Category> findByName(String name) {
        TypedQuery<Category> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.name = :name",this.cls); 
        q.setParameter("name",name);
        return q.getResultList();
    }
    
}
