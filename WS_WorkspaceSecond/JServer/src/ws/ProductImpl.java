package ws;

import java.util.List;

import javax.jws.WebService;

import dao.ProductDAO;
import entities.Product;


@WebService(endpointInterface="ws.IProductWS")
public class ProductImpl implements IProductWS {

	private ProductDAO productDAO = new ProductDAO();
	
	@Override
	public Product find() {
		// TODO Auto-generated method stub
		return this.productDAO.find();
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productDAO.findAll();
	}

}
