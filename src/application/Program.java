package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: findById() ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===TEST 2: findByDepartmentId() ===");
		List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
		for (Seller sl : sellerList) {
			System.out.println(sl);
		}

	}

}
