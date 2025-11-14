public class Cheers {
        public static void main(String[] args) {
	String word = args[0];
        int count = word.length();
        String otiot = "AEFHILMNORSX";
        for (int i = 0; i<count;i++){
                if (otiot.indexOf(word.charAt(i)) != -1){
                System.out.println("Give me an "+ word.charAt(i)+ ": "+ word.charAt(i)+"!");
                }  
                else System.out.println("Give me a "+ word.charAt(i)+ ": "+ word.charAt(i)+"!");
        }   
        System.out.println("What does that spell?"); 
        int number = Integer.parseInt(args[1]);
        for (int j=0; j<number;j++){
                System.out.println(word + "!!!");
        }
}
}
  
