import java.util.Random;
public class exe03 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] matriz = new int[3][4];
		int soma = 0, i, j;
	
		//atribuindo valores para a matriz
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				if(j!=3) {
					matriz[i][j] = (int)(Math.random() * 101);
				}else {
					matriz[i][j] = 0;
				}
			}
		}
		
		
		
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				if(j!=3) {
					soma = matriz[i][j];
					matriz[i][3]+=soma;
				}
			}
		}
		
		
		//apresentando matriz
		for(i=0; i<3; i++) {
			System.out.println();
		    for(j=0; j<4; j++) {
				System.out.print("["+matriz[i][j]+"]");
				
			}
		}
		System.out.println();
		
		
		
		
	}

}
