/**
 *   File Name: RequestInputTest.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 28, 2016
 *   
 */

package com.sqa.aa;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.sqa.aa.util.helper.RequestInput;

/**
 * RequestInputTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInputTest {

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#addStringElement(java.lang.String[], java.lang.String)}
	 * .
	 */
	@Test
	public void testAddStringElement() {
		// Initialize an array with 4 elements
		String[] myElements = new String[] { "basketball", "soccer ball", "Football", "Tennis ball" };
		// Add another element to it
		String[] myNewElements = RequestInput.addStringElement(myElements, "racket ball");
		// Display old array of elements
		// Display new array of elements
		System.out.println("Old elements:" + Arrays.toString(myElements));
		System.out.println("New elements:" + Arrays.toString(myNewElements));
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getBoolean(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetBoolean() {
		boolean value = RequestInput.getBoolean("Are you learning anything today?");
		System.out.println("The result of you learning is " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getChar(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetCharString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetCharStringCharArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetDouble() {
		double value = RequestInput.getDouble("How much cash do you have on hand?");
		System.out.println("The amount in your pocket is " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getInt(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getString(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helper.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetStringStringStringArray() {
		fail("Not yet implemented");
	}

}
