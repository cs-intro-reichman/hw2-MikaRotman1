public class TimeCalc {
    public static void main(String[] args) {
    int hours = Integer.parseInt( "" + args[0].charAt(0)+ args[0].charAt(1));
    int minuets = Integer.parseInt( "" + args[0].charAt(3)+ args[0].charAt(4));
    int minuetstoAdd = Integer.parseInt(args[1]);
    int totalMinuets = (hours*60 + minuetstoAdd + minuets);
    int newHours = (totalMinuets/60)%24;
    int newMinuets = (totalMinuets%60);
    if (newHours < 10 )
    System.out.print("0" + newHours);
       if (newMinuets<10)
    System.out.println(":0"+ newMinuets);
         else
    System.out.println(newHours+ ":"+ newMinuets);
    }
}
