package dao;

import domain.Sale;
import java.util.ArrayList;
import java.util.List;

public class SalesDao {
    
    public List<Sale> sales;

    public SalesDao() {
        this.sales = new ArrayList<>();
    }
    
    public void agregateSale(Sale sale){
        sales.add(sale);
    }
    
    public void printSale(Sale sale){
        System.out.println(sale);
    }
    
    public void printSales(){
        for(Sale sale: sales){
            System.out.println(sale);
        }
    }
}
