package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: departmen insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: department update ===");
		Department department = departmentDao.findById(10);
		department.setName("Fashion");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		
		System.out.println("=== TEST 3: seller findById ===");
		Department department2 = departmentDao.findById(15);
	}
	
	

}
