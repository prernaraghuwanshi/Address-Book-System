package com.bridgelabz.address;
import java.util.*;

public class AddressBookMain {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> contactList;
	
	public AddressBookMain()
	{
		contactList = new ArrayList<Contacts>();
	}
	public void addContact()
	{
		System.out.println("-----Add Contact Details-----");
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		System.out.println("Enter State:");
		String state = sc.nextLine();
		System.out.println("Enter ZIP Code: ");
		String zip = sc.nextLine();
		System.out.println("Enter Phone Number: ");
		String phone =sc.nextLine();
		System.out.println("Enter Email Address: ");
		String email = sc.nextLine();
		
		Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phone, email);
		contactList.add(c);
		System.out.println("-----Contact Added Successfully-----");
		System.out.println("Number of contacts in Address Book: " + contactList.size());
	}
	
	public static void main(String args[]) 
	{
		System.out.println("Welcome to Address Book Program!");
		AddressBookMain a = new AddressBookMain();
		a.addContact();
	}

}
