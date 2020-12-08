package Parser;

import java.util.ArrayList;

public class ExpressionTree extends ExpressionPart
{
	private ArrayList<ExpressionPart> ExpressionParts;
	
	public ExpressionTree(ArrayList<ExpressionPart> ExpressionParts)
	{
		super("Expression Tree");
		this.ExpressionParts = ExpressionParts;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.ExpressionParts;
	}

	public ArrayList<ExpressionPart> getExpressionParts() 
	{
		return ExpressionParts;
	}
	
}
