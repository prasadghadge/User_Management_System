package com.Exponent.UserController;
import com.Exponent.Service.UserService;
import com.Exponent.Service.UserServiceimpl;

import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		
		UserService uc = new UserServiceimpl();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("-------------WELCOME TO User Management System-----------------");
			System.out.println("----------------------------------------------");
			System.out.println("1.Add user ");
			System.out.println("2.Display all user");
			System.out.println("3.Display single user");
			System.out.println("4.Update user details ");
			System.out.println("5.Delete user details");
			System.out.println("6.Exit");
			System.out.println("----------------------------------------------");
			System.out.println("----------------------------------------------");
			
			System.out.println("Enter you choice between 1 to 6");
			int n = sc.nextInt();
			
			switch(n)
			{
			 
			case 1:
				uc.userAdd();
				break;
				
			case 2:
				uc.displayAllUser();
				break;
			case 3:
				uc.displaySingleUser();
				break;
			case 4:
				uc.updateUserDetails();
				break;
			case 5:
				uc.deleteUserDetails();
				break;
			case 6:
				flag = false;
				break;
				
			default:
				System.out.println("Invalid input");
			}
		}
		
	}
}
