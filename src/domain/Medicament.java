package domain;

import factory.SymptomFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicament {

    private String name;
    private List<Symptom> symptoms = new ArrayList<>();
    private SymptomFactory symptomFactory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medicament(String name) {
        super();
        this.name = name;
        this.symptomFactory = SymptomFactory.getInstance();
    }

    public Symptom addSymptomByName(String symptom) {
        Symptom s = getSymptomByName(symptom);
        if (s == null) {
            s = symptomFactory.createSymptom(symptom); // Usar SymptomFactory para crear el síntoma
            if (s != null) { // Verificar que el síntoma no sea null
                symptoms.add(s);
            }
        }
        return s;
    }

    public void removeSymptom(Symptom s) {
        symptoms.remove(s);

    }

    public Iterator<Symptom> getSymptoms() {
        return symptoms.iterator();
    }

    public Symptom getSymptomByName(String symptomName) {
        Iterator<Symptom> i = symptoms.iterator();
        Symptom s = null;
        while (i.hasNext()) {
            s = i.next();
            if (s != null && s.getName().compareTo(symptomName) == 0) {
                return s;
            }
        }
        return null;
    }

    public Symptom removeSymptomByName(String symptomName) {
        Symptom s = getSymptomByName(symptomName);
        if (s != null) {
            removeSymptom(s);
        }
        return s;
    }

}
