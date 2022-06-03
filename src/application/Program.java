package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===Teste: 1 seller findById===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===Teste: 2 seller findByDepartment===");
		Department dep = new Department(2, null);
		List<Seller> listSeller = sellerDao.findByDepartment(dep);
		for (Seller sell : listSeller)
		{
			System.out.println(sell);
		}
		
		System.out.println("\n===Teste: 3 seller findByAll===");
		List<Seller> list = sellerDao.findAll();
		for (Seller sell : list)
		{
			System.out.println(sell);
		}
		
		System.out.println("\n===Teste: 4 seller Insert===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("Done! New seller ID: " + newSeller.getId());
		
		System.out.println("\n===Teste: 5 seller Update===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println("\n===Teste: 6 seller Delete===");
		System.out.println("Enter an Id: ");
		int num = sc.nextInt();
		sellerDao.deleteById(num);
		System.out.println("Deleted!");
		
	sc.close();	
	}

}
