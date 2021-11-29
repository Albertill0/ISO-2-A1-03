package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration4.Domain;

import es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration4.Persistence.PatientDAO;

public class Patient extends Person {
	private String _state;
	public PatientDAO _unnamed_PatientDAO_;

	public Patient(String aDNI) {
		super(aDNI);
		throw new UnsupportedOperationException();
	}

	public int modifyState() {
		throw new UnsupportedOperationException();
	}

	public void setState(String aState) {
		this._state = aState;
	}

	public String getState() {
		return this._state;
	}
}