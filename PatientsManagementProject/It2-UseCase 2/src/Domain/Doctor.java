package Domain;

public class Doctor extends Person {
	private int _experience;
	public Disease _unnamed_Disease_;
	public DoctorDAO _unnamed_DoctorDAO_;
	public Patient _unnamed_Patient_;

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