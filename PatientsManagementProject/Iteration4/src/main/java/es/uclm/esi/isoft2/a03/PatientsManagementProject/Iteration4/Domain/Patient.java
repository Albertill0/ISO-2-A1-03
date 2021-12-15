package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration4.Domain;

public class Patient extends Person {
	private String _state;
	private boolean _confinement;
	private String _hospitalCare;
	public PatientDAO _unnamed_PatientDAO_;

	public Patient() {
		throw new UnsupportedOperationException();
	}

	public Patient(String aDNI, String aName, String aSurname, int aTelephone, String aState, boolean aConfinement, String aHospitalCare) {
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

	public void setConfinement(boolean aConfinement) {
		this._confinement = aConfinement;
	}

	public boolean isConfinement() {
		return this._confinement;
	}

	public void setHospitalCare(String aHospitalCare) {
		this._hospitalCare = aHospitalCare;
	}

	public String getHospitalCare() {
		return this._hospitalCare;
	}
}