class Phone
{
	private String name;
	private int model;
	private String Color;
	private int year;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getModel()
	{
		return model;
	}
	public void setModel(int model)
	{
		this.model=model;
	}
	public String getColor()
	{
		return Color;
	}
	public void setColor(String Color)
	{
		this.Color=Color;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	
	
	
}
public class Launch1 {

	public static void main(String[] args) {
		
		Phone p1=new Phone();
		Phone p2=new Phone();
		Phone p3=new Phone();
		Phone p4=new Phone();
		
		p1.setName("Iphone");
		p2.setModel(13);
		p3.setColor("Sky Blue");
		p4.setYear(2021);
		
		String name=p1.getName();
		int model=p2.getModel();
		String Color=p3.getColor();
		int year=p4.getYear();
		
		System.out.println(name+ "  "+model+ "  "+Color+ "  "+year);
	}

}
