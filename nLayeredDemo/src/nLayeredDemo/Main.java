package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {
	//entitiler hari� newliyorsak ilerde sorun ��karacakt�r
	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile ��z�lecek
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter());
		
		Product product1 =new Product(1,1,"Apple",12,50) ;
		productService.add(product1);
		Product product2 =new Product(2,1,"Orange",12,50) ;
		productService.add(product2);
		
		
		
		

	}

}
