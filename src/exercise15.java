/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    String password="abc$123";
	    String guess="";
	    System.out.println("What is the password?");
	    guess= kb.nextLine();
	    if(password.equals(guess)){
	        System.out.println("Welcome!");
        }
	    else{
	        System.out.println("I don't know you.");
        }
    }
}
