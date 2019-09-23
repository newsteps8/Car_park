package homework6;

public class Test {


       // BÜÞRA GÖKMEN

	public static void main(String[] args) {
         //I will control Vehicle,ParkPlace,Ticket,CarPark files by this objects in this test class
		 Vehicle vehicle1 =new Vehicle("34KG3916",4);
		 Vehicle vehicle2 =new Vehicle("34CSE1142",2);
		 Vehicle vehicle3 =new Vehicle("34CSE1143",1);
		 Vehicle vehicle4=new Vehicle ("34CSE1143",2);
		 Vehicle vehicle5 = new Vehicle ("34CSE1144",4);
	     System.out.println(vehicle1.getVehicleInfo());
         System.out.println(vehicle2.getVehicleInfo());
		 System.out.println(vehicle3.getVehicleInfo());
         System.out.println(vehicle4.getVehicleInfo());
         System.out.println(vehicle5.getVehicleInfo());
         ParkPlace parkarea1 = new ParkPlace(vehicle1);
         ParkPlace parkarea2 = new ParkPlace(vehicle2);
         ParkPlace parkarea3 = new ParkPlace(vehicle3);
         ParkPlace parkarea4 = new ParkPlace(vehicle4);
         ParkPlace parkarea5 = new ParkPlace(vehicle5);
         System.out.println(parkarea1.getVehicle());
         System.out.println(parkarea2.getVehicle());
         System.out.println(parkarea3.getVehicle());
         System.out.println(parkarea4.getVehicle());
         System.out.println(parkarea5.getVehicle());

	}
}
