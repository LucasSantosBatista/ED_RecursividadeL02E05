package view;
import javax.swing.JOptionPane;
import controller.MDCController; 


public class Main {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
	
		MDCController mdcCont = new MDCController();
		int resultado = mdcCont.calculaMDC(n1, n2);
		System.out.println("MDC de " + n1 + " e " + n2 + " �: " + resultado);
	}

}
