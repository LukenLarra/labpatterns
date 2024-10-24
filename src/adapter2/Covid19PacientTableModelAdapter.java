package adapter2;

import domain.Covid19Pacient;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Covid19PacientTableModelAdapter extends AbstractTableModel implements TableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };
	  

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  @Override
	  public int getColumnCount() {
	    // Challenge!
		 return 1;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return "Column name 1";
	  }

	  public int getRowCount() {
	    // Challenge!
		  return 1;
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  return "value";
	  }
	}
