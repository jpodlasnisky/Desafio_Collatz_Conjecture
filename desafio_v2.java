package fundamentos;

import java.util.HashMap;


public class ProvaGlobo01_v2 {
	private static HashMap<Integer,Integer> cache = new HashMap<Integer, Integer>();
	
	static int tamSequencia(int n) {
		int cont = 0, chave = n;
		while(n>1) {
			if (cache.containsKey(n)) {
				cont += cache.get(n);
				cache.put(chave, cont);
				return cont;
			} else if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3*n + 1;
			}
			cont++;
		}
		return cont;
	}
	
	public static void main(String[] args) {
		int numeroMaiorSequencia = 0;
		int maiorSequenciaTamanho = 0;
		
		for (int i = 1; i < 1000000; i++) {
			int sequencia = tamSequencia(i);
			if(sequencia > maiorSequenciaTamanho) {
				maiorSequenciaTamanho = sequencia;
				numeroMaiorSequencia = i;
			}
			
		}
		System.out.println("O número que apresenta a maior sequencia é " + numeroMaiorSequencia);
		
		
	}
}
