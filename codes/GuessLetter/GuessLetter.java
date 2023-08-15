class GuessLetter {
		
		public static void main(String[] args) throws java.io.IOException {
			char ch, ignore, answer='k';
			
			do{
				System.out.print("I'm thinking in a letter between A - Z\nTry to guess: ");
				ch = (char) System.in.read();
				
				do{
					ignore = (char) System.in.read();
				}while(ignore != '\n');
				
				if(ch == answer) System.out.println("RIGHT!");
				else{
					System.out.print("Sorry, you're ");
					if(ch<answer) System.out.println("too low");
					else System.out.println("too hight");
					System.out.println("Try again!");
				}
				
			}while(ch != answer);
			
			
		}
}
