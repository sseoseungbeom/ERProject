package EverlandProject2;

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
  		  System.out.println("��");
  		everProcess.putID();
  		  if (everProcess.registNumber.equals("0")) {continue;}
    		everProcess.howBirth();
  		  everProcess.howOrder();
  		  everProcess.choosePrior();
  		  if(everProcess.Prior == 0) {continue;}
  		  System.out.println("��");
  		everProcess.moreOrNot();
  		everArray.ArrayAdd(everProcess.ticketType, everProcess.age,
  				  			everProcess.Count, everProcess.Price, everProcess.b);
		  System.out.println("�����մϴ�.");
	      System.out.println("============= �������� =============");
      	}while(everProcess.addOrder == 1);
      everArray.Result();   
  		 break;
      }

      

}

}

