package parser.persona;

public class Parser_Persona {

	public static void main(String[] args) {
				
		Parser parser=new Parser();
		parser.parseFicheroXml("acciones.xml");
		parser.parseDocument();
//		parser.print();
		

	}

}
