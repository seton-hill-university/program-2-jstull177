// Project: Program 2
// Author: Jerod Stull
// Github: jstull177
// Date: September 23, 2022
// Version: 1.0
// Desc: This program is a submission for Program 2 listed on Canvas.

//================================================

import java.util.Scanner;

public class stull_program2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Below activates the input device, 
		// So that the user can interact with the output device. 
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt:
		System.out.println("Please provide your first name as well as your three favorite numbers. ");
		
		// I am asking the user for their name.
		// Read from keyboard.
		String Yourname = keyboard.next();
		
		// The user now reveals their three favorite numbers. 
		int favnum 		 = 1;
		
			// Integer read from keyboard.
			int favnum1	= keyboard.nextInt();
			int favnum2	= keyboard.nextInt();
			int favnum3 = keyboard.nextInt();
		
		
		//Transition to second part of program: The Main Menu
		System.out.println("Thank you for letting me know your favorite numbers! "
				+ "Please type ENTER to continue. ");
		String typeENTER = keyboard.next("ENTER");
		
		// After the user types ENTER then it will pop-up the second part of this program.
		//Prompt: Asking User to interact with the main menu.
		System.out.println("Please type an option number to interact with the Main Menu");
		System.out.println("======================= ");
		System.out.println("Main Menu: Magic of coding  \n "
				+ "1.) Add your numbers 				\n "
				+ "2.) Subtract	your numbers			\n "
				+ "3.) Greater or not?					\n "
				+ "4.) Who are you gonna call?     		\n "
				+ "5.) EXIT								\n ");

		//Asking for User interaction once again. 
		int menuChoice = keyboard.nextInt();
		//Adding the first inputed numbers.
		int favnumTOTAL = (favnum1 + favnum2);
		
		switch (menuChoice)
		{
		case 1:
			
			System.out.println("Your first and second number added together is" + (favnum1 + favnum2));
			
			break;
			
		case 2:
			
			System.out.println("The numbers substract to " + (favnum1 - favnum2 - favnum3));
			
			break;
			
		case 3:
			
			//So, I am having trouble getting my "if" statements to work.
			// Now introducing the if statement
			if (favnumTOTAL > favnum3 );
			{
				System.out.println(favnumTOTAL + " is greater than " + favnum3);
				
				if (favnumTOTAL < favnum3);
				{
					System.out.println(favnumTOTAL + " is not greater than " + favnum3);
				}
				
				if (favnumTOTAL >= favnum3);
				{
					System.out.println(favnumTOTAL + " is equal to " + favnum3);
				}
				
				
			}
			
			break;
		
		case 4:
			
			System.out.println("\"GHOSTBUSTERS! \n"
					+ "				+ \"                       ---                                     \\n\"\n"
					+ "				+ \"                    -        --                             \\n\"\n"
					+ "				+ \"                --( /     \\\\ )XXXXXXXXXXXXX                   \\n\"\n"
					+ "				+ \"            --XXX(   O   O  )XXXXXXXXXXXXXXX-              \\n\"\n"
					+ "				+ \"           /XXX(       U     )        XXXXXXX\\\\               \\n\"\n"
					+ "				+ \"         /XXXXX(              )--   XXXXXXXXXXX\\\\             \\n\"\n"
					+ "				+ \"        /XXXXX/ (      O     )   XXXXXX   \\\\XXXXX\\\\\\n\"\n"
					+ "				+ \"        XXXXX/   /            XXXXXX   \\\\   \\\\XXXXX----        \\n\"\n"
					+ "				+ \"        XXXXXX  /          XXXXXX         \\\\  ----  -         \\n\"\n"
					+ "				+ \"---     XXX  /          XXXXXX      \\\\           ---        \\n\"\n"
					+ "				+ \"  --  --  /      /\\\\  XXXXXX            /     ---=         \\n\"\n"
					+ "				+ \"    -        /    XXXXXX              '--- XXXXXX         \\n\"\n"
					+ "				+ \"      --\\\\/XXX\\\\ XXXXXX                      /XXXXX         \\n\"\n"
					+ "				+ \"        \\\\XXXXXXXXX                        /XXXXX/\\n\"\n"
					+ "				+ \"         \\\\XXXXXX                         /XXXXX/         \\n\"\n"
					+ "				+ \"           \\\\XXXXX--  /                -- XXXX/       \\n\"\n"
					+ "				+ \"            --XXXXXXX---------------  XXXXX--         \\n\"\n"
					+ "				+ \"               \\\\XXXXXXXXXXXXXXXXXXXXXXXX-            \\n\"\n"
					+ "				+ \"                 --XXXXXXXXXXXXXXXXXX-\");");
		
			break;
		
		case 5:
			
			System.out.println("Thank you for looking at my second program!");
			
		default:
		
		}
		
	}

}
