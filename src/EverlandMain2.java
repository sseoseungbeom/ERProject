package EverlandProject3;

public class EverlandMain {


	public static void main(String[] args) {

		EverlandProcess everProcess = new EverlandProcess(); 
		EverArrayList everArray = new EverArrayList();
	
		
		everProcess.whatToday();
      while(true) {
    	  everArray.clearALL();
      do {
		 everProcess.inputDate();
		 everProcess.Pricetag();
    	  System.out.println(everProcess.ticketType);   	  
  		  System.out.println("ㅡ");
  		everProcess.putID();
  		  if (everProcess.registNumber.equals("0")) {continue;}
    		everProcess.howBirth();
  		  everProcess.howOrder();
  		  everProcess.choosePrior();
  		  if(everProcess.Prior == 0) {continue;}
  		  System.out.println("ㅡ");
  		  
  		everProcess.isEventCoupon();
  		everProcess.moreOrNot();
  		everArray.ArrayData(everProcess.ticketType ,everProcess.Price, everProcess.Count, everProcess.age,
  				 everProcess.b, everProcess.isEventCoupon);
  		
  			
  	//	everArray.confirmData( dataClass.ticket, dataClass.count, dataClass.price, dataClass.age, dataClass.b, dataClass.isEventCoupon);
		  System.out.println("감사합니다.");
	      System.out.println("============= 에버랜드 =============");
	      
      	}while(everProcess.addOrder == 1);
      everArray.Result();   
    //  everArray.printData();
  		 break;
      }

      

}

}

