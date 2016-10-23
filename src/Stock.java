
import java.io.*;

public class Stock {
	//Variables
	private String timeStamp;			
	private String outputFileName;
	private String inputFileName;
	private double openingPrice;	//Double holding Next Price of Stock
	private double highestPrice;
	private double lowestPrice;
	private double closingPrice;
	private double volumeOfStocks;
	
	/**
	 * This sets the private variables to the default
	 */
	public Stock() {
		
	}//Closes Stock Method
	
	/**
	 * This sets the time stamp to the given string
	 * @param n
	 */
	public void setTimeStamp(String t){
		//Assigns the name to the private variable
		timeStamp = t;
	}
	public void setOpeningPrice(double o) {
		openingPrice = o;
	}
	public void setHighestPrice(double h) {
		highestPrice = h;
	}
	public void setLowestPrice(double l) {
		lowestPrice = l;
	}
	public void setClosingPrice(double c) {
		closingPrice = c;
	}
	public void setVolumeOfStocks(double v) {
		volumeOfStocks = v;
	}
	
	public void SetOutputFileName(String s) {
		outputFileName = s;
	}
	public void SetInputFileName(String s) {
		File file = new File("");
		
		inputFileName = s;
	}
	/**
	 * This returns the company name 
	 * @return
	 */
	public String getTimeStamp() {
		//returns the name of the company
		return timeStamp;
	}
	public double getOpeningPrice() {
		return openingPrice;
	}
	public double getHighestPrice() {
		return highestPrice;
	}
	public double getLowestPrice() {
		return lowestPrice;
	}
	public double getClosingPrice() {
		return closingPrice;
	}
	public double getVolumeOfStocks() {
		return volumeOfStocks;
	}
	
	public String getOutputFileName() {
		return outputFileName;
	}
	public String getInputFileName() {
		return inputFileName;
	}
	/**
	 * This changes next price according the percentage by a negative or positive number
	 */
	
	public void printHeaders(){
		//Outputs the header names
		System.out.println("STOCK\tSYMBOL\tYESTERDAY'S PRICE\tTODAY'S PRICE\tPRICE MOVEMENT\tCHANGE PERCENT");
	}
	
	/**
	 * This prints the Headers & stock information
	 * @param cN
	 * @param cS
	 * @param cP
	 * @param nP
	 * @param rn
	 */
	public void printResults(String cN, String cS, double cP, double nP, double rn) {
		//Print results to screen for user to see the Stock Prices Fluctuation
		System.out.printf("%s\t%s\t%.2f\t\t\t%.2f\t\t%.2f\t\t%.2f\n", cN, cS, cP, nP, nP-cP, rn);
	}
	public double FindAverage(double [][] p) {
		double sum = 0;
		double average;
		
		for(int i=0; i<p.length; i++) {
			sum+=p[0][i];
		}
		average = sum/p.length;
		
		return average;
	}
	
	public String FindHighest(double [] p, String[] s) {
		String highest = new String();
		int index = 0;
		double value = 0;
		
		for(int i = 0; i<p.length; i++) {
			if(p[i] > value) {
				value = p[i];
				index = i;
			}
		}
		highest = s[index];
		return highest;
	}
	
	public String FindLowest(double [] p, String[] s) {
		String lowest = new String();
		int index = 0;
		double value = p[0];
		
		for(int i = 0; i<p.length; i++) {
			if(p[i] < value) {
				value = p[i];
				index = i;
			}
		}
		lowest = s[index];
		return lowest;
	}
	
	
	
}//Closes public Stock Class
