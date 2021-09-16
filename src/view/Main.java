package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Main {

	public static void main(String[] args) {
		ConverteController cController = new ConverteController();

		int valor = -1;

		do {

			String entrada = JOptionPane
					.showInputDialog("Inserir um numero natural positivo para obter sua conversao em BINARIO");
			if (entrada == null) {
				break;
			} else {
				try {
					valor = Integer.parseInt(entrada);
				} catch (NumberFormatException e) {

				}
			}
		} while (valor < 0);

		if (valor >= 0) {
			String binario = cController.decToBin(valor);

			JOptionPane.showMessageDialog(null, "Numero inserido: " + valor + "\n\nEm binario: " + binario);
		}
	}

}
