package starpackage;

public class rhombus02 
{
	public static void main(String[]args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int space=1;space<=line;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=10;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
*****
 *****
  *****
   *****
    *****

*/