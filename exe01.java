import java.util.Random;
public class exe01 {
	public static void main(String[] args) {
		
		
		int matriz[][], i, j, numAnt=1;
		matriz = new int [4][4];
		
		matriz[0][0] = 1;
		
		
		//Matriz
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				matriz[i][j] = numAnt*2;
				numAnt = matriz[i][j];
						
			}
		}
		
		
		//Apresentar matriz
		for(i=0; i<4; i++) {
			System.out.println();
			for(j=0; j<4; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
		}
	}
}
