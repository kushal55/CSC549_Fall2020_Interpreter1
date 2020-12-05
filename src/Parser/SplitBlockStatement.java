package Parser;

import java.util.ArrayList;

public class SplitBlockStatement extends Statement
{
	private ArrayList<Statement> statements;
	
	public SplitBlockStatement(ArrayList<Statement> statements)
	{
		super("SplitBlock Statement");
		this.statements = statements;
	}

	public String toString()
	{
		String s = super.toString() + "\n\t"; 
		for(Statement stmt : this.statements)
		{
			s += stmt.toString() + "\n";
		}
		return s;
	}

	public ArrayList<Statement> getStatements() {
		return statements;
	}

}
