/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cntrl;

import entities.Category;
import entities.Customer;
import entities.Product;
import entities.Provider;
import entities.SaleItem;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Invitado
 */
public class Models {
    public static DefaultTableModel categoryTableModel(List<Category> lstCategories) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Description"};
        if(lstCategories!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstCategories.size()][nombresCols.length];
            
            for (int i = 0; i < lstCategories.size(); i++) {
                Category category=lstCategories.get(i);
                tabla[i][0]=category.getId();
                tabla[i][1]=category.getName();
                tabla[i][2]=category.getDescription();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel customerTableModel(List<Customer> lstCustomers) {
        Object tabla[][];
        String[] nombresCols = {"ID", "RFC", "Name", "Address", "Phone"};
        if(lstCustomers!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstCustomers.size()][nombresCols.length];
            
            for (int i = 0; i < lstCustomers.size(); i++) {
                Customer customer=lstCustomers.get(i);
                tabla[i][0]=customer.getId();
                tabla[i][1]=customer.getRfc();
                tabla[i][2]=customer.getName();
                tabla[i][3]=customer.getAddress();
                tabla[i][4]=customer.getPhone();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel providerTableModel(List<Provider> lstProviders) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Address", "Phone", "Website"};
        if(lstProviders!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstProviders.size()][nombresCols.length];
            
            for (int i = 0; i < lstProviders.size(); i++) {
                Provider provider=lstProviders.get(i);
                tabla[i][0]=provider.getId();
                tabla[i][1]=provider.getName();
                tabla[i][2]=provider.getAddress();
                tabla[i][3]=provider.getPhone();
                tabla[i][4]=provider.getWebsite();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel productTableModel(List<Product> lstProducts) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Price", "Stock", "Provider", "Category"};
        if(lstProducts!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstProducts.size()][nombresCols.length];
            
            for (int i = 0; i < lstProducts.size(); i++) {
                Product product=lstProducts.get(i);
                tabla[i][0]=product.getId();
                tabla[i][1]=product.getName();
                tabla[i][2]=product.getPrice();
                tabla[i][3]=product.getStock();
                tabla[i][4]=product.getProvider().getName();
                tabla[i][5]=product.getCategory().getName();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel saleItemTableModel(List<SaleItem> lstSaleItems) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Product", "Price", "Quantity", "Total"};
        if(lstSaleItems!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstSaleItems.size()][nombresCols.length];
            
            for (int i = 0; i < lstSaleItems.size(); i++) {
                SaleItem saleItem=lstSaleItems.get(i);
                tabla[i][0]=saleItem.getId();
                tabla[i][1]=saleItem.getProduct().getName();
                tabla[i][2]=saleItem.getPrice();
                tabla[i][3]=saleItem.getQuantity();
                tabla[i][4]=saleItem.getTotal();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultComboBoxModel providersComboBoxModel(List<Provider> lstProviders) {
        DefaultComboBoxModel<Provider> cbxmProviders = new DefaultComboBoxModel<>();
        
        if(lstProviders!=null){
            for (Provider destino : lstProviders) {
                cbxmProviders.addElement(destino);
            }
            return cbxmProviders;
        }
        return null;
    }
    
    public static DefaultComboBoxModel categoriesComboBoxModel(List<Category> lstCategories) {
        DefaultComboBoxModel<Category> cbxmCategories = new DefaultComboBoxModel<>();
        
        if(lstCategories!=null){
            for (Category category : lstCategories) {
                cbxmCategories.addElement(category);
            }
            return cbxmCategories;
        }
        return null;
    }
    
    public static DefaultComboBoxModel customersComboBoxModel(List<Customer> lstCategories) {
        DefaultComboBoxModel<Customer> cbxmCustomers = new DefaultComboBoxModel<>();
        
        if(lstCategories!=null){
            for (Customer customer : lstCategories) {
                cbxmCustomers.addElement(customer);
            }
            return cbxmCustomers;
        }
        return null;
    }
}
