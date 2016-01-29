/**
 *   File Name: PetRegistration.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 27, 2016
 *   
 */

package com.sqa.aa.pet.registration;

import java.util.Scanner;

import com.sqa.aa.util.helper.RequestInput;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0<br>
 *        <br>
 *        Create an application which registered a local pet into the pet data
 *        system. The application should ask how many pets they would like to
 *        register. For each pet they should be asked what type (dog, cat, fish,
 *        bird, reptile, or horse). If the type is not a valid registered pet it
 *        should let the user know. If it is, it should echo the price to
 *        register the pet for 1 year and confirm price with user. (Use a switch
 *        statement). If the user decides to follow through with the
 *        registration process, they should than enter the pets Name (String),
 *        Address(String), Age( int), Whether they have a rabies shot (boolean),
 *        Yearly Pet Fees (double), and Gender (char). The number of pets that
 *        will be entered into the array should be determined at the start of
 *        the application. Upon exiting the registered pet details should be
 *        echoed to the user. Good Luck!
 */
public class PetRegistration {

	// Declare class static variables
	private static int numPets;

	private static String[] types;

	private static String[] names;

	private static String[] addresses;

	private static int[] ages;

	private static double[] petFees;

	private static boolean hasRabies;

	private static char[] genders;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set the number of Pets based on
		numPets = RequestInput.getInt("How many pets would you like to register? ");
		// Register number of pets chosen
		registerPets();
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();
	}

	/**
	*
	*/
	private static void displayPets() {
		// TODO Implement Displaying of Pets
	}

	/**
	*
	*/
	private static void exitPetRegApp() {
		// Close the Scanner object
		scanner.close();
		// Give a farewell message to the user
		System.out.println("Thank you for using the Register Pets Application!\n Good Bye.");
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerDog() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a dog it is $120 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method which iterates through loops setting pet values.
	 */
	private static void registerPets() {
		// Setup variable to create continuous loop based on invalid pet type
		boolean hasInvalidPet = true;
		// Variable to hold if pet will be registered
		boolean willRegister;
		// Loop until valid pet type is entered
		while (hasInvalidPet) {
			// Request for a pet type
			String type = RequestInput.getString("What type of pet do you have? ");
			switch (type) {
			case "dog":
				willRegister = registerDog();
				hasInvalidPet = false;
				break;
			case "cat":
				System.out.println("Add a cat.");
				hasInvalidPet = false;
				break;
			case "fish":
				System.out.println("Add a fish.");
				hasInvalidPet = false;
				break;
			case "horse":
				System.out.println("Add a horse.");
				hasInvalidPet = false;
				break;
			case "reptile":
				System.out.println("Add a reptile.");
				hasInvalidPet = false;
				break;
			case "bird":
				System.out.println("Add a bird.");
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid Animal.");
				break;
			}
		}
	}
}