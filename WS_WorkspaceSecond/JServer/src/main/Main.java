package main;

import javax.jws.*;
import javax.xml.ws.Endpoint;

import ws.ProductImpl;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8091/ws/product", new ProductImpl());
		System.out.println("Done");

	}

}
