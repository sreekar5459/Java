class Car
{
	private String brand;
	private int noOfWheels;
	private String Colour;
	private int year;
//	
//     void setBrand(String brand)
//     {
//    	 brand=brand;
//     }
//     String getBrand()
//     {
//    	return brand; 
//     }
//     
//     void setNoOfWheels(int noOfWheels)
//     {
//    	  noOfWheels = noOfWheels;
//     }
//     int getNoOfWheels()
//     {
//    	 return noOfWheels;
//     }
//     
//     
//     
//     void setYear(int year)
//     {
//    	 year=year;
//     }
//     int getYear()
//     {
//    	 return year;
//     }
//	
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	String getColour() {
		return Colour;
	}
	void setColour(String colour) {
		Colour = colour;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	
	
}
public class LaunchEncapCar 
{
	public static void main(String [] args)
	{
		Car c=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		c.setBrand("HYUNDAI");
		c1.setNoOfWheels(4);
		c2.setYear(2023);
		c3.setColour("AMAZONGRAY");
		
		String brand=c.getBrand();
		int noOfWheels=c1.getNoOfWheels();
		int year=c2.getYear();
		String colour=c3.getColour();
		System.out.println(brand+"  " +colour+"  "+ noOfWheels+ "  " +year);
		
	}

}
