package observer;

import java.util.Observable;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	CovidPacient("aitor",	35);
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI((CovidPacient) pacient);

		Observable	pacient2=new CovidPacient("ander",	40);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI((CovidPacient) pacient2);

		Observable	pacient3=new CovidPacient("mikel",	39);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI((CovidPacient) pacient3);
	}


}
