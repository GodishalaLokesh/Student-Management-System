package StudentManagementSystem;
import java.util.*;
public class StudentManager {
		private ArrayList<Student> studentList = new ArrayList<>();
		
		//Add student
		public void addStudent(Student s) {
			studentList.add(s);
			System.out.println("Student added successfully");
		}
		
		//Remove student
		public boolean removeStudent(int id) {
			for (Student s : studentList) {
				if(s.getId() == id) {
					studentList.remove(s);
					return true;
				}
			}
			return false;
		}
		
		//search student
		public Student searchstudent(int id) {
			for (Student s : studentList) {
				if(s.getId()==id) {
					return s;
				}
			}
			return null;
		}
		//display all students
		public void displayStudents() {
			if(studentList.isEmpty()) {
				System.out.println("No student found");
				return;
			}
			for (Student s : studentList) {
				System.out.println(s);
			}
			
		}
}
