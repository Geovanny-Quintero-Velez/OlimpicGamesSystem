package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedallionList {

	private List<Medallion> medallions;
	
	public MedallionList() {
		medallions = new ArrayList<>();
	}
	
	public void loadMedallionsMale(){
		File file = new File("..\\files\\Participants.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			while(br.ready()) {
				String line = br.readLine();
				String[] data = line.split(";");
				String countryName = data[0];
				int goldMedals = Integer.parseInt(data[1]);
				int silverMedals = Integer.parseInt(data[2]);
				int copperMedals = Integer.parseInt(data[3]);
				addMedallion(new Medallion(countryName, goldMedals, silverMedals, copperMedals));
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadMedallionsFemale(){
		File file = new File("..\\files\\Participants.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			while(br.ready()) {
				String line = br.readLine();
				String[] data = line.split(";");
				String countryName = data[0];
				int goldMedals = Integer.parseInt(data[4]);
				int silverMedals = Integer.parseInt(data[5]);
				int copperMedals = Integer.parseInt(data[6]);
				addMedallion(new Medallion(countryName, goldMedals, silverMedals, copperMedals));
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadTotalMedallions() {
		File file = new File("..\\files\\Participants.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			while(br.ready()) {
				String line = br.readLine();
				String[] data = line.split(";");
				String countryName = data[0];
				int goldMedals = Integer.parseInt(data[4])+Integer.parseInt(data[1]);
				int silverMedals = Integer.parseInt(data[5])+Integer.parseInt(data[2]);
				int copperMedals = Integer.parseInt(data[6])+Integer.parseInt(data[3]);
				addMedallion(new Medallion(countryName, goldMedals, silverMedals, copperMedals));
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addMedallion(Medallion medallion) {
		medallions.add(medallion);
	}
	
	public List<Medallion> getMedallions(){
		return medallions;
	}
	
	public void sortComparableCollection() {
		Collections.sort(medallions);
	}
	
	public void sortComparatorClass() {
		Collections.sort(medallions, new MedallionComparator());
	}
}
