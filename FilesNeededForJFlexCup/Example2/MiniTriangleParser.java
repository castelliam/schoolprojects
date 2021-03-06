
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class MiniTriangleParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return mySym.class;
}

  /** Default constructor. */
  public MiniTriangleParser() {super();}

  /** Constructor which sets the default scanner. */
  public MiniTriangleParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MiniTriangleParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\006\003\000\002\002\004\000\002\007" +
    "\005\000\002\007\005\000\002\007\006\000\002\007\004" +
    "\000\002\007\006\000\002\007\006\000\002\002\005\000" +
    "\002\002\003\000\002\010\005\000\002\010\003\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\003\000\002\003\003\000\002" +
    "\005\003\000\002\005\005\000\002\004\010\000\002\004" +
    "\006\000\002\004\010\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\016\004\007\006\010\007\013\010\006\012" +
    "\011\030\005\001\002\000\004\002\075\001\002\000\006" +
    "\032\053\033\052\001\002\000\016\004\007\006\010\007" +
    "\013\010\006\012\011\030\005\001\002\000\016\004\007" +
    "\006\010\007\013\010\006\012\011\030\005\001\002\000" +
    "\004\016\042\001\002\000\004\042\014\001\002\000\004" +
    "\002\001\001\002\000\004\042\014\001\002\000\050\002" +
    "\ufff6\005\ufff6\011\ufff6\013\ufff6\014\ufff6\017\ufff6\020\ufff6" +
    "\023\ufff6\024\ufff6\025\ufff6\026\ufff6\027\ufff6\031\ufff6\034" +
    "\ufff6\035\ufff6\036\ufff6\037\ufff6\040\ufff6\041\ufff6\001\002" +
    "\000\036\011\023\017\027\020\016\023\031\024\020\025" +
    "\017\026\034\027\022\034\032\035\025\036\026\037\021" +
    "\040\033\041\024\001\002\000\004\042\ufff2\001\002\000" +
    "\004\042\uffeb\001\002\000\004\042\ufff3\001\002\000\004" +
    "\042\uffee\001\002\000\004\042\uffe9\001\002\000\016\004" +
    "\007\006\010\007\013\010\006\012\011\030\005\001\002" +
    "\000\004\042\uffec\001\002\000\004\042\ufff0\001\002\000" +
    "\004\042\uffef\001\002\000\004\042\ufff5\001\002\000\004" +
    "\042\014\001\002\000\004\042\ufff4\001\002\000\004\042" +
    "\ufff1\001\002\000\004\042\uffed\001\002\000\004\042\uffea" +
    "\001\002\000\050\002\ufff7\005\ufff7\011\ufff7\013\ufff7\014" +
    "\ufff7\017\027\020\016\023\031\024\020\025\017\026\034" +
    "\027\022\031\ufff7\034\032\035\025\036\026\037\021\040" +
    "\033\041\024\001\002\000\010\002\ufffd\005\ufffd\014\ufffd" +
    "\001\002\000\036\013\040\017\027\020\016\023\031\024" +
    "\020\025\017\026\034\027\022\034\032\035\025\036\026" +
    "\037\021\040\033\041\024\001\002\000\016\004\007\006" +
    "\010\007\013\010\006\012\011\030\005\001\002\000\010" +
    "\002\ufffb\005\ufffb\014\ufffb\001\002\000\004\042\014\001" +
    "\002\000\042\002\ufffe\005\ufffe\014\ufffe\017\027\020\016" +
    "\023\031\024\020\025\017\026\034\027\022\034\032\035" +
    "\025\036\026\037\021\040\033\041\024\001\002\000\004" +
    "\005\050\001\002\000\006\005\ufff8\014\046\001\002\000" +
    "\016\004\007\006\010\007\013\010\006\012\011\030\005" +
    "\001\002\000\004\005\ufff9\001\002\000\010\002\uffff\005" +
    "\uffff\014\uffff\001\002\000\010\002\ufffc\005\ufffc\014\ufffc" +
    "\001\002\000\004\006\070\001\002\000\004\006\062\001" +
    "\002\000\004\031\060\001\002\000\006\014\056\031\uffe8" +
    "\001\002\000\006\032\053\033\052\001\002\000\004\031" +
    "\uffe7\001\002\000\016\004\007\006\010\007\013\010\006" +
    "\012\011\030\005\001\002\000\010\002\ufffa\005\ufffa\014" +
    "\ufffa\001\002\000\004\015\063\001\002\000\004\006\064" +
    "\001\002\000\012\014\uffe3\016\uffe3\031\uffe3\036\uffe3\001" +
    "\002\000\004\036\066\001\002\000\004\042\014\001\002" +
    "\000\040\014\uffe6\017\027\020\016\023\031\024\020\025" +
    "\017\026\034\027\022\031\uffe6\034\032\035\025\036\026" +
    "\037\021\040\033\041\024\001\002\000\004\015\071\001" +
    "\002\000\004\006\064\001\002\000\010\014\uffe5\016\073" +
    "\031\uffe5\001\002\000\004\042\014\001\002\000\040\014" +
    "\uffe4\017\027\020\016\023\031\024\020\025\017\026\034" +
    "\027\022\031\uffe4\034\032\035\025\036\026\037\021\040" +
    "\033\041\024\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\006\006\003\007\011\001\001\000\002\001" +
    "\001\000\006\004\054\005\053\001\001\000\004\007\050" +
    "\001\001\000\006\002\043\007\044\001\001\000\002\001" +
    "\001\000\004\010\036\001\001\000\002\001\001\000\004" +
    "\010\014\001\001\000\002\001\001\000\004\003\027\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\007\035\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\034\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\027\001\001\000\002\001\001\000\004\003" +
    "\027\001\001\000\004\007\040\001\001\000\002\001\001" +
    "\000\004\010\042\001\001\000\004\003\027\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\002\046\007\044" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\054\005\056\001\001\000" +
    "\002\001\001\000\004\007\060\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\064\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\066\001\001\000\004" +
    "\003\027\001\001\000\002\001\001\000\004\011\071\001" +
    "\001\000\002\001\001\000\004\010\073\001\001\000\004" +
    "\003\027\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MiniTriangleParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MiniTriangleParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MiniTriangleParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$MiniTriangleParser$actions {
  private final MiniTriangleParser parser;

  /** Constructor */
  CUP$MiniTriangleParser$actions(MiniTriangleParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$MiniTriangleParser$do_action_part00000000(
    int                        CUP$MiniTriangleParser$act_num,
    java_cup.runtime.lr_parser CUP$MiniTriangleParser$parser,
    java.util.Stack            CUP$MiniTriangleParser$stack,
    int                        CUP$MiniTriangleParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MiniTriangleParser$result;

      /* select the action based on the action number */
      switch (CUP$MiniTriangleParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("program",4, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).value;
		RESULT = start_val;
              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MiniTriangleParser$parser.done_parsing();
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // command ::= BEGIN commands END 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // command ::= IDENTIFIER ASSIGN expr 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // command ::= IF expr THEN command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // command ::= ELSE command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // command ::= WHILE expr DO command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // command ::= LET declarations IN command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",5, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // commands ::= command SEMI commands 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("commands",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // commands ::= command 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("commands",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr binOp expr 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= INTEGER 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // binOp ::= PLUS 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // binOp ::= TIMES 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // binOp ::= DIVIDE 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // binOp ::= MINUS 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // binOp ::= LESSTHAN 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // binOp ::= LESSEQUAL 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // binOp ::= EQUAL 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // binOp ::= NOTEQUAL 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // binOp ::= GREATEREQUAL 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // binOp ::= GREATER 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // binOp ::= AND 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // binOp ::= OR 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // binOp ::= UPCARROT 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // declarations ::= declaration 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("declarations",3, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // declarations ::= declaration SEMI declarations 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("declarations",3, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // declaration ::= CONST IDENTIFIER COLON typedenoter EQUAL expr 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-5)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // declaration ::= VAR IDENTIFIER COLON typedenoter 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-3)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // declaration ::= VAR IDENTIFIER COLON typedenoter ASSIGN expr 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-5)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // typedenoter ::= IDENTIFIER 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("typedenoter",7, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$MiniTriangleParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$MiniTriangleParser$do_action(
    int                        CUP$MiniTriangleParser$act_num,
    java_cup.runtime.lr_parser CUP$MiniTriangleParser$parser,
    java.util.Stack            CUP$MiniTriangleParser$stack,
    int                        CUP$MiniTriangleParser$top)
    throws java.lang.Exception
    {
              return CUP$MiniTriangleParser$do_action_part00000000(
                               CUP$MiniTriangleParser$act_num,
                               CUP$MiniTriangleParser$parser,
                               CUP$MiniTriangleParser$stack,
                               CUP$MiniTriangleParser$top);
    }
}

}
