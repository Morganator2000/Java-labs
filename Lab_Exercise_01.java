/*
* Student Name: Morgan Bakelmun
* Lab Professor: Shavit Lupo
* Due Date: September 16th, 2022
* Modified: September 16th, 2022
* Description: Lab Exercise 1
*/

//Real simple here, this thing is just gonna say your name and some other fluff
public class Lab_Exercise_01 {

	public static void main(String[] args) {
		//Right here, change your name if it's wrong
		String name = "Morgan Bakelmun";
		System.out.println("Welcome to CST8116!");
		System.out.print("Java says: Hello ");
		/*Note that these aren't println. 
		 * This is because we don't want Hello and Name separated by a paragraph.
		 */
		System.out.print(name);
		System.out.println(); // new-line
		System.out.println("Program modified by " + name);
	}
	
}
