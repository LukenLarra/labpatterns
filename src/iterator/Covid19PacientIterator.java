package iterator;

import adapter.InvertedIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;

import domain.Symptom;

public class Covid19PacientIterator implements Iterator, InvertedIterator{
	List<Symptom> symptoms=new Vector<Symptom>();
	int position=0;

	public Covid19PacientIterator(Set<Symptom> s) {
		Iterator<Symptom> i=s.iterator();
		while (i.hasNext())
			symptoms.add(i.next());
		
	}

	@Override
	public boolean hasNext() {
		return position<symptoms.size();
	}

	@Override
	public Object next() {
		if (!hasNext()) {
            throw new NoSuchElementException("No more elements to iterate.");
        }
		return symptoms.get(position++);
	}

	@Override
	public Object previous() {
		if (!hasPrevious()) {
            throw new NoSuchElementException("No previous elements.");
        }
		return symptoms.get(position--);
	}

	@Override
	public boolean hasPrevious() {
		return position>=0;
	}

	@Override
	public void goLast() {
		position=symptoms.size()-1;
	}

}
