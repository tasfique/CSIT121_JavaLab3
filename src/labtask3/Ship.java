//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 22/04/2019
//Purpose of this file- Ship Class
package labtask3;


public abstract class Ship {
    String  shipName;
    String year;
    
    
    public Ship () { //default constructor 
        shipName = null;
        year = null;
    }
    
    public void setShipName (String shipName) { //setter
        this.shipName = shipName;
    }
    
    public void setYear (String year) {
        this.year = year;
    }
    
    public String getShipName () { //getter
        return shipName;
    }
    
    public String getYear () {
        return year;
    }
    
    public abstract void displayDetails();  //abstract method
    
    
           

    
}
