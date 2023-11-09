package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== TEST 1: Department insert() ===");
//		Department department = new Department(null, "Health");
//		departmentDao.insert(department);
//		System.out.println("Inserted! new Id = " + department.getId());
		
		System.out.println("=== TEST 2: Department findById() ===");
		Department dep1 = departmentDao.findById(2);
		System.out.println(dep1);
		
		System.out.println("=== TEST 3: Department findAll() ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("=== TEST 4: Department update() ===");
		Department dep2 = new Department(6, "House");
		departmentDao.update(dep2);
		System.out.println(departmentDao.findById(6));
		
		System.out.println("===TEST 5: department deleteById() ===");
		departmentDao.deleteById(8);
		System.out.println("Deleted");
		

	}

}
