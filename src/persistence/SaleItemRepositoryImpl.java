/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.*;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class SaleItemRepositoryImpl extends RepositoryBase<SaleItem> implements SaleItemRepository{
    
    public SaleItemRepositoryImpl(EntityManager entityManager,Class<SaleItem>cls){
        super(entityManager,cls);
    }

    @Override
    public List<SaleItem> findByDate(Date date) {
        TypedQuery<SaleItem> q = this.entityManager.
                createQuery("SELECT v FROM v sistema_ventas v WHERE v.date = :date",this.cls); 
        q.setParameter("date",date);
        return q.getResultList();
    }
}
