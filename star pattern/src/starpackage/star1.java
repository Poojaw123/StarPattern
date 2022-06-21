package starpackage;

public class star1 
{
	public static void main(String[]args)
	{
		for(int line=1;line<10;line++)
		{
			for(int space=1;space<=10;space++)
			{
				if(line==space||line+space==10)
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




/*


8       8
 8     8
  8   8
   8 8
    8
   8 8
  8   8
 8     8
8       8
*/