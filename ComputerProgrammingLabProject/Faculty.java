/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerProgrammingLabProject;

import java.util.ArrayList;

/**
 *
 * @author Rümeysa
 */
public class Faculty {
    
   private String name;
	private ArrayList<ComputerProgrammingProject.Department> departments;
	
	public Faculty() {
		this.name = null;
		this.departments = new ArrayList<>();
	}

	public Faculty(String name) {
		this.name = name;
		this.departments = new ArrayList<>();
	}
	
	// tüm departmanlardaki öğrencilere bakıyor ve şartları sağlayan bulursa giriş yapıyor
	public ComputerProgrammingProject.Student stdLogin(String username, String password) {
		ComputerProgrammingProject.Student recentUser = null;
		for (ComputerProgrammingProject.Department dep: departments) {
			for (ComputerProgrammingProject.Student std: dep.getStudents()) {
				if(std.getUsername().equals(username) && std.getPassword().equals(password)) {
					recentUser = std;
					break;
				}
			}
		}
		
		if(recentUser != null) {
			System.out.println("\nwelcome " + recentUser.getName() + "!");
			return recentUser;			
		}
		
		else{
			System.out.println("\nuser " + username + " not found");
			return null;
		}
	}
	
	// tüm departmanlardaki proflara bakıyor ve şartları sağlayan bulursa giriş yapıyor
	public ComputerProgrammingProject.Professor profLogin(String username, String password) {
		ComputerProgrammingProject.Professor recentUser = null;
		for (ComputerProgrammingProject.Department dep: departments) {
			for (ComputerProgrammingProject.Professor prof: dep.getProfessors()) {
				if(prof.getUsername().equals(username) && prof.getPassword().equals(password)) {
					recentUser = prof;
					break;
				}
			}
		}
		
		if(recentUser != null) {
			System.out.println("\nwelcome " + recentUser.getName() + "!");
			return recentUser;			
		}
		
		else{
			System.out.println("\nuser " + username + " not found");
			return null;
		}
	}
	
	// tüm departmanlardaki adminlere bakıyor ve şartları sağlayan bulursa giriş yapıyor, adminin yapması gerekenleri yanlışlıkla
	// departman classında yapmışım cokmalim ozurdilerim nsdkldsklfjdhs biraz admine iş düşmedi böyle o yüzden bunu hiç kullanmadım
	// çok sonra fark ettiğim için de değiştirmeye üşendim bırakmam gerekiyordu :(
	public ComputerProgrammingProject.Admin adminLogin(String username, String password) {
		ComputerProgrammingProject.Admin recentUser = null;
		for (ComputerProgrammingProject.Department dep: departments) {		
			if(dep.getAdmin().getUsername().equals(username) && dep.getAdmin().getPassword().equals(password)) {
				recentUser = dep.getAdmin();
				break;
			}
		}
		
		if(recentUser != null) {
			System.out.println("\nwelcome " + recentUser.getName() + "!");
			return recentUser;			
		}
		
		else{
			System.out.println("\nuser " + username + " not found");
			return null;
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<ComputerProgrammingProject.Department> getDepartments() {
		return departments;
	}
    
}
