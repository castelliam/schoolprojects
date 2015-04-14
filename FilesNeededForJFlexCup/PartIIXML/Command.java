/* command    ::= BEGIN commands END 
			| IDENTIFIER ASSIGN expr; */

public class Command {
	private String lhs;
	private Expr rhs;
	private Commands cs;
	
	public Command(String l, Expr r)
	{
		lhs = l;
		rhs = r;
	}
	
	public Command(Commands cs) { this.cs = cs;}
	
	public Command (String l) { lhs = l; }
	
	public String toXML()
	{
		String result = "<Command>\n";
		if (cs != null){ 
			result += cs.toXML();
		}
		else {
			result += "<lhs>\n" + lhs + "\n</lhs>\n";
			result += rhs.toXML();
		}
		result += "</Command>\n";
		return result;		
	}
}

