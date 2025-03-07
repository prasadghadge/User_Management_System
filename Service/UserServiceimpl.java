package com.Exponent.Service;
import com.Exponent.model.User;


import java.util.Scanner;
public class UserServiceimpl implements UserService{
	
	User u[] = new User[5];
	public void userAdd() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many users you want to add :- ");
		int n = sc.nextInt();
		
		for(int i = 0;i<n; i++)
		{
			User user = new User();
			
			System.out.println("Enter the User Id");
			user.setUid(sc.nextInt());
			
			System.out.println("Enter the name:- ");
			user.setUserName(sc.next());
			
			System.out.println("Enter the address:-");
			user.setUaddress(sc.next());
			
			System.out.println("Enter the User salary:-");
			user.setUsalary(sc.nextDouble());
			
			System.out.println("Enter the User Gender:- ");
			user.setUserGender(sc.next());
			
			System.out.println("Enter the user ph-number");
			user.setUserNo(sc.nextInt());
			
			u[i] = user;
			
			System.out.println("User Added");
		}
	}

	
	public void displayAllUser() {
		
		System.out.println("----All user details-----");
		for(User user : u)
		{
			if(user != null)
			{
			System.out.println(user);
		}
		}
	}

	
	public void displaySingleUser() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter teh User Id;- ");
		int id = sc.nextInt();
		
		for(User user : u)
		{
			if(user != null && user.getUid() == id)
			{
				System.out.println(user);
			}
		}
		
	}

	
	public void updateUserDetails() {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
//		User user = new User();
	
				System.out.println("Enter the user Id");
				int id = sc.nextInt();
				
				for(int i = 0; i<u.length;i++)
				{
					if(u[i] != null && u[i].getUid() == id)
					{
						while(flag)
						{
						
							System.out.println("1. Update user name");
							System.out.println("2. Update user address");
							System.out.println("3. Update user mobile number");
							System.out.println("4. Exit");
							
							System.out.println("Enter your choice from 1 to 5");
							int choice = sc.nextInt();
							
							switch(choice)
							{
							case 1:
								System.out.println("Enter new name");
								u[i].setUserName(sc.next());
								
								System.out.println("Username updated successfully");
								break;
								
							case 2:
								System.out.println("Enter new address");
								u[i].setUaddress(sc.next());
								
								System.out.println("Address updated successfully");
								break;
								
							case 3:
								System.out.println("Enter mobile number");
								u[i].setUserNo(sc.nextInt());
								
								System.out.println("Mobile updated successfully");
								break;
							
							case 4:
								flag = false;
								break;
								
							default:
								System.out.println("Invalid input");
								
							}
						}
					
						
					}
				}
	}	
			
	
				

	
	public void deleteUserDetails() {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the user Id;- ");
	int id = sc.nextInt();
	boolean flag = true;
	int index = 0;
	
	for(int i = 0; i < u.length; i++)
	{
		if(u[i] != null && u[i].getUid() == id)
		{
			index = i;
			flag = false;
			break;
		}
	}
	if(!flag)
	{
	    u[index] = null;
	}
	
	else {
		System.out.println("Invalid id");
		
		deleteUserDetails();
	}
	
	}

	
}
