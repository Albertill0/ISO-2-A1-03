package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration2.Domain;

public class Disease {
	private int _id;
	private String _name;
	private String _symptoms;
	private String _seasonality;
	private String _medicines;
	private float _possibilityOfConfinement;
	private String _vaccinationCampaigns;
	public DiseaseDAO _unnamed_DiseaseDAO_;

	public Disease() {
		throw new UnsupportedOperationException();
	}

	public Disease(int aId, String aSymptoms, String aSeasonality, String aMedicines, float aPossibityOfConfinement, String aVaccinationCampaigns) {
		throw new UnsupportedOperationException();
	}

	public int addDisease() {
		throw new UnsupportedOperationException();
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public int getId() {
		return this._id;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setSymptoms(String aSymptoms) {
		this._symptoms = aSymptoms;
	}

	public String getSymptoms() {
		return this._symptoms;
	}

	public void setSeasonality(String aSeasonality) {
		this._seasonality = aSeasonality;
	}

	public String getSeasonality() {
		return this._seasonality;
	}

	public void setMedicines(String aMedicines) {
		this._medicines = aMedicines;
	}

	public String getMedicines() {
		return this._medicines;
	}

	public void setPossibilityOfConfinement(float aPossibilityOfConfinement) {
		this._possibilityOfConfinement = aPossibilityOfConfinement;
	}

	public float getPossibilityOfConfinement() {
		return this._possibilityOfConfinement;
	}

	public void setVaccinationCampaigns(String aVaccinationCampaigns) {
		this._vaccinationCampaigns = aVaccinationCampaigns;
	}

	public String getVaccinationCampaigns() {
		return this._vaccinationCampaigns;
	}
}