// import java.lang.StackWalker.Option;
// import java.util.ArrayList;
// import java.util.List;

public class dhairya_018_lab2 {
   
    public static enum CarType {

        Sedan,
        Coupe,
        Van,
        SUV;

        public static dhairya_018_lab2.CarType valueOf(dhairya_018_lab2.CarType type) {
            return null;
        }
      }

    private String man;
    private int year;
    private String model;
    private int vin;
    private double price;
    private CarType type;

    public dhairya_018_lab2 (String man, int year, String model, int vin, double price, CarType type){
         this.man = man;
         this.year = year;
         this.model = model;
         this.vin = vin;
         this.price = price;
         this.type = CarType.valueOf(type);    }
   
   
    public String toString(){
         return "Manufacturer Name: "+man+" year: "+year+" model: "+model+" price: $"+price+"Car Type: "+type;
    }
   
         
}