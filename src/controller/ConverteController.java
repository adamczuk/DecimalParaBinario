package controller;

import br.edu.fateczl.adamczuk.pilhaint.Pilha;

public class ConverteController {
	private Pilha p = new Pilha();

	public String decToBin(int valor) {
		String saida = "";
		converter(valor);
		for (int i = p.size(); i > 0; i--) {
			try {
				saida += p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return saida;

	}

	private int converter(int valor) {
		p.push(valor % 2);
		if (valor == 0) {
			return 0;
		} else {
			return converter(valor / 2);
		}
	}
}
