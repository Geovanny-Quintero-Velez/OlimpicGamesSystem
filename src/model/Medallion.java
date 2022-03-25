package model;

public class Medallion implements Comparable<Medallion>{

	private String countryName = "";
	private int goldMedals = 0;
	private int silverMedals = 0;
	private int copperMedals = 0;
	
	public Medallion(String country, int mgm, int msm, int mcm) {
		countryName = country;
		goldMedals = mgm;
		silverMedals = msm;
		copperMedals = mcm;
	}

	@Override
	public int compareTo(Medallion other) {
		int result = 0;
		result = this.getGoldMedals()-other.getGoldMedals();
		if(result == 0) {
			result = this.getSilverMedals()-other.getSilverMedals();
		}
		if(result == 0) {
			result = this.getCopperMedals()-other.getCopperMedals();
		}
		if(result == 0) {
			result = this.getCountryName().compareTo(other.getCountryName());
		}
		return result;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getGoldMedals() {
		return goldMedals;
	}

	public void setGoldMedals(int goldMedals) {
		this.goldMedals = goldMedals;
	}

	public int getSilverMedals() {
		return silverMedals;
	}

	public void setSilverMedals(int silverMedals) {
		this.silverMedals = silverMedals;
	}

	public int getCopperMedals() {
		return copperMedals;
	}

	public void setCopperMedals(int copperMedals) {
		this.copperMedals = copperMedals;
	}
	
	public String toString() {
		String message = "Country: " + getCountryName() +", Gold medals: "+getGoldMedals()+", Silver medals: "+getSilverMedals()+", Copper medals: "+getCopperMedals()+".";
		return message;
	}

	
	
	
}
