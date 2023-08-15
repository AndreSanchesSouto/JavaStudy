class CalcPotencia{
	public static void main(String[] args){
		int n, resul;
		for(int i=0; i<11; i++){
			resul = 1;
			n = i;
			while(n>0){
				resul *= 2; 
				n--;
			}
		System.out.println(i +" na potencia de 2 = "+ resul);
		}
	}
}