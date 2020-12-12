package ParserTree;

public class RememberStatementTree extends StatementTree
{
	private SymbolTree type;
	private SymbolTree var_Name;
	private ExpressionTree expression;
	
	public RememberStatementTree(SymbolTree type, SymbolTree var_Name, ExpressionTree expression)
	{
		super();
		this.type = type;
		this.var_Name = var_Name;
		this.expression = expression;
	}
	
	public String toString()
	{
		return super.toString() + this.type + this.var_Name + " = " + this.expression;
	}

	public SymbolTree getType() {
		return type;
	}

	public SymbolTree getVar_Name() {
		return var_Name;
	}

	public ExpressionTree getExpression() {
		return expression;
	}
	
}
