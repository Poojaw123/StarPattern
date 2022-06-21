package starpackage;

public class hollow_star 
{
	public static void main(String[]args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int space=1;space<=10;space++)
			{
				if((line==1||line==10)||(space==1||space==10))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }

}
