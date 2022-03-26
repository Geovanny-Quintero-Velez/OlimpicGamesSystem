package ui;

import model.MedallionList;

public class Main {

	private static MedallionList maleMedals;
	private static MedallionList femaleMedals;
	private static MedallionList totalMedals;
	
	public static void main(String[] args) {
		
		maleMedals = new MedallionList();
		maleMedals.loadMedallionsMale();
		femaleMedals = new MedallionList();
		femaleMedals.loadMedallionsFemale();
		totalMedals = new MedallionList();
		totalMedals.loadTotalMedallions();
		maleMedals.sortComparatorClass();
		femaleMedals.sortComparableCollection();
		totalMedals.medallionsBubbleSort();
		printLists();
		
		
	}
	
	public static void printLists() {
		System.out.println("----------");
		System.out.println("Males");
		for(int i=0;i<maleMedals.getMedallions().size();i++) {
			System.out.println(maleMedals.getMedallions().get(i).toString());
		}
		System.out.println("----------");
		System.out.println("Females");
		for(int i=0;i<femaleMedals.getMedallions().size();i++) {
			System.out.println(femaleMedals.getMedallions().get(i).toString());
		}
		System.out.println("----------");
		System.out.println("Total");
		for(int i=0;i<totalMedals.getMedallions().size();i++) {
			System.out.println(totalMedals.getMedallions().get(i).toString());
		}
		System.out.println("----------");
	}
	
}
