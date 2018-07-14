
public class Magic {
	//original number
	public static int myNumber = 2;
	public static int stepOne = myNumber * myNumber;
	public static int stepTwo = stepOne + myNumber;
	public static int stepThree = stepTwo / myNumber;
	public static int stepFour = stepThree + 17;
	public static int stepFive = stepFour - myNumber;
public static int stepSix = stepFive / 6;
	public static void main(String[] args) {
	System.out.println(stepSix);

	}

}
