public  class  TestRandom {
	public static void main(String[]  args) {
	int N= Integer.parseInt(args[0]);
	int countAbove = 0;
    int countBelow = 0;
    for (int i = 0; i< N; i++) {
        double r = Math.random();
        if (r > 0.5) {
		countAbove ++;
		}
        else countBelow++;
		}
    System.out.println( "> 0.5: "+ countAbove + " times");
	System.out.println("<= 0.5: " + countBelow + " times");
	if (countBelow>0 && countAbove > 0){
	double ratio = (double)countAbove/countBelow;
	System.out.println ("Ratio: "  + ratio);
	}
	}
	}

