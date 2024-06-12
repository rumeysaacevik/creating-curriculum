/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerProgrammingLabProject;

/**
 *
 * @author Rümeysa
 */
public class User {
    
    private String name; 
    private String surname;
    private int userId;
    private String username;
    private String password;
    
    public User(){
        this.name=null;
        this.surname=null;
        this.userId=0;
        this.username=null;
        this.password=null;
    }
    public User (String name, String surname, String username, String password, int userId){
        this.name=name;
        this.surname=surname;
        this.username=username;
        this.password=password;
        this.userId=userId;
        
    }
    public void showLectureDetails(){
        //to be implemented later
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getUserId(){
        return userId;
    }
    
}
