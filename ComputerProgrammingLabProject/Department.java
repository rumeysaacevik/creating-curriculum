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
public class Department {
    
     private String name;
	private int departmentId;
	private ArrayList<ComputerProgrammingProject.Lecture> lectures;
	private ArrayList<ComputerProgrammingProject.Professor> professors;
	private ArrayList<ComputerProgrammingProject.Student> students;
	private ComputerProgrammingProject.Admin admin;
	
	public Department() {
		this.name = null;
		this.departmentId = 0;
		this.lectures = new ArrayList<>();	
		this.professors = new ArrayList<>();	
		this.students = new ArrayList<>();	
		this.admin = null;
	}

	public Department(String name, int id) {
		this.name = name;
		this.departmentId = id;
		this.lectures = new ArrayList<>();	
		this.professors = new ArrayList<>();	
		this.students = new ArrayList<>();	
		this.admin = new ComputerProgrammingProject.Admin(name, "admin", "admin", "admin", id);
	}
	
	
	public void createStudent(String name, String surname, String username, String password) {
		//her yeni öğrenciye students listesinin boyutunun bi fazlasına eşit olacak bir id verilir, liste boşsa id: 1 listede 4 öğrenci varsa yeni öğrenci id:5 vs
		ComputerProgrammingProject.Student newStudent = admin.createStudent(name, surname, username, password, students.size()+1);
		
		//yeni gelen öğrencilere departmandaki tüm dersleri atıyoruz, aslında birinci sınıf derseleri diye özelleştirilebilir ama ödevin bu kadar kapsamlı
		//istendiğini sanmıyorum düzgün çalışsın diye tüm dersleri her öğrenciye atadım, farklı bir fikrin varsa yapabiliriz
		for (ComputerProgrammingProject.Lecture lect: lectures) {
			newStudent.getLectures().add(lect);			
		}
		
		this.students.add(newStudent);
		System.out.println("new student has been created successfully: " + name + " " + surname);
	}
	
	public void createProfessor(String name, String surname, String username, String password) {
		//her yeni profa professors listesinin boyutunun bi fazlasına eşit olacak bir id verilir, liste boşsa id: 1 listede 4 prof varsa yeni prof id:5 vs
		this.professors.add(admin.createProfessor(name, surname, username, password, professors.size()+1));		
		System.out.println("new professor has been created successfully: " + name + " " + surname);
	}
	
	/*
	 * lecture oluşturmak için bir isim ve bir username alınıyor
	 * eğer departmandaki profların içinde o username'e sahip bir prof varsa prof target içinde tutulur
	 * sonra admindeki create lecture çağırılarak o ders target profa atanarak oluşturulur ve departman derslerine eklenir
	 * ayrıca departmandaki tüm öğrencilere bu ders atanır
	 * eğer prof yoksa, hiçbir şey eklenmez, hata cümlesi döndürür
	 */
	public void createLecture(String name, String profUsername) {
		ComputerProgrammingProject.Professor target = null;
		for(ComputerProgrammingProject.Professor prof: professors) {
			if (prof.getUsername().equals(profUsername)) {
				target = prof;
			}
		}
		if(target != null) {
			ComputerProgrammingProject.Lecture newLecture = admin.createLecture(name, target);
			this.lectures.add(newLecture);
			target.getLectures().add(newLecture);
			for (ComputerProgrammingProject.Student std: students) {
				std.getLectures().add(newLecture);
			}
			System.out.println(name + " lecture has been created successfully");
		}
		else {
			System.out.println("given professor doesn't exist");
		}
	}

	public String getName() {
		return name;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}

	public ArrayList<ComputerProgrammingProject.Lecture> getLectures() {
		return lectures;
	}

	public ArrayList<ComputerProgrammingProject.Professor> getProfessors() {
		return professors;
	}

	public ArrayList<ComputerProgrammingProject.Student> getStudents() {
		return students;
	}

	public ComputerProgrammingProject.Admin getAdmin() {
		return admin;
	}
	
	
}
