package Parser;

public abstract class ExpressionPart extends PartTree
{
	private static String partType;

	public ExpressionPart(String partType)
	{
		super("Expression Part");
		this.partType = partType;
	}
}
