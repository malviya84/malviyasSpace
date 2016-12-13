package ws;

import java.util.*;
import javax.jws.*;

import entities.Product;

@WebService
public interface IProductWS {
	
	@WebMethod
	public Product find();
	
	@WebMethod
	public List<Product> findAll();

}
