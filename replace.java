import java.util.Scanner;
public class replace
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		String example = "Hello World!";
		System.out.println("Hi! So I heard you wanted to learn about replace. Well, you may have come to the right place!");
		System.out.println("Press anything to continue");
		if (user.nextLine() != "")
		{
			System.out.println("");
			System.out.println("replace takes in two arguments, the old character and the new character that you want to replace it with.");
			System.out.println("For example, take " + example + ".");
			System.out.println("");
			System.out.println("Say we wanted to replace the o's in " + example + " with t's." );
			System.out.println("We would write example.replace(\"o\", \"t\");");
			String result = example.replace("o", "t");
			System.out.println("This would give us " + result + " as a result.");
			System.out.println("Press anything to continue");
			if (user.nextLine() != "")
			{	
				System.out.println("However, since Strings are immutable, you will have to make a new variable if you want the change to stick.");
				System.out.println("For example, String result = example.replace(\"o\", \"t\");");
				System.out.println("");
				System.out.println("Keep in mind that it is CaSe SeNsItIvE! Be careful!");
				System.out.println("Press anything to continue");
				if (user.nextLine() != "")
				{
					System.out.println("Here, you try! Input a phrase here.");
					String phrase = user.nextLine();
					System.out.println("Now, what character of " + phrase + " would you like to replace?");
					String replaced = user.nextLine();
					System.out.println("What would you like it to be replaced with? ");
					String replacedWith = user.nextLine();
					System.out.println("Here's your result.");
					System.out.println(phrase.replace(replaced, replacedWith));
				}
			}
		}
	}
}