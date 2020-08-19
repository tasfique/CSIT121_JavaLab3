//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 22/04/2019
//Purpose of this file- Cruise Class
package labtask3;

public class CruiseShip extends Ship {
    private int MaximumPassenger;
    
    public CruiseShip () {
        
        super(); //this is overriding, using final can stop something to be overridden.
        shipName = null;
        year = null;
        MaximumPassenger = 0;
    }
    
    public void setMaximumPassenger (int MaximumPassenger) { //setter
        this.MaximumPassenger = MaximumPassenger;
    }
    
    public int getMaximumPassenger () { //getter
        return MaximumPassenger;
    }
    
    @Override
     public void displayDetails() { 
         System.out.println("The Name of the Ship is "+super.shipName);
         System.out.println("The Year of the Ship is "+super.year);
         System.out.println("Maximum Passenger for the Ship is "+MaximumPassenger);
         
     }
    
    
}
