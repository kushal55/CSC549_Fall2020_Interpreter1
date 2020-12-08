package Parser;

public class SymbolTree extends ExpressionPart
{
	private String Symbol;
	
	public SymbolTree(String Symbol)
	{
		super("Symbol Tree");
		this.Symbol = Symbol;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + this.Symbol;
	}

	public String getSymbol() 
	{
		return Symbol;
	}
}
