package homework6;

public class Vehicle {
private String plateNumber;//I occured private variable
private int size;//I occured private variable
      //BÜÞRA GÖKMEN

    public Vehicle(String plateNumber,int size){//I created a constructor
     this.plateNumber = plateNumber;//I occured a this object
     this.size=size;//I occured a this object
    }


   public  String  getPlateNumber(){
	   return this.plateNumber;//I occured a this object
    }

     public int getSize(){//I gave a number to vehicles for their size
	if (size==1)
    	return 4;
	else if (size ==2)
    	 return 2;
	else if (size ==3)
	   return 1;


	return this.size;



     }
     public String getVehicleInfo(){//Program will print information of vehicles
    return "Vehicle Info\n" + "Plate Number: " + this.plateNumber + "\nSize :" + this.size;


    }


}







