package EverlandProject2;
import java.util.ArrayList;

public class EverArrayList {

	public ArrayList<String> arrayTicket = new ArrayList<String>();
	public ArrayList<String> arrayAge = new ArrayList<String>();
	public ArrayList<Integer> arrayCount = new ArrayList<Integer>();
	public ArrayList<Integer> arrayPrice = new ArrayList<Integer>();
	public ArrayList<String> arrb = new ArrayList<String>();

	public void clearALL() {
		   arrayTicket.clear();
	  	  	arrayAge.clear();
	  	  	arrayCount.clear();
	  	  	arrayPrice.clear();
	  	  	arrb.clear(); }

	public void ArrayAdd(String ticketType, String age, int Count, int Price, String b) {
		arrayTicket.add(ticketType);
		arrayAge.add(age);
		arrayCount.add(Count);
		arrayPrice.add(Price);
		arrb.add(b);

	}

	public void Result() {
	for(int index = 0; index < arrayTicket.size(); index++) {
	      System.out.printf("%s  %s  X  %d  %d  %s\n", arrayTicket.get(index), arrayAge.get(index),
	    		  			arrayCount.get(index), arrayCount.get(index)*arrayPrice.get(index), arrb.get(index));
		}
	System.out.println("========================================");
	}


}
