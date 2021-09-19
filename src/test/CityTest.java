package test;



import java.util.Random;
import java.util.Scanner;

import puzzle.Home;


public class CityTest {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
	
		String[] enemies = {"Gorila","Tiger","Bear","Lion","Crocodile"};
	
	//game variables
	int maxEnemyHealth = 60;
	int enemyAttackDamage = 20;
	
	//player variables

	int health = 100;
	int attackDamage = 35;
	int numHealthPots = 5;
	int healthPotionHealAmt = 35;
	int healthPotionDropChance=50;
	
	boolean running = true;
	
	System.out.println("Welcome to Jungle");
	
	GAME:
	while (running){
		
		System.out.println("-------------------------------------------------");
		
		int enemyHealth = rand.nextInt(maxEnemyHealth);
		String enemy = enemies[rand.nextInt(enemies.length)];
		System.out.println("\t# "+ enemy+"\t  appered ##");
		
		while (enemyHealth > 0) {
			System.out.println("\tYour HP: " + health);
			System.out.println("\t"+enemy+"' s health: "+ enemyHealth);
			System.out.println("\n\tWhat would you like to do:");
			System.out.println("\t1. Attack");
			System.out.println("\t2. Drink health potion ");
			System.out.println("\t3. Run Away");
			
			int input = in.nextInt();
			if (input==1) 
			{
				int damageGiven = rand.nextInt(attackDamage);
				int damageTaken = rand.nextInt(enemyAttackDamage);
				
				enemyHealth -= damageGiven;
				health -= damageTaken;
				
				System.out.println("\tyou strike the " +enemy+ " for " +damageGiven+ " damage");
				System.out.println("\tYou receive the " +damageTaken+ " damage");
				
				
				if(health < 1)
				{
					System.out.println("\t You have taken too much damage..You r too week to go on!!");
					break;
					
					
				}
			}
			else if (input==2) 
			{
				if(numHealthPots > 0) {
					health += healthPotionHealAmt;
					numHealthPots--;
					System.out.println("\t You drink a health pot...healing yourself for:"+healthPotionHealAmt
							+"\n\t You now have:"+health+"HP."
							+"\n\t You have:"+numHealthPots+"health pots left.\n");
					
				}
				else {
					System.out.println("\t You have health potion left! Defeat enemy for chance to win health pot");
				}
			}
			else if (input==3)
			{
				System.out.println("\t You run awayfrom the "+enemy+"!");
				continue GAME;
			}
			else {
				System.out.println("\t Invalid command");
			}
		}
		
		if (health < 1)
		{
			System.out.println("You move out of JUNGLE...too week");
			break;
		}
		System.out.println("--------------------------------------------");
		System.out.println("#"+enemy+"was defeated! #");
		System.out.println("# You have "+health+"HP. left");
		if(rand.nextInt(100) < healthPotionDropChance) {
			numHealthPots++;
			System.out.println("# the "+enemy+"drooped a health potion!#");
			System.out.println("#you have "+numHealthPots+"health pots");
			
		}
		System.out.println("---------------------------------------------");
		System.out.println("what would you like to do now");
		System.out.println("1. to continue");
		System.out.println("2. to exit");
		
		int input = in.nextInt();
		
		while (!(input==1) && !(input==2)) {
			System.out.println("Invalid command");
			input =in.nextInt();
		}
			if(input==1) {
				System.out.println("You continue on your adventure");
				
				
			}else if(input==2) {
				System.out.println("You successfully exit JUNGLE");
				break;
			}
	}
	
	System.out.println("###############################");
	System.out.println("# THANKU FOR PLAYING #");
	System.out.println("###############################");
	
	}
}
