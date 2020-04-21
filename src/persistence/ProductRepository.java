/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.*;
import java.util.List;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public interface ProductRepository extends Repository<Product>{
    List<Product> findByName(String name);
    List<Product> findByCategory(Category category);
}
