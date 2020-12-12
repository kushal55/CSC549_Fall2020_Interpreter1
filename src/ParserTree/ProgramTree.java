package ParserTree;

import java.util.ArrayList;

public class ProgramTree 
{
	private ArrayList<StatementTree> theComponents;
	
	public ProgramTree()
	{
		super();
		this.theComponents = new ArrayList<StatementTree>();
	}
	
	public String toString()
	{
		return "StatementType:" + this.theComponents;
	}
}
