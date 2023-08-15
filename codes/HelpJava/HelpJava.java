class HelpJava{
	
	public static void main(String[] args) throws java.io.IOException{
		System.out.print("Help on:\n" + 
						" 1. if\n"+
						" 2. switch\n"+
						"Choose one: ");
		char choose = (char) System.in.read();
		switch(choose) {
			case '1':
				System.out .println("The if:\n");
				System.out .println("if (condition) statement;");
				System.out .println("else statement;");
			break;
			case '2':
				System.out .println("The switch:\n");
				System.out .println("switch(expression) {");
				System.out.println(" case constant:");
				System.out.println(" - statement sequence");
				System.out.println(" - break;");
				System.out.println(" // ...");
				System.out .println("}");
			break;
			default:
				System.out .print ("Selection not found.");
		}

	}
}
