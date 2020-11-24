package Parser;

public class UpdateStatement extends Statement

{
	private String name;
	private int value;
	
	public UpdateStatement(String name, int value)
	{
		super("Update Statement");
		this.name = name;
		this.value = value;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + 
				this.name + " = " + this.value;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int newValue)
	{
		this.value = newValue;
	}

}
