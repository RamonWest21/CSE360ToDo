//Libraries
import java.util.ArrayList;

public class ToDoList {
	ArrayList<Task> currentTasks;
	ArrayList<Task> completedTasks;
	ArrayList<Task> deletedTasks;
	
	/**
	 * Constructor with no parameters. Initializes 3 ArrayLists
	 */
	ToDoList() {
		this.currentTasks = new ArrayList<Task>(); //in progress or not started
		this.completedTasks = new ArrayList<Task>(); //completed
		this.deletedTasks = new ArrayList<Task>(); //deleted
	}	
	
	/*
	 * Prints the description, due date, and priority of all elements in currentTasks
	 */
	void testPrint() {
		System.out.println();
		for(int i=0; i<currentTasks.size(); i++) {
			System.out.print(currentTasks.get(i).getDescription());
			System.out.print("\t" + currentTasks.get(i).getDueDate());
			System.out.print("\t" + currentTasks.get(i).getPriority());
			System.out.println();
		}
	}
	
	public ArrayList<Task> getCurrentTasks(){
		return currentTasks;
	}
	
	public boolean addTaskToList(Task newTask) {
		System.out.println("adding task to list...");
		
		//Searches the list for a duplicate Task
		boolean duplicate = false;
		for(int i=0; i<currentTasks.size(); i++) {
			if((currentTasks.get(i).getDescription()).equals(newTask.getDescription())) {
				duplicate = true;
			}
		}
		if(duplicate) {
			return false;
		}
		else if(!duplicate) {
			System.out.println("ADDED");
			currentTasks.add(newTask);
			return true;
			
		}
		return false;
	}
	
	void deleteTask() {
		// delete task from list.
		System.out.println("deleting task from list...");
	}
	
	void changeTask() {
		// edit / replace task from list.
		System.out.println("changing task...");
	}
	
	void completeTask() {
		// change status to complete and remove from list.
		System.out.println("setting task status to complete...");
	}
	
	void displayToGUI() {
		// display current list to GUI.
		System.out.println("displaying To Do list...");
	}
	
	void sortByDescription() {
		// sort alphabetically by description.
		System.out.println("sorting by description...");
	}
		
	void sortByPriority() {
		// sort by priority.
		System.out.println("sorting by priority...");
	}
	
	void sortByStatus() {
		// sort by status.
		System.out.println("sorting by status...");
	}
	
	void reverseList() {
		// reverse list.
		// Useful for sorting lists by increasing or decreasing order.
		System.out.println("reversing list...");
	}
	
	void printReport() {
		// print all content and status to a file. 
		// requires File I/O.
		System.out.println("printing list to report...");
	}
	
	void save() {
		// format the list and save to file. 
		// requires File I/O.
		System.out.println("saving list...");
	}
	
	void restore() {
		// read from file to restore previous session.
		// requires File I/O.
		System.out.println("restoring list...");
	}
}
