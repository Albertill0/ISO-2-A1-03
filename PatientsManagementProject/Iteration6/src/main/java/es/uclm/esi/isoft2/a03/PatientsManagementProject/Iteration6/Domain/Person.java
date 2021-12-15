package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration6.Domain;

public class Person {
	private String _dNI;
	private String _name;
	private String _surname;
	private int _telephone;

	public Person() {
		throw new UnsupportedOperationException();
	}

	public Person(String aDNI, String aName, String aSurname, int aTelephone) {
		throw new UnsupportedOperationException();
	}

	public void setDNI(String aDNI) {
		this._dNI = aDNI;
	}

	public String getDNI() {
		return this._dNI;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setSurname(String aSurname) {
		this._surname = aSurname;
	}

	public String getSurname() {
		return this._surname;
	}

	public void setTelephone(int aTelephone) {
		this._telephone = aTelephone;
	}

	public int getTelephone() {
		return this._telephone;
	}
}