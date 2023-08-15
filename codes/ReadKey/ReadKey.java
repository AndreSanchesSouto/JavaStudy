class ReadKey{
	public static void main(String[] args) throws java.io.IOException{
		char ch;
		System.out.print("Try to guess the correct letter: ");
		ch = (char) System.in.read();
		if (ch == 's') System.out.print("Correct");
		else System.out.print("Wrong");
	}
}
