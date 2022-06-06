package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {
	
	public static void main(String[] args) {
		
	
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("===teste 1: Department findAll()");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}	

		System.out.println("\n===teste 2: Department findById()");
		System.out.println(depDao.findById(3));

	}

}
