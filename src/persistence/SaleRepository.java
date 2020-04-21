/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.Sale;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public interface SaleRepository extends Repository<Sale>{
    List<Sale> findByDate(Date date);
}
