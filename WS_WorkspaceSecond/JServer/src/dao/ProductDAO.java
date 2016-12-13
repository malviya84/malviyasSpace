package dao;
import java.util.ArrayList;
import java.util.List;

import entities.*;
public class ProductDAO {
	
	public Product find()
	{
		
		return new Product("P01","name 01",100);
	}
	
	public List<Product> findAll()
	{
		List<Product> result = new ArrayList<Product>();
		
		result.add(new Product("P01","name 01",100) );
		result.add(new Product("P02","name 02",200) );
		result.add(new Product("P03","name 03",300) );
		
		return result;
		
	}

}
