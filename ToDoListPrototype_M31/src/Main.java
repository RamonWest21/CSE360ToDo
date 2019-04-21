import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		ToDoList list = new ToDoList();
		printMenu();
		System.out.println("\nEnter a command.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != 12) {
			if (input < 1 || input > 12) {
				System.out.println("Enter a valid command");
			}
			switch (input) {
				case 1: printMenu();
					break;
				case 2: 
					Task newTask = new Task("this is task 1", "4/20/2019", 1);
					if(list.addTaskToList(newTask)) {
						list.testPrint();
					}
					break;
				case 3: 
					list.deleteTask();
					break;
				case 4: 
					list.changeTask();
					break;
				case 5: 
					list.completeTask();
					break;
				case 6: 
					list.sortByDescription();
					list.displayToGUI();
					break;
				case 7: 
					list.sortByPriority();
					list.displayToGUI();
					break;
				case 8: 
					list.sortByStatus();
					list.displayToGUI();
					break;
				case 9: 
					list.printReport();
					break;
				case 10: 
					list.save();
					break;
				case 11: 
					list.restore();
					break;
			}
			input = scan.nextInt();
		}
		System.in.close();
	}

	static void printMenu() {
		System.out.println("1: print menu");
		System.out.println("2: add new task");
		System.out.println("3: change task");
		System.out.println("4: change task");
		System.out.println("5: complete task");
		System.out.println("6: display by description");
		System.out.println("7: display by priority");
		System.out.println("8: display by status");
		System.out.println("9: print report");
		System.out.println("10: save");
		System.out.println("11: restore");
		System.out.println("12: terminate program");
	}
}
