package ParserTree;

public class LiteralExpressionTree extends ExpressionTree
{
	private int value;
	
	public LiteralExpressionTree(int value)
	{
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
