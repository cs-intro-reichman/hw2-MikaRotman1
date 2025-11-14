public class Collatz {
	public static void main(String args[]) {
	int number = Integer.parseInt(args[0]);
	char word = args[1].charAt(0);
	boolean verbose = (word == 'v');

	for (int i = 1;i<=number;i++) {
		int current_num = i;
		int steps=1;

		if (verbose){
			System.out.print(current_num+" ");
		}
	    while ( current_num !=1){
             if (current_num%2 == 0){
			    current_num = current_num/2;
		 }else { 
			current_num=current_num *3+1;
		 }
		 steps++;

		 if (verbose){
			System.out.print(current_num+ " ");
		 }
	}
	    if (verbose){
			System.out.println("("+ steps + ")");
		}
	}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	}
} 


