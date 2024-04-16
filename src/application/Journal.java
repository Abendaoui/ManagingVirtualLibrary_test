package application;

public class Journal implements Searchable {
	
	String title;
	int number;
	public Journal(String title,int number) {
		this.title = title;
		this.number = number;
	}
	
	// Getters && Setters
	// Get
	public String getTitle() {
		return this.title;
	}
	public int getNumber() {
		return this.number;
	}
	
	//Set
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	}
	
	@Override
    public void consult() {
        System.out.println("View the magazine " + this.title + " n°" + this.number + ".");
    }

}

