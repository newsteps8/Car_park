package homework6;

public class ParkPlace {
    // BÜÞRA GÖKMEN
	private int size;//I occured private variables
	private Vehicle vehicle;//I occured private variables

	    public ParkPlace(Vehicle vehicle){// I created a constructor
	        this.vehicle=vehicle;//I created this object
	        this.size=vehicle.getSize();//I created this object
	    }
	    public int getSize(){//I occured a method for size of vehicles
	        if(size == 1)
	    	return 1;
	        else if(size ==2)
	        return 2;
	        else if (size ==3)
	        return 3;
	    	return this.size;
	    }
	    public Vehicle getVehicle(){// I returned information of parkArea
	        return this.vehicle;


	    }
	}






