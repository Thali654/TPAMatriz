import java.util.Random;

public class exe02 {
	public static void main(String[] args) {
		
		int matriz[][] = new int [3][3];
		int i, j, menor=0, maior=0, iMaior=0, iMenor=0, jMaior=0, jMenor=0;
		Random in = new Random();
		
		//Matriz 
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				matriz[i][j] = (int)(Math.random() * 101);
						
			}
		}
		
		maior = matriz[0][0];
		menor = matriz[0][0];
		
		//Menor e maior
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				if(matriz[i][j]<=menor) {
					menor = matriz[i][j];
					iMenor=i;
					jMenor=j;
				}else if(matriz[i][j]>=maior){
					maior = matriz[i][j];
					iMaior=i;
					jMaior=j;
				}
			}
		}
		
		
		//Apresentar matriz
		for(i=0; i<3; i++) {
			System.out.println();
		    for(j=0; j<3; j++) {
				System.out.print("["+matriz[i][j]+"]");
				
			}
		}
		System.out.println();
		
		System.out.println("O maior número da matriz é: "+maior+" e está na linha "+(iMaior+1)+" e coluna "+(jMaior+1));
		System.out.println("O menor número da matriz é: "+menor+" e está na linha "+(iMenor+1)+" e coluna "+(jMenor+1));
		

	}
}