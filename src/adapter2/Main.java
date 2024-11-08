package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient1=new Covid19Pacient("aitor", 35);
		pacient1.addSymptomByName("disnea", 2);
		pacient1.addSymptomByName("cefalea", 1);
		pacient1.addSymptomByName("astenia", 3);

		Covid19Pacient pacient2=new Covid19Pacient("jon", 20);
		pacient2.addSymptomByName("fiebre", 2);
		pacient2.addSymptomByName("vómitos", 1);
		pacient2.addSymptomByName("nauseas", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient1);
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);

		gui.setPreferredSize(new java.awt.Dimension(500, 500));
		gui.setVisible(true);
		
		gui2.setPreferredSize(new java.awt.Dimension(500, 400));
		gui2.setVisible(true);
	}

}
