//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 22/04/2019
//Purpose of this file- Main Class
package labtask3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShipApp {
    public static void main (String[]args) {
        int option, shipSelection;
        Scanner read = new Scanner(System.in);
        ArrayList<Ship> shipList = new ArrayList<>();
         
         do{
             System.out.print("*******************\n" + //display menu
                                "1. Add Cruise Ship or Cargo Ship.\n" +
                                "2. Edit Ship Capacity.\n" +
                                "3. Display\n"+
                                "4. Exit\n"+
                                "*********************\n" +
                                "Please the enter the number '1' '2' '3' '4':\n");
              option = read.nextInt();
              
              switch(option) {
                  case 1:
                  {
                      System.out.println("What ship do your want? ");
                      System.out.println("1. Cruise Ship");
                      System.out.println("2. Cargo Ship");
                      
                      shipSelection = read.nextInt();
                      
                      switch(shipSelection) {
                          case 1:  //Case 1 ask for cruise ship input
                          {
                              System.out.println("Enter Cruise Ship Name ");
                              String shipName = read.next();
                              System.out.println("Enter Cruise Ship Year ");
                              String year = read.next();
                              System.out.println("Enter the number of Passenger");
                              int MaximumPassenger = read.nextInt();
                              
                              CruiseShip CruiseShipObj = new CruiseShip(); //object
                              CruiseShipObj.setShipName(shipName); 
                              CruiseShipObj.setYear(year);
                              CruiseShipObj.setMaximumPassenger(MaximumPassenger);
                              shipList.add(CruiseShipObj); //adding to a arrayList.
                              
                              break;
                          }
                          
                          case 2: //case 2 ask for cargo ship input
                          {
                              System.out.println("Enter Cargo Ship Name ");
                              String shipName = read.next();
                              System.out.println("Enter Cargo Ship Year ");
                              String year = read.next();
                              System.out.println("Enter the Cargo Capacity");
                              int CargoCapacity = read.nextInt();
                              
                              CargoShip CargoShipObj = new CargoShip();
                              CargoShipObj.setShipName(shipName);
                              CargoShipObj.setYear(year);
                              CargoShipObj.setCargoCapacity(CargoCapacity);
                              shipList.add(CargoShipObj);
                              
                              break;
                          }
                      }
                      break;
                  }
                  case 2:
                  {
                      System.out.println("Input the Array index number of the Ship\n"); //entering index number of of the ship the user wants to edit
                      int index = read.nextInt();
                      
                      if (shipList.get(index)instanceof CruiseShip) { //using instance of
                          System.out.println("Enter the new Passenger Number for Ship Index "+index);
                          int PassengerNumber = read.nextInt();
                          CruiseShip cruiseShipObjDownCast =(CruiseShip) shipList.get(index); //this is down casting
                          cruiseShipObjDownCast.setMaximumPassenger(PassengerNumber);
                          System.out.println("New Passenger Number have been updated.");
                          
                      } else if (shipList.get(index)instanceof CargoShip) {
                          System.out.println("Enter the new Cargo Capacity for Ship Index "+index);
                          int CargoCapacity = read.nextInt();
                          CargoShip cargoship =(CargoShip) shipList.get(index);
                          cargoship.setCargoCapacity(CargoCapacity);
                          System.out.println("New Cargo Capacity have been updated.");
                      }
                      
                  }
                  
                  break;
                      
                  case 3:
                  {
                      for(Ship data: shipList){ //displaying all the data for each to display
                          data.displayDetails();
                          System.out.println();
                      }
                      
                      /*Iterator <Ship> itr = shipList.iterator();
                      while(itr.hasNext()) {
                          Ship element = itr.next();
                          System.out.println(element);
                      }*/
                      
                  }
                  break;
                  
                  case 4: 
                  {
                      option = 0;
                      break;
                  }
                  default:
                  {
                      System.out.println("You have inputted the wrong value. ");
                      
                  }

                  }
                 
              
             
         }while (option!=0);
    }
    
}
