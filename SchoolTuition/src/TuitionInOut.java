import java.util.Scanner;

public class TuitionInOut {

	public static void main(String[] args) 
	{
		double Tuition = 0.0;
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.println("Enter your initial tuition: ");
		Tuition = keyBoard.nextDouble();
		
		TuitionCalc Calc = new TuitionCalc(Tuition);
		
		System.out.printf("Your total tuition for 4 years is $%.2f%n", Calc.getTotalTuition());
		
		keyBoard.close();


	}

}
