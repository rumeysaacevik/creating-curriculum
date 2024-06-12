/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerProgrammingLabProject;

/**
 *
 * @author Rümeysa
 */
public class Test {

    public static void main(String[] args) {

        ComputerProgrammingProject.Professor recentLoggedInProf = null;
        ComputerProgrammingProject.Student recentLoggedInStd = null;

        ComputerProgrammingProject.Faculty engFaculty = new ComputerProgrammingProject.Faculty("Engineering Faculty");

        ComputerProgrammingProject.Department compEng = new ComputerProgrammingProject.Department("Computer Engineering", 1);
        ComputerProgrammingProject.Department softEng = new ComputerProgrammingProject.Department("Softwarre Engineering", 2);
        ComputerProgrammingProject.Department elecEng = new ComputerProgrammingProject.Department("Electric and Electronic Engineering", 3);

        engFaculty.getDepartments().add(compEng);
        engFaculty.getDepartments().add(softEng);
        engFaculty.getDepartments().add(elecEng);

        //PROFESSORS
        compEng.createProfessor("Gökhan", "Şahin", "gsahin", "gs123"); //for calculus1 from computer engineering department
        System.out.println("");
        compEng.createProfessor("Nazlı", "Aydın", "naydin", "na123"); //for physic1 from computer engineering department
        System.out.println("");
        compEng.createProfessor("Alperen", "Bulut", "abulut", "ab123"); //advanced english from computer engineering department
        System.out.println("");
        compEng.createProfessor("Eren", "Arslan", "earslan", "ea123"); //intro. to programming from computer engineering department
        System.out.println("");
        compEng.createProfessor("Nazım", "Mutlu", "nmutlu", "nm123"); //intro. to computer engineering from computer engineering department
        System.out.println("");
        softEng.createProfessor("İlayda", "Dalkıran", "idalkiran", "id123"); //for calculus1 from software engineering department
        System.out.println("");
        softEng.createProfessor("Taner", "Yıldırım", "tyildirim", "ty123");//for physic1 from software engineering department
        System.out.println("");
        softEng.createProfessor("Gülşah", "Gülmez", "ggulmez", "gg123");//for introduction to software engineering from software engineering department
        System.out.println("");
        softEng.createProfessor("Ali", "Nizam", "anizam", "an123");//for computer programming from software engineering department
        System.out.println("");
        softEng.createProfessor("Ahmet", "Demirata", "ademirata", "ad123");//for advanced english from software engineering department
        System.out.println("");
        elecEng.createProfessor("Barış", "Üzmez", "buzmez", "bu123"); //for calculus1 from electric and electronic engineering department
        System.out.println("");
        elecEng.createProfessor("Emre", "Albayrak", "ealbayrak", "ea123");//for physic1 from electric and electronic engineering department
        System.out.println("");
        elecEng.createProfessor("Selin", "Demir", "sdemir", "sd123");//for int. to el. el. eng. from electric and electronic engineering department
        System.out.println("");
        elecEng.createProfessor("Aysel", "kilic", "akilic", "ak123");//for chemistry from electric and electronic engineering department
        System.out.println("");
        System.out.println("---------------------");

        //STUDENTS
        compEng.createStudent("Enes", "Saraç", "esarac", "es123");// from computer engineering department
        System.out.println("");
        softEng.createStudent("Aslı", "Kar", "akar", "ak123");//from software engineering department
        System.out.println("");
        elecEng.createStudent("Meryem", "Diken", "mdiken", "md123");//from electric electronic engineering department
        System.out.println("");
        System.out.println("---------------------");

        //it is created for computer engineering only.
        //CALCULUSI
        compEng.createLecture("CalculusI", "gsahin");
        recentLoggedInProf = engFaculty.profLogin("gsahin", "gs123");
        recentLoggedInProf.addSubject("CalculusI", "Limit");
        recentLoggedInProf.addSubject("CalculusI", "Continuity");
        recentLoggedInProf.addSubject("CalculusI", "Derivative");
        recentLoggedInProf.addSubject("CalculusI", "Integral");
        recentLoggedInProf.addSubject("CalculusI", "Functions");
        recentLoggedInProf.removeSubject("CalculusI", "Functions"); //the subject functions be removed from the lecture.

        recentLoggedInStd = engFaculty.stdLogin("esarac", "es123");
        recentLoggedInStd.showLectureDetails(); //he has a calculusI lecture because he is a computer engineering student.
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("CalculusI", "Functions"); //subject not found.
        recentLoggedInStd.findSubject("CalculusI", "Derivative"); //subject that can be found.
        System.out.println(" ");
        System.out.println("---------------------");

        //PHYSIC1
        compEng.createLecture("PhysicI", "naydin");
        recentLoggedInProf = engFaculty.profLogin("naydin", "na123");
        recentLoggedInProf.addSubject("PhysicI", "Dynamics - Newton's Laws");
        recentLoggedInProf.addSubject("PhysicI", "Energy Conservation");
        recentLoggedInProf.addSubject("PhysicI", "Linear Momentum and Conservation");
        recentLoggedInProf.addSubject("PhysicI", "Angular Momentum and Conservation");
        recentLoggedInProf.removeSubject("PhysicI", "Rotational Movement"); //the subject rotational movement can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("esarac", "es123");
        recentLoggedInStd.showLectureDetails(); //he has a PhysicI lecture because he is a computer engineering student.
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("PhysicI", " Rotational Movement"); //subject not found.
        recentLoggedInStd.findSubject("PhysicI", " Energy Conservation"); //subject that can be found.
        System.out.println(" ");
        System.out.println("---------------------");

        //ADVANCED ENGLISH 
        compEng.createLecture("Advanced English", "abulut");
        recentLoggedInProf = engFaculty.profLogin("abulut", "ab123");
        recentLoggedInProf.addSubject("Advanced English", "Paraphrasing");
        recentLoggedInProf.addSubject("Advanced English", "Academic Writing");
        recentLoggedInProf.addSubject("Advanced English", "Citation");
        recentLoggedInProf.addSubject("Advanced English", "Summary");
        recentLoggedInProf.removeSubject("Advanced English", "Summary"); //summary removed from the lecture

        recentLoggedInStd = engFaculty.stdLogin("esarac", "es123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Advanced English", "Citation");
        recentLoggedInStd.findSubject("Advanced English", "Summary");
        System.out.println(" ");
        System.out.println("---------------------");

        //INTRODUCTION TO PROGRAMMING
        compEng.createLecture("Introduction to Programming", "earslan");
        recentLoggedInProf = engFaculty.profLogin("earslan", "ea123");
        recentLoggedInProf.addSubject("Introduction to Programming", "Variables");
        recentLoggedInProf.addSubject("Introduction to Programming", "General Structure of the Program");
        recentLoggedInProf.addSubject("Introduction to Programming", "Loops");
        recentLoggedInProf.addSubject("Introduction to Programming", "Dynamic Data Structures");
        recentLoggedInProf.removeSubject("Introduction to Programming", "Variables"); //summary removed from the lecture

        recentLoggedInStd = engFaculty.stdLogin("esarac", "es123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Introduction to Programming", "Loops");
        recentLoggedInStd.findSubject("Introduction to Programming", " Variables");
        System.out.println("");
        System.out.println("---------------------");

        //INTRODUCTION TO COMPUTER ENGINEERING
        compEng.createLecture("Introduction to Computer Engineering", "nmutlu");
        recentLoggedInProf = engFaculty.profLogin("nmutlu", "nm123");
        recentLoggedInProf.addSubject("Introduction to Computer Engineering", "Computer Definition");
        recentLoggedInProf.addSubject("Introduction to Computer Engineering", "Introduction to Algorithm");
        recentLoggedInProf.addSubject("Introduction to Computer Engineering", "Variables");
        recentLoggedInProf.removeSubject("Introduction to Computer Engineering", "Loops");//the subject loops can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("esarac", "es123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Introduction to Computer Engineering", "Variables");
        recentLoggedInStd.findSubject("Introduction to Computer Engineering", "Loops");
        System.out.println("");
        System.out.println("---------------------");

        //it is created for software engineering only
        //CALCULUS1
        softEng.createLecture("CalculusI", "idalkiran");
        recentLoggedInProf = engFaculty.profLogin("idalkiran", "id123");
        recentLoggedInProf.addSubject("CalculusI", "Functions");
        recentLoggedInProf.addSubject("CalculusI", "Continuity");
        recentLoggedInProf.addSubject("CalculusI", "Derivative");
        recentLoggedInProf.addSubject("CalculusI", "Integral");
        recentLoggedInProf.removeSubject("CalculusI", "Limit"); //the subject functions can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("akar", "ak123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("CalculusI", "Derivative"); //subject that can be found.
        recentLoggedInStd.findSubject("CalculusI", "Integral");
        recentLoggedInStd.findSubject("CalculusI", "Limit");
        System.out.println(" ");
        System.out.println("---------------------");

        //PHYSIC1
        softEng.createLecture("Physic1", "tyildirim");
        recentLoggedInProf = engFaculty.profLogin("tyildirim", "ty123");
        recentLoggedInProf.addSubject("Physic1", "Dimensional Analysis");
        recentLoggedInProf.addSubject("Physic1", "One Dimensional Motion");
        recentLoggedInProf.addSubject("Physic1", "Vectors");
        recentLoggedInProf.addSubject("Physic1", "Two-dimensional Motion");
        recentLoggedInProf.removeSubject("Physic1", "Vectors");
        recentLoggedInProf.removeSubject("Physic1", "Frictional Force");//the subject functions can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("akar", "ak123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Physic1", "Vectors");
        recentLoggedInStd.findSubject("Physic1", "One Dimensional Motion");
        recentLoggedInStd.findSubject("Physic1", "Frictional Force");
        System.out.println(" ");
        System.out.println("---------------------");
        
        //INTRODUCTION TO SOFTWARE ENGINEERING
        softEng.createLecture("Introduction to Software Engineering", "ggulmez");
        recentLoggedInProf = engFaculty.profLogin("ggulmez", "gg123");
        recentLoggedInProf.addSubject("Introduction to Software Engineering", "Software and Hardware");
        recentLoggedInProf.addSubject("Introduction to Software Engineering", "Operating Systems");
        recentLoggedInProf.addSubject("Introduction to Software Engineering", "Network Systems");
        recentLoggedInProf.addSubject("Introduction to Software Engineering", "Data Structure");
        recentLoggedInProf.removeSubject("Introduction to Software Engineering", "Software Process and Project Management");//the subject Software Process and Project Management can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("akar", "ak123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Introduction to Software Engineering", "Operating Systems");
        recentLoggedInStd.findSubject("Introduction to Software Engineering", "Data Structure");
        recentLoggedInStd.findSubject("Introduction to Software Engineering", "Software Process and Project Management");
        System.out.println(" ");
        System.out.println("---------------------");
        
        //COMPUTER PROGRAMMING
        softEng.createLecture("Computer Programming", "anizam");
        recentLoggedInProf = engFaculty.profLogin("anizam", "an123");
        recentLoggedInProf.addSubject("Computer Programming", "Operators");
        recentLoggedInProf.addSubject("Computer Programming", "Control Structures");
        recentLoggedInProf.addSubject("Computer Programming", "Loop Structures");
        recentLoggedInProf.addSubject("Computer Programming", "Algorithm Drawing and Modelling");
        recentLoggedInProf.addSubject("Computer Programming", "Array and ArrayList");
        recentLoggedInProf.addSubject("Computer Programming", "Object Oriented Programming");
        recentLoggedInProf.addSubject("Computer Programming", "Method Overloading");
        recentLoggedInProf.removeSubject("Computer Programming", "Method Overloading");//method overloading removed from the lecture
        

        recentLoggedInStd = engFaculty.stdLogin("akar", "ak123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Computer Programming", "Control Structures");
        recentLoggedInStd.findSubject("Computer Programming", "Object Oriented Programming");
        recentLoggedInStd.findSubject("Computer Programming", "Method Overloading");
        System.out.println(" ");
        System.out.println("---------------------");
        
        //ADVANCED ENGLISH
        softEng.createLecture("Advanced English", "ademirata");
        recentLoggedInProf = engFaculty.profLogin("ademirata", "ad123");
        recentLoggedInProf.addSubject("Advanced English", "Writing Journal");
        recentLoggedInProf.addSubject("Advanced English", "Academic Writing");
        recentLoggedInProf.addSubject("Advanced English", "Paraphrasing");
        recentLoggedInProf.addSubject("Advanced English", "Citation");
        recentLoggedInProf.removeSubject("Advanced English", "Summary Writing");//the subject functions can not be removed from the lecture because it wasn't added.

        recentLoggedInStd = engFaculty.stdLogin("akar", "ak123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Advanced English", "Summary Writing");
        recentLoggedInStd.findSubject("Advanced English", "Paraphrasing");
        System.out.println(" ");
        System.out.println("---------------------");
        
        //it is created for electric and electronic engineering only
        //CALCULUS1
        elecEng.createLecture("Calculus1", "buzmez");
        recentLoggedInProf = engFaculty.profLogin("buzmez", "bu123");
        recentLoggedInProf.addSubject("Calculus1", "Introduction to Math");
        recentLoggedInProf.addSubject("Calculus1", "Functions");
        recentLoggedInProf.addSubject("Calculus1", "Function Graphs");
        recentLoggedInProf.addSubject("Calculus1", "Real Numbers and the Real Line");   
        recentLoggedInProf.addSubject("Calculus1", "Intervals");
        recentLoggedInProf.removeSubject("Calculus1", "Introduction to Math"); //introduction to math removed from Calculus1

        recentLoggedInStd = engFaculty.stdLogin("mdiken", "md123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Calculus1", "Functions");
        recentLoggedInStd.findSubject("Calculus1", "Limit");
        recentLoggedInStd.findSubject("Calculus1", "Intervals");
        System.out.println(" ");
        System.out.println("---------------------");
        
        //PHYSIC1
        elecEng.createLecture("Physic1", "ealbayrak");
        recentLoggedInProf = engFaculty.profLogin("ealbayrak", "ea123");
        recentLoggedInProf.addSubject("Physic1", "Introduction to Physic");
        recentLoggedInProf.addSubject("Physic1", "Newton's Laws of Motion");
        recentLoggedInProf.addSubject("Physic1", "Work and Energy");
        recentLoggedInProf.addSubject("Physic1", "Linear Momentum and Collisions ");   
        recentLoggedInProf.removeSubject("Physic1", "Introduction to Physic"); //introduction to physic removed from physic1

        recentLoggedInStd = engFaculty.stdLogin("mdiken", "md123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Physic1", "Work and Energy");
        recentLoggedInStd.findSubject("Physic1", "Newton's Laws of Motion");
        System.out.println(" ");
        System.out.println("---------------------");
        
        
        //INTRODUCTION TO ELECTRIC ELECTRONIC ENGINEERING
        elecEng.createLecture("Introduction to Electric and Electronic Engineering", "sdemir");
        recentLoggedInProf = engFaculty.profLogin("sdemir", "sd123");
        recentLoggedInProf.addSubject("Introduction to Electric and Electronic Engineering", "Electric");
        recentLoggedInProf.addSubject("Introduction to Electric and Electronic Engineering", "Circuits");
        recentLoggedInProf.addSubject("Introduction to Electric and Electronic Engineering", "Electric in Daily Life");
        recentLoggedInProf.addSubject("Introduction to Electric and Electronic Engineering", "Temperature and the First Law of Thermodynamics");   
        recentLoggedInProf.addSubject("Introduction to Electric and Electronic Engineering", "Entropy and the Second Law of Thermodynamics"); 

        recentLoggedInStd = engFaculty.stdLogin("mdiken", "md123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Introduction to Electric and Electronic Engineering", "Electric");
        recentLoggedInStd.findSubject("Introduction to Electric and Electronic Engineering", "Introduction to Electric and Electronic Engineering");
        System.out.println(" ");
        System.out.println("---------------------");
        
        
        //CHEMISTRY
        elecEng.createLecture("Chemistry", "akilic");
        recentLoggedInProf = engFaculty.profLogin("akilic", "ak123");
        recentLoggedInProf.addSubject("Chemistry", "Chemical Kinetics");
        recentLoggedInProf.addSubject("Chemistry", "Speed of Chemical Reactions");
        recentLoggedInProf.addSubject("Chemistry", "Energy in Chemical Reactions");
        recentLoggedInProf.addSubject("Chemistry", "Equilibrium in Chemical Reactions");   
        recentLoggedInProf.addSubject("Chemistry", "Atoms, Molecules and Ions"); 
        recentLoggedInProf.removeSubject("Chemistry", "Chemical Kinetics"); //removed chemical kinetics from the lecture

        recentLoggedInStd = engFaculty.stdLogin("mdiken", "md123");
        recentLoggedInStd.showLectureDetails();
        recentLoggedInStd.listSubjects();
        recentLoggedInStd.findSubject("Chemistry", "Chemical Kinetics");
        recentLoggedInStd.findSubject("Chemistry", "Equilibrium in Chemical Reactions");
        System.out.println(" ");
        System.out.println("---------------------");
        

    }
}
