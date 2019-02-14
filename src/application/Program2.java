package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findById =====");
		Department department = DepartmentDao.findById(3);
		System.out.println(department);

		System.out.println();
		System.out.println("=== TEST 2: Department findAll =====");
		List<Department> list = new ArrayList<>();
		list = DepartmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		System.out.println();
		System.out.println("=== TEST 3: Department insert =====");
		Department newDepartment = new Department(null, "Music");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println();
		System.out.println("=== TEST 4: Department update =====");
		Department updDepartment = DepartmentDao.findById(1);
		updDepartment.setName("Food");
		DepartmentDao.update(updDepartment);
		System.out.println("Update completed!");

		System.out.println();
		System.out.println("=== TEST 5: Department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		DepartmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
	}

}
