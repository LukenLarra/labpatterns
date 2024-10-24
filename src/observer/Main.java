package observer;

import java.util.Observable;

import observer.CovidPacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	CovidPacient("aitor",	35);
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI((CovidPacient) pacient);
	}


}
