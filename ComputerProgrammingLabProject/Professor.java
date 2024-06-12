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
public class Professor extends User {

    private ArrayList<Lecture> lectures;
    private Department department;

    public Professor() {
        super();
        this.lectures = new ArrayList<>();
    }

    public Professor(String name, String surname, String username, String password, int userId) {
        super(name, surname, username, password, userId);
        this.lectures = new ArrayList<>();
    }

    @Override
    public void showLectureDetails() {
        System.out.println("Lessons to Instruct: ");
        for (Lecture lecture : lectures) {
            System.out.println(lecture.getName());
        }
    }

    public void addSubject(String lecturName, String subject) {
        boolean found = false;
        for (Lecture lecture : lectures) {
            if (lecture.getName().equals(lecturName)) {
                lecture.getSubjects().add(subject);
                System.out.println(subject + "added to the lecture " + lecturName);
                found = true;
            }
        }
        if (!found) {
            System.out.println("there is no lecture or subject named " + lecturName + "/" + subject);

        }

    }

    public Department getDepartment() {
        return department;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }
}
