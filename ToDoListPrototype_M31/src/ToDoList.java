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
	
	
	
	public ArrayList<Task> getCurrentTasks(){
		return currentTasks;
	}
	
	public ArrayList<Task> getDeletedTasks(){
		return deletedTasks;
	}
	
	public ArrayList<Task> getCompletedTasks(){
		return completedTasks;
	}
	
	public Task getTask(int index) {
		return currentTasks.get(index);
	}
	

	
	/*
	 * Adds a Task to the list. First checks to see if the description is unique
	 * meaning that it is not already in the list. If unique, it returns true.
	 * If not unique, the Task is not added and the method returns false.
	 */
	public boolean addTaskToList(Task newTask) {
		System.out.println("adding task to list...");
		boolean uniqueDescription = checkUniqueDescription(currentTasks, newTask);
		boolean uniquePriority = checkUniquePriority(currentTasks, newTask);
		
		//duplicate description or priority returns false - failed to add
		if(uniqueDescription) {
			currentTasks.add(newTask);
			return true;
		}
		//no duplicate - Task is added to list
		else if(!uniqueDescription) {
			return false;
			
		}
		return false;
	}
	
	public boolean deleteTask(Task task) {
		// delete task from list.
		System.out.println("deleting task from list...");
		boolean taskDoesNotExist = checkUniqueDescription(currentTasks, task);
		
		//if the task does not exist - nothing is removed from 'current' list
		if(taskDoesNotExist) {
			return false;
		}
		//if the task exists - add to 'deleted' list then remove from 'current' list.
		else if(!taskDoesNotExist) {
			deletedTasks.add(task);
			currentTasks.remove(task);
			return false;
			
		}
		return false;
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
		else if(newTask.getDescription().equals(currentTasks.get(index).getDescription()) 
				&& (newTask.getPriority()!=currentTasks.get(index).getPriority() 
				|| !newTask.getDueDate().equals(currentTasks.get(index).getDueDate()))) 
		{
			currentTasks.remove(index);
			addTaskToList(newTask);
			return true;
		}
		return false;
	}
		/*
	 * Searches the list of current Tasks for the input description.
	 * Because descriptions are unique, this is all that is needed to
	 * search for a Task. Returns the index of the task if found.
	 * If not found, returns -1.
	 */
	public int getIndexOfTask(String description) {
		for(int index = 0; index < currentTasks.size(); index++) {
			if((currentTasks.get(index).getDescription()).equals(description)) {
				return index;
			}
		}
		return -1;
	}
	
	public boolean completeTask(Task completeTask, int index) {
		// change status to complete, remove from toDolist, add to complete list. 
		System.out.println("setting task status to complete...");
		
		return false;
	}
	
	private boolean checkUniqueDescription(ArrayList<Task> list, Task task) {
		boolean unique = true;
		for(int index = 0; index < list.size(); index++) {
			if((list.get(index).getDescription()).equals(task.getDescription())) {
				unique = false;
			}
		}
		if(unique) {
			 return true;
		}
		else if (!unique) {
			return false;
		}
		return false;
	}
	
	private boolean checkUniquePriority(ArrayList<Task> list, Task task) {
		boolean unique = true;
		for(int index = 0; index < list.size(); index++) {
			if((list.get(index).getPriority()) == (task.getPriority())) {
				unique = false;
			}
		}
		if(unique) {
			 return true;
		}
		else if (!unique) {
			return false;
		}
		return false;
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
	/*
	 * Prints the description, due date, and priority of all elements in currentTasks
	 */
	void testPrint() {
		System.out.println();
		for(int index = 0; index < currentTasks.size(); index ++) {
			System.out.print(currentTasks.get(index).getDescription());
			System.out.print("\t" + currentTasks.get(index).getDueDate());
			System.out.print("\t" + currentTasks.get(index).getPriority());
			System.out.println();
		}
	}
}
