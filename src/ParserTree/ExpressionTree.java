package ParserTree;

import java.util.ArrayList;

public abstract class ExpressionTree extends ExpressionPart
{
	private ArrayList<ExpressionPart> theComponents;
	
	public ExpressionTree()
	{
		super();
		this.theComponents = new ArrayList<ExpressionPart>();	
	}
}
