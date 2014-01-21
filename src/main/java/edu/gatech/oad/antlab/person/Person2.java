package edu.gatech.oad.antlab.person;

import java.util.Random;
import java.util.LinkedList;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Sai Naga Manoj Paladugu
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person2(String pname) {
	name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private static String calc(String input) {
	//Person 2 put your implementation here
	String randomString = new String();
	Random rand = new Random();
	LinkedList<Integer> list = new LinkedList<Integer>();
	while(randomString.length() != input.length()) {
	    int index = rand.nextInt(input.length());
	    if(!list.contains(index)) {
		randomString += input.charAt(index);
		list.add(index);
	    }
	}

	return randomString;
    }



    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
	return name + calc(input);
    }
}
