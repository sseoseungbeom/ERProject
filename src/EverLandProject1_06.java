package EverlandProject;
import java.util.ArrayList;
import java.util.Scanner;


public class EverLandProject1_06 {


		public static void main(String[] args) {	
			
			EverlandProcess1 everProcess = new EverlandProcess1();
			EverArray1 everArray = new EverArray1();
			
			everProcess.ticketing();
		while (true) {
			everArray.clearAll();
			everProcess.startService();
		switch(everProcess.choice) {
		case 2 :
			break;
		case 1:
			do {		
				everArray.reservationDate();
				everArray.infoAndNum();
			/**
				System.out.print("주민번호 앞자리를 입력해주세요(ex.1992.06.20) : ");
				 birth = sc.nextInt();
				System.out.print("몇 개를 주문하시겠습니까? : ");
				number = sc.nextInt();
*/
				System.out.println(" ");
				System.out.println(" ");			
				everArray.ticketGrade();
				everArray.addOrder();
				
				everArray.ArrayAdd(everArray.ticket, everArray.people, everArray.number, everArray.totalPrice, everArray.memo);
			}while (everArray.addOrder == 1);
			everArray.pricetag();
		}//기능 스위치 종료
		break;  //switch 2 종료
		}// main 종료
		}
} 	


