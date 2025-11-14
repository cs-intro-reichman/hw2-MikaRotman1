public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		double sign= 1.0;
		double numer = 1.0;
		for (int i =0; i<N ; i++){
			sum= sum + (sign*1.0)/numer;
			numer = numer + 2;
			sign= sign*-1.0;
			}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     "+ (4*  sum) );
	}

}