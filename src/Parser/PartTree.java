package Parser;

public abstract class PartTree 
{
	protected String partType;
	
	public PartTree(String partType)
	{
		this.partType = partType;
	}
	
	public String toString()
	{
		return "partType: " + this.partType;
	}

	public String getPartType() 
	{
		return partType;
	}
}
