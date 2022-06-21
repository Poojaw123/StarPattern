package starpackage;

public class star09 
{
	public static void main(String[]args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int space=1;space<=line;space++)
			{
				System.out.print(" ");
			}
			for(int star=10;star>=line;star--)
			{
				System.out.print("*");
			}
			for(int star=10;star>line;star--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


/*
*******
 *****
  ***
   *

*/