package application;

import java.util.ArrayList;
import java.util.List;


public class Library <Resource extends Searchable & Borrowable> {
	private List<Resource> resources;
    
    
    public Library() {
        this.resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
    	  resources.add(resource);
    }
    
    private boolean isValidIndex(int index) {
        return index >= 0 && index < resources.size();
    }

    public void borrowResource(int index) {
    	if (isValidIndex(index)) {
	        if(resources.get(index) instanceof Borrowable) {
	        	resources.get(index).borrowResource();
	        }else {
	        	System.out.println("You Cannot Borrow A Journal.");
	        }
    	}
        else {
            System.out.println("Invalid resource index!");
        }
    }

    public void returnResource(int index) {

    	if (isValidIndex(index)) {
	            if(resources.get(index) instanceof Borrowable) {
	            	resources.get(index).returnResource();
	            }else {
	            	System.out.println("You Cannot Return A Journal.");
	            }	
    	}
        else {
            System.out.println("Invalid resource index!");
        }
    }

    public void consultResource(int index) {
    	if (isValidIndex(index)) {
    		resources.get(index).consult();
    	}
        else {
            System.out.println("Invalid resource index!");
        }
        
    }
}