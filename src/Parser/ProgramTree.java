package Parser;

import java.util.ArrayList;

public class ProgramTree 
{
	private ArrayList<StatementTree> StatementTrees;
	
	public ProgramTree(ArrayList<StatementTree> StatementTrees)
	{
		this.StatementTrees = StatementTrees;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.StatementTrees;
	}

	public ArrayList<StatementTree> getStatementTrees() 
	{
		return StatementTrees;
	}
	
}
