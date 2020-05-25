package fundamentos;


public class ProvaGlobo01 {

	public static int geraSequencia(int numero) {
		int contador = 1;
		while (numero > 1) {
			if(numero % 2 == 0) {
				numero = numero / 2;
			} else {
				numero = (numero * 3) + 1;
			}
			contador++;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		int maiorNumeroSequencia = 0;
		int maiorSequenciaTamanho = 0;
		
		for (int i = 1; i < 1000000; i++) {
			int sequencia = geraSequencia(i);
			if(sequencia > maiorSequenciaTamanho) {
				maiorSequenciaTamanho = sequencia;
				maiorNumeroSequencia = i;
			}
			
		}
		System.out.println("O número que apresenta a maior sequencia é " + maiorNumeroSequencia);
		
		
	}
}
