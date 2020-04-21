/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.*;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class SaleRepositoryImpl extends RepositoryBase<Sale> implements SaleRepository{
    
    public SaleRepositoryImpl(EntityManager entityManager,Class<Sale>cls){
        super(entityManager,cls);
    }

    @Override
    public List<Sale> findByDate(Date date) {
        TypedQuery<Sale> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.date = :date",this.cls); 
        q.setParameter("date",date);
        return q.getResultList();
    }
    
}
