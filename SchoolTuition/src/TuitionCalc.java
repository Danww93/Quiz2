import java.util.Scanner;



public class TuitionCalc 
{
	private double iTuition;
	
	public TuitionCalc()
	{
		iTuition = 0.0;
	}

	TuitionCalc(double iTuition)
	{
		this.iTuition = iTuition;
	}
	
	public void setiTuition(int iTuition) 
    {
        this.iTuition = iTuition;
    }
	
	public double getTotalTuition() 
    {
        double Total = 0.0;
        double percentInc = 0.0;
		Scanner keyBoard = new Scanner(System.in);
        for(int i = 0; i <= 3; i++)
        {
        	if(i > 0)
        	{
        		System.out.println("Enter in the percentage increase of tuition for current year (Enter in as whole number): ");
        		percentInc = keyBoard.nextDouble() / 100;
        		iTuition = (iTuition * percentInc) + iTuition;
        		Total = iTuition + Total;
        	}
        	else
        		Total = Total + iTuition;
        }
        keyBoard.close();
		return Total;
		
    }
	
	
}

