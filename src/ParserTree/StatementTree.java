package ParserTree;

import java.util.ArrayList;

public abstract class StatementTree extends StatementPart 
{
	private ArrayList<PartTree> theComponents;
	
	public StatementTree()
	{
		super(); //this line would automatically happen since we have a zero arg constructor
		this.theComponents = new ArrayList<PartTree>();
	}
	
	public String toString()
	{
		return "Statement: " + this.theComponents;
	}
}
