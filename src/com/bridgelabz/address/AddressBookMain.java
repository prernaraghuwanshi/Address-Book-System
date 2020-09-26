package com.bridgelabz.address;
import java.util.*;

public class AddressBookMain {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> contactList;
	HashMap<String,Contacts> contactMap;
	private static Scanner i;
	
	public AddressBookMain()
	{
		contactList = new ArrayList<Contacts>();
		contactMap = new HashMap<String,Contacts>();
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
		contactMap.put(firstName, c);
		System.out.println("-----Contact Added Successfully-----");
		System.out.println("Number of contacts in Address Book: " + contactList.size());
	}
	
	public void editContact(String firstNameEdit)
	{
		System.out.println("-----Edit Contact-----");
		
		if(contactMap.containsKey(firstNameEdit))
		{
			Contacts cedit = contactMap.get(firstNameEdit);
			System.out.println("Enter First Name: ");
			cedit.firstName = sc.nextLine();
			System.out.println("Enter Last Name: ");
			cedit.lastName = sc.nextLine();
			System.out.println("Enter Address: ");
			cedit.address = sc.nextLine();
			System.out.println("Enter City: ");
			cedit.city = sc.nextLine();
			System.out.println("Enter State:");
			cedit.state = sc.nextLine();
			System.out.println("Enter ZIP Code: ");
			cedit.zip = sc.nextLine();
			System.out.println("Enter Phone Number: ");
			cedit.phoneNo =sc.nextLine();
			System.out.println("Enter Email Address: ");
			cedit.email = sc.nextLine();
			System.out.println("-----Contact Details Updated-----");
			System.out.println("Number of contacts in Address Book: " + contactList.size());
			
		}
		else
			System.out.println("-----Name not found in Address Book-----");
		
		
	}
	
	public static void main(String args[]) 
	{
		System.out.println("Welcome to Address Book Program!");
		
		AddressBookMain a = new AddressBookMain();
		boolean flag =true;
		while(flag)
		{
			System.out.println("Choose action on Address Book \n\n 1. Add Contact \n 2. Edit Contact \n 3. Exit");
			i = new Scanner(System.in);
			int choice = i.nextInt();
			switch(choice)
			{
				case 1:
					//Add contact
					a.addContact();
					break;
				case 2:
					//Edit contact
					System.out.println("Enter first name of contact to be edited: ");
					Scanner s= new Scanner(System.in);
					String firstNameEdit = s.nextLine();
					a.editContact(firstNameEdit);
					break;
				case 3:
					System.out.println("-----Exiting from Address Book System-----");
					flag = false;
					break;
					
					
			}
		}
	}

}
