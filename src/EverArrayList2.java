package EverlandProject3;
import java.util.ArrayList;

public class EverArrayList {

//	public ArrayList<String> arrayTicket = new ArrayList<String>();
//	public ArrayList<String> arrayAge = new ArrayList<String>();
//	public ArrayList<Integer> arrayCount = new ArrayList<Integer>();
//	public ArrayList<Integer> arrayPrice = new ArrayList<Integer>();
//	public ArrayList<String> arrb = new ArrayList<String>();

	public ArrayList<DataClass> arrData = new ArrayList<DataClass>();
	
	
	public void ArrayData(String ticket, 
			int count, int price, String age, String b, String isEventCoupon) {
		DataClass item = new DataClass();
		item.ticket = ticket;
		item.count = count;
		item.price =price;
		item.age= age;
		item.b= b;
		item.isEventCoupon = isEventCoupon;
		arrData.add(item);
	}
	
	/**
	 * public void ArrayAdd(String ticketType, String age, int Count, int Price, String b) {
		arrayTicket.add(ticketType);
		arrayAge.add(age);
		arrayCount.add(Count);
		arrayPrice.add(Price);
		arrb.add(b);

	}
	 */
	
	public void clearALL() {
	
//		   arrayTicket.clear();
//	  	  	arrayAge.clear();
//	  	  	arrayCount.clear();
//	  	  	arrayPrice.clear();
//	  	  	arrb.clear(); 
		}
	/**
	public void printData() {
		int sum =0;
		for (int i=0; i<arrData.size(); i++) {
			sum += arrData.get(i).price * arrData.get(i).count;
		}
		System.out.printf("가격은 %d 원입니다. \n",sum);
		System.out.println("감사합니다");
		for (int i=0; i < arrData.size(); i++) {
			System.out.printf("%s\t %s %d %d %s ",
					arrData.get(i).ticket, arrData.get(i).age, arrData.get(i).count,
					arrData.get(i).price *arrData.get(i).count,
					arrData.get(i).b, arrData.get(i).isEventCoupon
				);
		}
		
	}//printData end
	
	
	/**
	public void Result() {
		for(int index = 0; index < arrData.size(); index++) {
		      System.out.printf("%s  %s  X  %d  %d  %s\n",arrayTicket.get(index), arrayAge.get(index),
		    		  			arrayCount.get(index), arrayCount.get(index)*arrayPrice.get(index), arrb.get(index));
			}
	*/
	public void Result() {
	for(int index = 0; index < arrData.size(); index++) {
	      System.out.printf("%s  %s %d X %d %d  %s\n",arrData.get(index).ticket, arrData.get(index).age,
	    		   arrData.get(index).count,arrData.get(index).price,  arrData.get(index).price*arrData.get(index).count, arrData.get(index).b);
		}
	System.out.println("========================================");
	}


	

}
