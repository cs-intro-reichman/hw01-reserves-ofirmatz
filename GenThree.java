/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int numOne =((int)(Math.random()*(b-a)+a));
	int numTwo =((int)(Math.random()*(b-a)+a));
	int numThree =((int)(Math.random()*(b-a)+a));
	int min = Math.min(Math.min(numOne,numTwo),numThree);

	System.out.println(numOne);
	System.out.println(numTwo);
	System.out.println(numThree);
	System.out.print("The minimal generated number was " + min);


	}
}
