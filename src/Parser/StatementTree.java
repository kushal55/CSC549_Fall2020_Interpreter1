package Parser;

import java.util.ArrayList;

public class StatementTree extends StatementPart 
{
	private ArrayList<PartTree> PartTrees;
	
	public StatementTree(ArrayList<PartTree> PartTrees)
	{
		super("Statement Tree");
		this.PartTrees = PartTrees;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.PartTrees;
	}

	public ArrayList<PartTree> getPartTrees() {
		return PartTrees;
	}

}
