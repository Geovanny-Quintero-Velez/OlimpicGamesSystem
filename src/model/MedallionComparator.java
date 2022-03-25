package model;

import java.util.Comparator;

public class MedallionComparator implements Comparator<Medallion> {

	@Override
	public int compare(Medallion o1, Medallion o2) {
		if((o1.getGoldMedals()-o2.getGoldMedals())!= 0 ) {
			return o1.getGoldMedals()-o2.getGoldMedals();
		}
		if((o1.getSilverMedals()-o2.getSilverMedals())!= 0 ) {
			return o1.getSilverMedals()-o2.getSilverMedals();
		}
		if((o1.getCopperMedals()-o2.getCopperMedals())!= 0 ) {
			return o1.getCopperMedals()-o2.getCopperMedals();
		}
		return o1.getCountryName().compareTo(o2.getCountryName());
	}

}
