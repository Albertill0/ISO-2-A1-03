package Class_Diagram.Domain;

import java.util.Vector;
import Class_Diagram.Domain.Patient;

public class Disease {
	private String _type;
	public Vector<Patient> _contract = new Vector<Patient>();

	public Vector<Diseases> selectAll() {
		throw new UnsupportedOperationException();
	}

	public Disease select(disease aDisease) {
		throw new UnsupportedOperationException();
	}

	public boolean updateDisease(disease aDisease) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminateDisease(_Disease> aVector) {
		throw new UnsupportedOperationException();
	}
}