public class cartest { 
public static void main(String[] args) { 
//creating 2 objects of Dealership  
dealership D1=new dealership("D001","John's","12 Lane View, NewYork"); dealership D2=new dealership("D001","Mack's","22 Park View, NewJersey"); //adding 3 cars to dealers carList
D1.addCar("Honda", 2018, "Civic", 35000, CarType.SUV); D1.addCar("Nissan",2019, "Micra", 45000, CarType.SEDAN); D1.addCar("Mitshubishi",2020, "MMXV", 60000, CarType.HATCHBACK); D2.addCar("Toyota", 2018, "T-15", 100000, CarType.TRUCK); D2.addCar("Land Rover",2022, "LR22", 85000, CarType.SEDAN); D2.addCar("Bugatti",2020, "BUXX", 90000, CarType.SUV); //calling showcars() for D1 
System.out.print(D1); 
D1.showCars("Nissan"); 
D1.showCars("Honda",2018); 
D1.showCars("Mitshubishi",2020,50000); 
//calling showcars() for D2 
System.out.print(D2); 
D2.showCars("Toyota"); 
D2.showCars("Bugatti",2022); 
D2.showCars("Bugatti",2020,80000); 
System.out.println(); 
}  
}
