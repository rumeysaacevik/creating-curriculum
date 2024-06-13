Creating a Curriculum 

- The main purpose of the program is creating engineering faculty lectures with professors adding and removing lectures and accessing this curriculum by students.

- Program Objects and Relationships: The created objects are faculty and departments, and the relationship between them is faculties is creating from departments. 

- The main purpose of use of object Faculty is, it is an object that can gather department together.

- The main purpose of object department is, define the courses and make the curriculum clear by listing the topics within these courses.


Complex Rules  (5-7 Rules) 

• It uses the arguments we gave in the test with the createProfessor method and also assigns an id of its own and adds it and creates an object. The reason is that if there is a professor with the same name and surname, they all have a unique number via id. 

• It uses the arguments we gave in the test with the createStudent method and also assigns an id of its own and adds it and creates an object. The reason is that if there is a student with the same name and surname, they all have a unique number via id. 

• The student who successfully enters the system with the showLectureDetails method can see the details of the lectures. 

•Professors can add and remove courses from the curriculum with the addSubject and removeSubject methods. 

•With the listSubjects method, students can list the lectures and subjects they will take and with the findSubject method, they can search for a topic and find out whether it is in that lecture. 

•With profLogin method it looks at the professors in all departments and logs in if it finds the conditions and with stdLogin method it looks at the students in all departments and logs in if it finds the conditions. 

•With the createLecture method, a name and a username are taken. If there is a proffessor with that username in the professors in the department, it is kept in the prof target, then the create lecture in the admin is created by assigning the target to the professor and

added to the department courses, and all students in the department are assigned this course if there is no proffessor nothing is added, returns error sentence.


![umllll](https://github.com/rumeysaacevik/creating-curriculum/assets/169652554/3596ac31-3cae-4c7b-b8d8-a6087d297a9b)

