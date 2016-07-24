
public class Info
{
	private String name;
	private int age;
	private String gender;
	

	
	public Info(String name, int age,String gender) 
	
	{
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void displayinfo()
	{
	    System.out.println("Name:"+name);
	    
	    System.out.println("Age:"+age);
	    System.out.println("Gender:"+gender);
	}
}
