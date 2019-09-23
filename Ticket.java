package homework6;

public class Ticket {
	    //BÜÞRA GÖKMEN
	    private Vehicle vehicle;//I occured private variable
	    private java.util.Date entryDate;//I occured private variable
	    private java.util.Date exitDate;//I occured private variable
	    private double totalPrice;//I occured private variable
	    public int numberOfTickets;


	    public Ticket(Vehicle vehicle,java.util.Date entryDate){//I created a constructor
	        this.vehicle=vehicle;//I occured this object
	        this.entryDate=entryDate;//I occured this object

	    }
	    public double calculatePrice(double hourlyPrice, java.util.Date entryDate){//This method will calculate total price of vehicles
	    return totalPrice = vehicle.getSize() * hourlyPrice;//*(Math.ceil(entryDate));


	    }
	    public String getTicketInfo(){//This method include information of tickets
			return "Ticket Info\n"+"Plate number :" + vehicle.getPlateNumber();


	    }
	    public Vehicle getVehicle(){
			return vehicle;

	    }
	    public double getPrice(){
			return totalPrice;

	    }




}



