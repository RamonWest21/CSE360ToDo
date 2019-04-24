//Libraries
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;

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
	

	
	/**
	 * <p>
	 * Adds a Task to the list. First checks to see if the description is unique
	 * meaning that it is not already in the list. If unique, it returns true.
	 * If not unique, the Task is not added and the method returns false.
	 * </p>
	 * @param Task	-	task object to add to the ArrayList.
	 * @author Tanner Cooper
	 */
	public boolean addTaskToList(Task newTask) {
		System.out.println("adding task to list...");
		boolean uniqueDescription = checkUniqueDescription(currentTasks, newTask);
		boolean uniquePriority = checkUniquePriority(currentTasks, newTask);
		int count = 1;
		for(int i=0; i < currentTasks.size(); i++) {
			if(currentTasks.get(i).getPriority()==count) {
				count++;
			}
		}
		newTask.setPriority(count);
		
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
	/**
	 * <p>
	 * Checks to see if the task exists. Adds task to deletedTasks list, then removes the task from currentTasks list. 
	 * </p>
	 * @param Task	-	task object to search for in the ArrayList and remove. 
	 * @author Ramon West
	 */
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
			return true;
			
		}
		return false;
	}
	
	
	/**
	 * <p>
	 * Takes an input Task that will replace the Task at the input index.
	 * Returns true if the Task is successfully changed.
	 * Returns false if the Task is not modified, usually due to an incorrect
	 * index or the new description is one that is already in the list.
	 * </p>
	 * @param Task	-	takes in a Task object.
	 * @param index	-	takes in an int value representing the index of Task in the ArrayList.
	 * @author Tanner Cooper
	 */
	public boolean changeTask(Task newTask, int index) {
		// edit / replace task from list.
		System.out.println("changing task...");
		boolean uniqueDescription = checkUniqueDescription(currentTasks, newTask);
		
		if(uniqueDescription) {
			currentTasks.set(index, newTask);
			return true;
		}

		//For when the description is the same but the other options might not be
		else if(newTask.getDescription().equals(currentTasks.get(index).getDescription()) 
				&& (newTask.getPriority()!=currentTasks.get(index).getPriority() 
				|| !newTask.getDueDate().equals(currentTasks.get(index).getDueDate()))) 
		{
			currentTasks.set(index, newTask);
			return true;
		}
		return false;
	}
	
	/**
	 * <p>
	 * Sets the Task status to complete. Adds Task to completedTasks ArrayList. Removes Task from currentTasks ArrayList.
	 * </p>
	 * @param Task	-	Task object to set to complete.
	 * @param index	-	int value for the index of the Task in the currentTasks ArrayList.
	 * @return boolean	- true if completed, false if the Task does not exist.
	 * @author Ramon West
	 */
	public boolean completeTask(Task completeTask, int index) {
		// change status to complete, remove from toDolist, add to complete list. 
		System.out.println("setting task status to complete...");
		boolean taskDoesNotExist = checkUniqueDescription(currentTasks, completeTask);
		//if the task does not exist - nothing is removed from 'current' list
		if(taskDoesNotExist) {
			return false;
		}
		//if the task exists - add to 'completed' list then remove from 'current' list.
		else if(!taskDoesNotExist) {
			completedTasks.add(completeTask);
			currentTasks.remove(completeTask);
			return true;
		}
		return false;
	}
	
	/**
	 * <p>
	 * Searches the list of current Tasks for the input description.
	 * Because descriptions are unique, this is all that is needed to
	 * search for a Task. Returns the index of the task if found.
	 * If not found, returns -1.
	 * </p>
	 * @param String description	-	String type Task description. 
	 * @return int index	-	index of the Task, if found. If not found, index = -1.
	 * @author Tanner Cooper
	 */
	public int getIndexOfTask(String description) {
		for(int index = 0; index < currentTasks.size(); index++) {
			if((currentTasks.get(index).getDescription()).equals(description)) {
				return index;
			}
		}
		return -1;
	}
	
	/**
	 * <p>
	 * Checks if the Task description is unique. 
	 * </p>
	 * @param ArrayList list	-	ArrayList of type 'Task.'
	 * @param Task	task			-	Task object.
	 * @return boolean	 -	Returns true if the Task description field is unique in the ArrayList. Returns false if the description exists.	 
	 * @author Ramon West
	 */
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
	
	/**
	 * <p>
	 * Checks if the Task priority is unique. 
	 * </p>
	 * @param ArrayList list	-	ArrayList of type 'Task.'
	 * @param Task	task			-	Task object.
	 * @return boolean	 -	Returns true if the Task priority field is unique in the ArrayList. Returns false if the priority is taken.	 
	 * @author Ramon West
	 */
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
	
	/**
	 * <p>
	 * Prints report to Report.txt. Parses through the currentTasks, completedTasks, and deletedTasks ArrayLists to print each task and its properties.
	 * Current tasks will print description, start date, due date, and priority.
	 * Completed tasks will print description, start date, due date, and finish date.
	 * Deleted tasks will print description, start date, due date, and finish date.
	 * </p>
	 * @author Ramon West
	 */
	/*public void printReport() {
		// print all content and status to a file. 
		// requires File I/O.
		System.out.println("printing list to report...");
		try (PrintWriter out = new PrintWriter("Report.txt")) {
		    out.println("\nCurrent To Do List");
		    for (int index = 0; index < currentTasks.size(); index++) {
		    	out.println("\nDescription: " + currentTasks.get(index).getDescription()
		    			+ "\tStart Date:" + currentTasks.get(index).getStartDate()
		    			+ "\tDue Date: " + currentTasks.get(index).getDueDate()
						+ "\tPriority: " + currentTasks.get(index).getPriority());		    
		    }
		    
		    out.println("\nCompleted Tasks")
		    for (int index = 0; index < completedTasks.size(); index++) {
		    	out.println("\nDescription: " + completedTasks.get(index).getDescription()
		    			+ "\tStart Date:" + completedTasks.get(index).getStartDate()
		    			+ "\tDue Date: " + completedTasks.get(index).getDueDate()
						+ "\tFinish Date: " + completedTasks.get(index).getFinishDate());		    
		    }
		    
		    out.println("\nDeleted Tasks")
		    for (int index = 0; index < deletedTasks.size(); index++) {
		    	out.println("\nDescription: " + deletedTasks.get(index).getDescription()
		    			+ "\tStart Date:" + deletedTasks.get(index).getStartDate()
		    			+ "\tDue Date: " + deletedTasks.get(index).getDueDate()
		    			+ "\tFinish Date: " + deletedTasks.get(index).getFinishDate());		    
		    }
		}
		out.close();
	}*/
	
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
