//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 22/04/2019
//Purpose of this file- Cargoship Class
package labtask3;

public class CargoShip extends Ship {
     private int CargoCapacity;
    
    public CargoShip () {
        
        super();
        shipName = null;
        year = null;
        CargoCapacity = 0;
    }
    
    public void setCargoCapacity (int CargoCapacity) {
        this.CargoCapacity = CargoCapacity;
    }
    
    public int getMaximumPassenger () {
        return CargoCapacity;
    }
    
    @Override
     public void displayDetails() {
         System.out.println("The Name of the Ship is "+super.shipName);
         System.out.println("The Year of the Ship is "+super.year);
         System.out.println("The Cargo Capacity is "+CargoCapacity);
     }
    
}
