package application;

public class Book implements  Borrowable,Searchable {
	
	String title;
	String author;
	boolean borrow;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
		this.borrow = false;
	}
	
	// Getters && Setters
	// Get
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public boolean getBorrowStatus() {
		return this.borrow;
	}
	
	// Set
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	public void setBorrowStatus(boolean newStatus) {
		this.borrow = newStatus;
	}
	
	@Override
	public void borrowResource() {
		if (!this.getBorrowStatus()) {
			this.setBorrowStatus(true);
            System.out.println("The book " + this.getTitle() + " has been borrowed.");
        } else {
            System.out.println("The book " + this.getTitle() + " has already been borrowed.");
        }
	}
	
	@Override
	public void returnResource() {
		if (this.getBorrowStatus()) {
			this.setBorrowStatus(false);
		    System.out.println("The book " + title + " has been returned.");
		} else {
		    System.out.println("The book " + title + " is not borrowed.");
		}
	}
	
	@Override
	public boolean isBorrowing() {
		return this.getBorrowStatus();
	}
	
	@Override
    public void consult() {
        System.out.println("Book " + this.getTitle() +" By "+ this.getAuthor() +".");
    }
	
	

	

}