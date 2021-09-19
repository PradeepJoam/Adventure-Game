package puzzle;

import java.util.Scanner;

public class Home {

	static int[][] puzzle;	// Spielfeld
	static int size, x, y;	// Groesse des Spielfeldes (size x size), x,y-Koordinaten der freien Stelle
	
	public static int getSize() {
		return size;
	}
	public static void setSize(int size) {
		Home.size = size;
	}
	public Home() {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How great the game be?");
		createPuzzle(scanner.nextInt());
		//scanner.close();
		mixPuzzle(60);
		System.out.println("OK, ready to go");
		while(!isSolved()){
			printPuzzle();
			makeMove(getKey());
		}
		printPuzzle();
		System.out.println("Congratulations! You did it!");
	
	}
	public static boolean isSolved() {
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(puzzle[j][i] == 0) continue;
				if(puzzle[j][i] != 1 + j*size + i) return false;
			}
		}
		return true;
	}
	
	/** Mischt das Puzzle in zufaelligen Schritten durch
	 * @param moves Anzahl der Mix-Schritte
	*/
	public static void mixPuzzle(int moves) {
		boolean success = true;
		while(moves > 0){
			switch((int)Math.floor(Math.random()*4)){
				case 0:{
					success = makeMove('W');
					break;
				}
				case 1:{
					success = makeMove('A');
					break;
				}
				case 2:{
					success = makeMove('S');
					break;
				}
				case 3:{
					success = makeMove('D');
					break;
				}
			}
			if(success) moves--;
		}
	}
	
	/** Benutzer einen Schritt machen lassen (Tasteneingabe WASD erwarten)
	 *  @return Gibt die Richtungstaste zurueck
	 */
	public static char getKey() {
		Scanner scanner = new Scanner(System.in);
		char key;
		String tmp;
		System.out.print("Use WASD to move '0'. ");
		do{
			tmp = scanner.nextLine().toUpperCase();
			System.out.print(" ");
			if(tmp.length() != 1) key = 'X';
			else key = tmp.charAt(0);
		}while(key!='W' && key!='A' && key!='S' && key!='D');
		//scanner.close();
		System.out.println();
		return key;
	}
	
	/** Naechsten Spielschritt machen
	 */
	public static boolean makeMove(char key) {
		int tmp;
		switch(key){
			case 'W':{
				if(y < 1) return false;
				tmp = puzzle[y][x];
				puzzle[y][x] = puzzle[y-1][x];
				puzzle[y-1][x] = tmp;
				y--;
				break;
			}
			case 'A':{
				if(x < 1) return false;
				tmp = puzzle[y][x];
				puzzle[y][x] = puzzle[y][x-1];
				puzzle[y][x-1] = tmp;
				x--;
				break;
			}
			case 'S':{
				if(y > size-2) return false;
				tmp = puzzle[y][x];
				puzzle[y][x] = puzzle[y+1][x];
				puzzle[y+1][x] = tmp;
				y++;
				break;
			}
			case 'D':{
				if(x > size-2) return false;
				tmp = puzzle[y][x];
				puzzle[y][x] = puzzle[y][x+1];
				puzzle[y][x+1] = tmp;
				x++;
				break;
			}
		}
		return true;
	}
	
	/** Erstellt ein neues Puzzlefeld mit der angegebenen Groesse
	 * 
	 * @param size Groesse des Spielfeldes (quadratisch)
	 */
	public static void createPuzzle(int size) {
		setSize(size);
		puzzle = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				puzzle[j][i] = 1 + j*size + i;
			}
		}
		x = size-1;
		y = size-1;
		puzzle[x][y] = 0;
	}
	
	/** Gibt das Puzzle aus
	 */
	public static void printPuzzle() {
		if(puzzle == null){
			System.out.println("Playfield can not be played, it has not been created yet!");
			return;
		}
		String str;
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				str = puzzle[i][j]+" ";
				if(puzzle[i][j] < 10) str = " "+str;
				System.out.print(str);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new Home();
		
	}

}
