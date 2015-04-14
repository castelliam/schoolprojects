import java.io.*;
class MiniTriangleParserTest {
   public static void main(String[] args){
      try {
         //fileName: location/name of the Triangle file to parse
		 //String fileName = "C:/Users/stalveyr/dropbox/CSCI420/Spring 2015/JavaCode/Project2CUP/Example/basic.tri";
		 String fileName = args[0];
		 
		 //MiniTriangleLexer: replace with the name of your lexer
		 //MiniTriangleParser: replace with the name of your parser
		 MiniTriangleParser parser= new MiniTriangleParser(new MiniTriangleLexer(new FileReader(fileName)));
         
		 parser.parse();
		// System.out.println("result is: " + result);
		 System.out.println("\nParse complete");		 
        } catch (Exception e) {  e.printStackTrace();
        }
    }
}
