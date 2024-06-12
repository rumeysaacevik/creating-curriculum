/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerProgrammingLabProject;

/**
 *
 * @author Rümeysa
 */
public class Admin extends User {
    
    public Admin() {
		super();
	}

	public Admin(String name, String surname, String username, String password, int userId) {
		super(name, surname, username, password, userId);
	}
	
	public ComputerProgrammingLabProject.Professor createProfessor(String name, String surname, String username, String password, int userId) {
		ComputerProgrammingLabProject.Professor newProfessor = new ComputerProgrammingLabProject.Professor(name, surname, username, password, userId);
		return newProfessor;
	}
	
	public ComputerProgrammingLabProject.Lecture createLecture(String name, ComputerProgrammingLabProject.Professor prof) {
		ComputerProgrammingLabProject.Lecture newLecture = new ComputerProgrammingLabProject.Lecture(name, prof);
		return newLecture;
	}
	
	public ComputerProgrammingLabProject.Student createStudent(String name, String surname, String username, String password, int userId) {
		ComputerProgrammingLabProject.Student newStudent = new ComputerProgrammingLabProject.Student(name, surname, username, password, userId);
		return newStudent;
	}
}

    
    
    

