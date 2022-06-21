package starpackage;

public class star04 
{
	public static void main(String[] args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int space=10;space>=line;space--)
			{
				 System.out.print(" ");
			}
			
			    for(int star=1;star<=line;star++)
			     {
			    	//System.out.print("* ");
			    	System.out.println("*");
			     }
			
		
		System.out.println();
		}
	}

}










/*

     *
    **
   ***
  ****
 *****

*/