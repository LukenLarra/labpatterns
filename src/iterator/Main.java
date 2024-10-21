package iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import java.util.Iterator;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p = new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 10), 1);
			p.addSymptom(new Symptom("s2", 10, 10), 2);
			p.addSymptom(new Symptom("s3", 10, 10), 3);
			p.addSymptom(new Symptom("s4", 10, 10), 4);
			p.addSymptom(new Symptom("s5", 10, 10), 5);
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());

		}

	}

