/* Generated By:JavaCC: Do not edit this line. pascalConstants.java */
package pack;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
@SuppressWarnings("all")
public interface pascalConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int MULTI = 6;
  /** RegularExpression Id. */
  int PLUS = 7;
  /** RegularExpression Id. */
  int MINUS = 8;
  /** RegularExpression Id. */
  int MULTIPLY = 9;
  /** RegularExpression Id. */
  int DIVIDE = 10;
  /** RegularExpression Id. */
  int ASSIGNOP = 11;
  /** RegularExpression Id. */
  int LT = 12;
  /** RegularExpression Id. */
  int LTE = 13;
  /** RegularExpression Id. */
  int GT = 14;
  /** RegularExpression Id. */
  int GTE = 15;
  /** RegularExpression Id. */
  int NE = 16;
  /** RegularExpression Id. */
  int E = 17;
  /** RegularExpression Id. */
  int PROGRAM = 18;
  /** RegularExpression Id. */
  int VAR = 19;
  /** RegularExpression Id. */
  int INTEGER = 20;
  /** RegularExpression Id. */
  int REAL = 21;
  /** RegularExpression Id. */
  int CHAR = 22;
  /** RegularExpression Id. */
  int BOOLEAN = 23;
  /** RegularExpression Id. */
  int STRING = 24;
  /** RegularExpression Id. */
  int FUNCTION = 25;
  /** RegularExpression Id. */
  int PROCEDURE = 26;
  /** RegularExpression Id. */
  int BEGIN = 27;
  /** RegularExpression Id. */
  int END = 28;
  /** RegularExpression Id. */
  int ARRAY = 29;
  /** RegularExpression Id. */
  int OF = 30;
  /** RegularExpression Id. */
  int DOTDOT = 31;
  /** RegularExpression Id. */
  int IF = 32;
  /** RegularExpression Id. */
  int THEN = 33;
  /** RegularExpression Id. */
  int ELSE = 34;
  /** RegularExpression Id. */
  int WHILE = 35;
  /** RegularExpression Id. */
  int DO = 36;
  /** RegularExpression Id. */
  int FOR = 37;
  /** RegularExpression Id. */
  int TO = 38;
  /** RegularExpression Id. */
  int DOWNTO = 39;
  /** RegularExpression Id. */
  int REPEAT = 40;
  /** RegularExpression Id. */
  int UNTIL = 41;
  /** RegularExpression Id. */
  int AND = 42;
  /** RegularExpression Id. */
  int OR = 43;
  /** RegularExpression Id. */
  int XOR = 44;
  /** RegularExpression Id. */
  int NOT = 45;
  /** RegularExpression Id. */
  int SHL = 46;
  /** RegularExpression Id. */
  int SHR = 47;
  /** RegularExpression Id. */
  int DIV = 48;
  /** RegularExpression Id. */
  int MOD = 49;
  /** RegularExpression Id. */
  int READ = 50;
  /** RegularExpression Id. */
  int WRITE = 51;
  /** RegularExpression Id. */
  int LABEL = 52;
  /** RegularExpression Id. */
  int GOTO = 53;
  /** RegularExpression Id. */
  int CASE = 54;
  /** RegularExpression Id. */
  int RECORD = 55;
  /** RegularExpression Id. */
  int TYPE = 56;
  /** RegularExpression Id. */
  int CONST = 57;
  /** RegularExpression Id. */
  int UNIT = 58;
  /** RegularExpression Id. */
  int USES = 59;
  /** RegularExpression Id. */
  int BREAK = 60;
  /** RegularExpression Id. */
  int CONTINUE = 61;
  /** RegularExpression Id. */
  int IS = 62;
  /** RegularExpression Id. */
  int IN = 63;
  /** RegularExpression Id. */
  int WITH = 64;
  /** RegularExpression Id. */
  int IDENT = 65;
  /** RegularExpression Id. */
  int LETTER = 66;
  /** RegularExpression Id. */
  int CARACTERE = 67;
  /** RegularExpression Id. */
  int NATURAL = 68;
  /** RegularExpression Id. */
  int DIGIT = 69;
  /** RegularExpression Id. */
  int REEL = 70;
  /** RegularExpression Id. */
  int BOOLEEN = 71;
  /** RegularExpression Id. */
  int CHAINE = 72;
  /** RegularExpression Id. */
  int SEMICOLON = 73;
  /** RegularExpression Id. */
  int FULLSTOP = 74;
  /** RegularExpression Id. */
  int COLON = 75;
  /** RegularExpression Id. */
  int COMMA = 76;
  /** RegularExpression Id. */
  int BRACKETOPEN = 77;
  /** RegularExpression Id. */
  int BRACKETCLOSE = 78;
  /** RegularExpression Id. */
  int SQRBRACKETOPEN = 79;
  /** RegularExpression Id. */
  int SQRBRACKETCLOSE = 80;
  /** RegularExpression Id. */
  int Unautorised = 81;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<MULTI_LINE_COMMENT>",
    "<MULTI>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\":=\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"<>\"",
    "\"=\"",
    "\"program\"",
    "\"var\"",
    "\"integer\"",
    "\"real\"",
    "\"char\"",
    "\"boolean\"",
    "\"string\"",
    "\"function\"",
    "\"procedure\"",
    "\"begin\"",
    "\"end\"",
    "\"array\"",
    "\"of\"",
    "\"..\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"while\"",
    "\"do\"",
    "\"for\"",
    "\"to\"",
    "\"downto\"",
    "\"repeat\"",
    "\"until\"",
    "\"and\"",
    "\"or\"",
    "\"xor\"",
    "\"not\"",
    "\"shl\"",
    "\"shr\"",
    "\"div\"",
    "\"mod\"",
    "\"read\"",
    "\"write\"",
    "\"label\"",
    "\"goto\"",
    "\"case\"",
    "\"record\"",
    "\"type\"",
    "\"const\"",
    "\"unit\"",
    "\"uses\"",
    "\"break\"",
    "\"continue\"",
    "\"is\"",
    "\"in\"",
    "\"with\"",
    "<IDENT>",
    "<LETTER>",
    "<CARACTERE>",
    "<NATURAL>",
    "<DIGIT>",
    "<REEL>",
    "<BOOLEEN>",
    "<CHAINE>",
    "<SEMICOLON>",
    "\".\"",
    "\":\"",
    "\",\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "<Unautorised>",
  };

}
