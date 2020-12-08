package Parser;

public abstract class StatementPart extends PartTree
{
	private static String partType;

	public StatementPart(String partType)
	{
		super("Statement Part");
		this.partType = partType;
	}
	public String toString()
	{
		return super.toString() + "\n\t" + this.partType;
	}
	public String getPartType() 
	{
		return partType;
	}

}
