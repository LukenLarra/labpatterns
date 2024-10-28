package iterator;

import adapter.InvertedIterator;
import adapter.SeverityIndexComparator;
import adapter.Sorting;
import adapter.SymptomNameComparator;
import domain.Covid19Pacient;
import domain.Symptom;
import java.util.Iterator;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p = new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 1), 1);
			p.addSymptom(new Symptom("s2", 10, 1), 2);
			p.addSymptom(new Symptom("s3", 10, 5), 3);
			p.addSymptom(new Symptom("s4", 10, 5), 2);
			p.addSymptom(new Symptom("s5", 10, 3), 3);
			
			InvertedIterator invertedIterator = new Covid19PacientIterator(p.getSymptoms());
			
			Iterator<Object> iteratorByName = Sorting.sortedIterator(invertedIterator, new SymptomNameComparator());
			
			while (iteratorByName.hasNext()) {
				Symptom symptom = (Symptom) iteratorByName.next();
				System.out.println(symptom.getName() + " - Severidad: " + symptom.getSeverityIndex());
			}
			
			System.out.println("-------------------------------------------------");
			
			Iterator<Object> iteratorBySeverity = Sorting.sortedIterator(invertedIterator, new SeverityIndexComparator());
			
			while (iteratorBySeverity.hasNext()) {
				Symptom symptom = (Symptom) iteratorBySeverity.next();
				System.out.println(symptom.getName() + " - Severidad: " + symptom.getSeverityIndex());
			}
	}
}

