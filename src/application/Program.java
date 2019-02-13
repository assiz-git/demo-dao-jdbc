package application;

import java.text.ParseException;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Department department = new Department(1, "Books");
		
		System.out.println(department);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
		
		System.out.println(seller);
		
	}

}
