package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: seller findById() ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===TEST 2: seller findByDepartmentId() ===");
		List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
		for (Seller sl : sellerList) {
			System.out.println(sl);
		}
		
		System.out.println("===TEST 3: seller findAll() ===");
		sellerList = sellerDao.findAll();
		for (Seller sl : sellerList) {
			System.out.println(sl);
		}
		
		System.out.println("===TEST 4: seller insert() ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(3, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		System.out.println("===TEST 5: seller update() ===");
		seller = sellerDao.findById(1);
		seller.setName("Ana Gloria");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("===TEST 6: seller deleteById() ===");
		sellerDao.deleteById(9);
		System.out.println("Deleted");
	}

}
