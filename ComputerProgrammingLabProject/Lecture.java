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
public class Lecture {
    ArrayList<String> subjects;
    private Professor prof;
    private String name;
    
    public Lecture(){
        this.subjects=new ArrayList<>();
        this.prof=null;
        this.name=null;
    }
    public Lecture(String name, Professor prof){
        this();subjects=new ArrayList<>();
        this.name=name;
        this.prof=prof;
    }
    public ArrayList<String> getSubjects(){
        return subjects;
    }
    public String getName(){
        return name;
    }
    public Professor getProf(){
        return prof;
    }

    
}
