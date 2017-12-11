
public class Childhood extends Room{
	//get input from user for name of friend?
	private String[] cfriend;
	private String[] school;
	private long age;
	private double fun;
	//make fun a parameter to see how much the person enjoyed childhood???
	
	public Childhood(Person occupant, int xLoc, int yLoc, String[] cfriend, String[] school, int age, double fun1)
	{
		super(occupant, xLoc, yLoc);
		this.cfriend = cfriend;
		this.school = school;
		this.age = age;
		this.fun = fun;
	}
	public String[] cfriend()
	{
		return cfriend;
	}
	public String[] school()
	{
		return school;
	}
	public long getAge()
	{
		return age;
	}
	
	
	//i have no idea what i'm doing
	if(findKeyword(statement, "happy") >= 0)
	{
		fun++;
	}
}
