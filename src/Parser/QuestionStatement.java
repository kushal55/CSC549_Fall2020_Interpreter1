package Parser;

public class QuestionStatement extends Statement
{
	private String name;
	
	public QuestionStatement(String name)
	{
		super("Question Statement");
		this.name = name;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + this.name;
	}

	public String getName() 
	{
		return name;
	}	
}
