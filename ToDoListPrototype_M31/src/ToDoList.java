import java.util.ArrayList;
public class ToDoList {
	Entry listElement;
	int size;

	void ToDoList() {
		listElement = null;
		size = 0;
	}
	
	void ToDoList(Entry entryInput, int sizeInput ) {
		listElement = entryInput;
		size = sizeInput;
		ArrayList<Entry> toDoList = new ArrayList<Entry>();
	}
	
	
}
