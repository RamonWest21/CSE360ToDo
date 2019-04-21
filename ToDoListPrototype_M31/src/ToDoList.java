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
	
	public ArrayList<Task> getDeletedTasks(){
		return deletedTasks;
	}
	
	public ArrayList<Task> getCompletedTasks(){
		return completedTasks;
	}
	
	/*
	 * Searches the list of current Tasks for the input description.
	 * Because descriptions are unique, this is all that is needed to
	 * search for a Task. Returns the index of the task if found.
	 * If not found, returns -1.
	 */
	public int getIndexOfTask(String description) {
		for(int i=0; i<currentTasks.size(); i++) {
			if((currentTasks.get(i).getDescription()).equals(description)) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * Adds a Task to the list. First checks to see if the description is unique
	 * meaning that it is not already in the list. If unique, it returns true.
	 * If not unique, the Task is not added and the method returns false.
	 */
	public boolean addTaskToList(Task newTask) {
		System.out.println("adding task to list...");
		
		//Searches the list for a duplicate Task
		boolean duplicate = false;
		for(int i=0; i<currentTasks.size(); i++) {
			if((currentTasks.get(i).getDescription()).equals(newTask.getDescription())) {
				duplicate = true;
			}
		}
		//duplicate description returns false - failed to add
		if(duplicate) {
			return false;
		}
		//no duplicate - Task is added to list
		else if(!duplicate) {
			currentTasks.add(newTask);
			return true;
			
		}
		return false;
	}
	
	void deleteTask() {
		// delete task from list.
		System.out.println("deleting task from list...");
	}
	
	/*
	 * Takes an input Task that will replace the Task at the input index.
	 * Returns true if the Task is successfully changed.
	 * Returns false if the Task is not modified, usually due to an incorrect
	 * index or the new description is one that is already in the list.
	 */
	public boolean changeTask(Task newTask, int index) {
		// edit / replace task from list.
		System.out.println("changing task...");
		
		if(addTaskToList(newTask)) {
			currentTasks.remove(index);
			return true;
		}
		//For when the description is the same but the other options might not be
		else if(newTask.getDescription().equals(currentTasks.get(index).getDescription()) && (newTask.getPriority()!=currentTasks.get(index).getPriority() || !newTask.getDueDate().equals(currentTasks.get(index).getDueDate()))) {
			currentTasks.remove(index);
			addTaskToList(newTask);
			return true;
		}
		return false;
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
