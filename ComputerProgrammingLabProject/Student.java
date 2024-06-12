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

public class Student extends User {

    private ArrayList<Lecture> lectures;

    public Student() {
        super();
        this.lectures = new ArrayList<>();
    }

    public Student(String name, String surname, String username, String password, int userId) {
        super(name, surname, username, password, userId);
        this.lectures = new ArrayList<>();
    }

    @Override
    public void showLectureDetails() {
        System.out.println("lessons to learn: ");
        for (Lecture lecture : lectures) {
            System.out.println(lecture.getName());
        }
    }

    public void listSubjects() {
        for (Lecture lecture : lectures) {
            System.out.println("subjects of " + lecture.getName());
            for (String subject : lecture.getSubjects()) {
                System.out.println("->" + subject);
            }
        }
    }

    public void findSubject(String lectureName, String subject) {
        boolean found = false;
        for (Lecture lecture : lectures) {
            if (lecture.getName().equals(lectureName)) {
                for (String sbj : lecture.getSubjects()) {
                    if (sbj.equals(subject)) {
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println(subject + " is in" + lectureName);
        }
    }

    public ArrayList<Lecture> getLecture() {
        return lectures;
    }

   

   

}
