package demo;

import ws.IProductWS;
import ws.Product;
import ws.ProductImplService;
import ws.ProductImplServiceLocator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			
			ProductImplService productImplService= new ProductImplServiceLocator();
			IProductWS productWS = productImplService.getProductImplPort();
			System.out.println(productWS.find().getName());
			
			
			Product product = productWS.find();
			
			System.out.println("product name"+product.getName().toString());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
