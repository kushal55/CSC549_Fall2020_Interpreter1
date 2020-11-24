import Interpreter.NameValuePair;
import Parser.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		NameValuePair V1 = new NameValuePair("a", 9);
		V1.display();
		V1.setValue(9);
		V1.display();
		
		Parser.parse("input.spyder");
		//Parser.display();
		Interpreter.SpyderInterpreter.interpret(Parser.getParsedStatements());
		Interpreter.SpyderInterpreter.displayResults();		
	}
}
