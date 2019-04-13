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
		ArrayList<Task> currentTasks = new ArrayList<Task>();
		ArrayList<Task> completedTasks = new ArrayList<Task>();
		ArrayList<Task> deletedTasks = new ArrayList<Task>();
	}	
	
	public boolean addTaskToList(Task newTask) {
		return false;
	}
}
