package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class Citymain {
	
	 BufferedReader bufferedReader;
	 Scanner scanner;
	 FileWriter fileWriter;
	 String username;
	  Random randomNumber;
	 	String[] enemies = {"Gorila","Tiger","Bear","Lion","Crocodile"};
    public Citymain()
    {
    	 String filePath = "myGame.txt";
         scanner = new Scanner(System.in);
         System.out.print("Player Name:-  ");
         username = scanner.nextLine();
         System.out.println("******** Start Game ********");
         int min = 1;
         int max = 10;
         int chioce;
         int numHealthPots = 5;
		try {
			fileWriter = new FileWriter(filePath,true);
			fileWriter.write(username + "\n");
			fileWriter.flush();
			randomNumber=new Random();
			chioce=randomNumber.nextInt(max-min) + min;
			
			switch(chioce)
			{
			case 1:
				System.out.println("Location :- A ");
					new PuzzleFirst();
				break;

			case 2:
				System.out.println("Location :- B ");
				break;

			case 3:
				System.out.println("Location :- C ");
				break;

			case 4:
				System.out.println("Location :- D ");
				break;

			case 5:
				System.out.println("Location :- E ");
				break;

			case 6:
				System.out.println("Location :- F ");
				break;

			case 7:
				System.out.println("Location :- G ");
				break;

			case 8:
				System.out.println("Location :- H ");
				break;

			case 9:
				System.out.println("Location :- I ");
				break;

			case 10:
				System.out.println("Location :- J ");
				break;
			default:
				System.out.println("Invalid Location Option");
			}
             
         	}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
     	
     }
    
	public static void main(String[] args) {
		
			new Citymain();
			
			
		
	}
}
