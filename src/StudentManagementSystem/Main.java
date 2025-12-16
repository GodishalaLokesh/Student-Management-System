package StudentManagementSystem;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			StudentManager manager = new StudentManager();
			
			while(true) {
				System.out.println("----> Student Management System <-----");
				System.out.println("1 Add Student");
				System.out.println("2 remove sudent");
				System.out.println("3 search student");
				System.out.println("4 display student");
				System.out.println("5 Exit");
				System.out.println("Enter your option");
				int option = sc.nextInt();
				
					switch(option) {
					case 1 : System.out.println("Enter Id : ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter name : ");
					String name = sc.nextLine();
					
					System.out.println("Enter age : ");
					int age = sc.nextInt();
					
					System.out.println("Enter marks : ");
					double marks = sc.nextDouble();
					
					Student s = new Student(id,name,age,marks);
					manager.addStudent(s);
					break;
					
					case 2 : System.out.println("Enter id to remove");
					int removeId = sc.nextInt();
					
					if(manager.removeStudent(removeId)) {
						System.out.println("Student removed successfully");
					}
					else {
						System.out.println("Student not found");
					}
					break;
					
					case 3 : System.out.println("Enter Id to search");
					int searchId = sc.nextInt();
					Student found = manager.searchstudent(searchId);
					if(found != null) {
						System.out.println(found);
					}
					else {
						System.out.println("Student found");
					}
					break;
					
					case 4 : manager.displayStudents();
					break;
					
					case 5 : System.out.println("Exiting....");
					break;
					
					default : System.out.println("Invalid number");
					
					
				}
					
			}
			
		}
}
