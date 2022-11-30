package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao {
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır. SQL
        System.out.println("Hibernate ile veri tabanına eklendi");

    }
}
