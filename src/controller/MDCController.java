package controller;

public class MDCController {

	public MDCController() {
		super();
	}

	public int calculaMDC(int n1, int n2) {
		if (n1 == n2) {
			return n1;
		} else if (n1 > n2) {
			return calculaMDC(n1 - n2, n2);
		} else {
			return calculaMDC(n2, n1);
		}		
		
	}

}
