//Libraries
import java.util.*;
import java.io.*;

enum Status {
		NOT_STARTED, IN_PROGRESS, COMPLETE
	}
public class Task implements Serializable{
	String description, dueDate, finishDate, startDate;
	Status status;
	int priority;
	
	/**
	 * Constructor that takes a parameter for the description, due date, and priority of a Task
	 */
	Task(String description, String dueDate, int priority) {
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.finishDate = "Never";
		this.status = Status.NOT_STARTED;
	}

	public void setDescription(String input){
		this.description = input;
	}
	
	public void setPriority(int input) {
		this.priority = input;
	}
	
	public void setDueDate(String monthDateYear) {
		this.dueDate = monthDateYear;
	}
	
	public void setStatus(Status input) {
		this.status = input;
	}

	public String getDescription() {
		return description;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public Status getStatus() {
		return status;
	}
	
}