package adapter2;

import domain.Covid19Pacient;
import domain.Symptom;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Covid19PacientTableModelAdapter extends AbstractTableModel{
	private Covid19Pacient pacient;
	private String[] columnNames = new String[] {"Symptom", "Weight" };
	private List<Symptom> symptoms;

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient=p;
        this.symptoms = new ArrayList<>(p.getSymptoms()); 
	}

	@Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public int getRowCount() {
        return symptoms.size(); // Número de síntomas en el paciente
    }

    @Override
    public Object getValueAt(int row, int col) {
        Symptom symptom = symptoms.get(row);
		if (col==0){
			return symptom.getName(); 
		}else if (col==1) {
			return pacient.getWeight(symptom);
		}
		return null;
    }
}
