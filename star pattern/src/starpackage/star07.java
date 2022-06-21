package starpackage;

public class star07 
{
	public static void main(String[]args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int star=1;star<=line;star++)
			{
				System.out.print("* ");
				//System.out.print("*");
			}
			System.out.println();
		}
		for(int line=1;line<=9;line++)
		{
			for(int star=9;star>=line;star--)
			{
				System.out.print("* ");
				//System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*
*
**
***
****
*****
****
***
**
*
*/