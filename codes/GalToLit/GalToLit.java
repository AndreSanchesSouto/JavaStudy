public class GalToLit{
	
	public static void main(String[] args){
		double gal, lit;
		int con=0;
		for(int n=1; n<=100; n++){
			gal=n;
			lit = gal*3.7854;
			System.out.println(gal +" gallons is "+lit+" litters");
			con++;
			if(con==10){
				System.out.println();
				con=0;
			}
		}
	}
}
