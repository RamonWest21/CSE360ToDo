//import java.util.*;

enum Status {
		NOT_STARTED, IN_PROGRESS, COMPLETE
	}
public class Entry {
	String description;
	int priority;
	int dueDate;
	Status status;
	
	void Entry() {
		description = null;
		priority = 0;
		dueDate = 0;
		status = Status.NOT_STARTED;
	}

	void setDescription(String input){
		description = input;
	}
	
	void setPriority(int input) {
		priority = input;
	}
	
	void setDueDate(int monthDateYear) {
		dueDate = monthDateYear;
	}
	
	void setState(Status input) {
		status = input;
	}

	String getDescription() {
		return description;
	}
	
	int getPriority() {
		return priority;
	}
	
	int getDueDate() {
		return dueDate;
	}
	
	Status getStatus() {
		return status;
	}
	
}