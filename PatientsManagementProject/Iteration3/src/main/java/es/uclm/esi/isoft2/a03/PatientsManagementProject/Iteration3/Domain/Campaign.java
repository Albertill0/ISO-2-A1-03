package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration3.Domain;

public class Campaign {
	private int _id;
	private String _name;
	private int _cost;
	private String _dateInit;
	private String _dateEnd;
	private float _effectiveness;
	public CampaignDAO _unnamed_CampaignDAO_;

	public Campaign() {
		throw new UnsupportedOperationException();
	}

	public Campaign(int aId, String aName, int aCost, String aDateInt, String aDateEnd, float aEffectiveness) {
		throw new UnsupportedOperationException();
	}

	public int insertCampaign() {
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

	public void setCost(int aCost) {
		this._cost = aCost;
	}

	public int getCost() {
		return this._cost;
	}

	public void setDateInit(String aDateInit) {
		this._dateInit = aDateInit;
	}

	public String getDateInit() {
		return this._dateInit;
	}

	public void setDateEnd(String aDateEnd) {
		this._dateEnd = aDateEnd;
	}

	public String getDateEnd() {
		return this._dateEnd;
	}

	public void setEffectiveness(float aEffectiveness) {
		this._effectiveness = aEffectiveness;
	}

	public float getEffectiveness() {
		return this._effectiveness;
	}
}