import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		ToDoList list = new ToDoList();
		printMenu();
		System.out.println("\nEnter a command.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != 9) {
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
					//list.deleteTask();
					break;
				case 4: 
					//list.changeTask();
					break;
				case 5: 
					//list.completeTask();
					break;
				case 6: 
					//list.printReport();
					break;
				case 7: 
					list.save();
					break;
				case 8: 
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
		System.out.println("6: print report");
		System.out.println("7: save");
		System.out.println("8: restore");
		System.out.println("9: terminate program");
	}
}
