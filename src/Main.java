/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import javax.persistence.*;
import entities.*;
/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory("sistema_ventas");
        EntityManager entityManager = 
                managerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();

        
        Provider provider=new Provider();
        provider.setAddress("Bimbo, De La Pequeña Industria 2125, Parque Industrial, 85065 Cd Obregón, Son.");
        provider.setName("Bimbo");
        provider.setPhone("52 800 910 2030");
        provider.setWebsite("https://www.bimbo.com.mx/es");
        
        entityManager.persist(provider);
        
        Category category=new Category();
        category.setName("Bread");
        category.setDescription("Bread is life");
        
        entityManager.persist(category);
        
        Product product = new Product();
        product.setProvider(provider);
        product.setCategory(category);
        product.setName("Toasted Bread");
        product.setPrice(25.5f);
        product.setStock(10);
        
        entityManager.persist(product);
        
        Customer customer = new Customer();
        customer.setAddress("Bartolome Delgado");
        customer.setName("Hiram");
        customer.setPhone("6442132979");
        customer.setRFC("ROHR050700");
        
        entityManager.persist(customer);
        
        Sale sale=new Sale();
        sale.setCustomer(customer);
        sale.setDate(new Date());
        sale.setDiscount(0f);
        sale.setTotal(31);
        
        entityManager.persist(sale);
        
        SaleItem saleItem=new SaleItem();
        
        saleItem.setPrice(25.5f);
        saleItem.setProduct(product);
        saleItem.setQuantity(2);
        saleItem.setSale(sale);
        saleItem.setTotal(31f);
        
        entityManager.persist(saleItem);
        
        entityManager.getTransaction().commit();
    }
    
}
