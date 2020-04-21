/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.SaleItem;
import java.util.*;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public interface SaleItemRepository extends Repository<SaleItem>{
    List<SaleItem> findByDate(Date date);
}
