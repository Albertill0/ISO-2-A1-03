package Class_Diagram.Domain;

import java.util.Vector;
import Class_Diagram.Domain.Disease;

public class Doctor {
	private int _experience;
	public Vector<Disease> _manage = new Vector<Disease>();

	public boolean allocatePatient(patient aPatient) {
		throw new UnsupportedOperationException();
	}

	public boolean ModifyState(Patient aPatient) {
		throw new UnsupportedOperationException();
	}

	public boolean deallocatePatient(Patient aPatient_) {
		throw new UnsupportedOperationException();
	}

	public void AddDisease(Disease aDisease) {
		throw new UnsupportedOperationException();
	}
}