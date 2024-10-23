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
        Symptom s = symptomFactory.getSymptomByName(getSymptoms(), symptom);
        if (s == null) {
            s = symptomFactory.createSymptom(symptom); // Usar SymptomFactory para crear el síntoma
            if (s != null) { // Verificar que el síntoma no sea null
                symptoms.add(s);
            }
        }
        return s;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

}
