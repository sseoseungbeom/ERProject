package EverlandProject;

import java.util.Scanner;

public class EverlandProject {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하십니까 에버랜드입니다.");
		
		System.out.println("필요한 서비스를 눌러주세요! : 1. 예매  2. 종료");
		int choice = sc.nextInt();

		switch(choice) {
		case 2 :
			break;
			
		case 1:
			while(true) {
		
		System.out.print("이용날짜를 입력해주세요 : ");
		int date = sc.nextInt();
		System.out.print("주민번호 앞자리를 입력해주세요(ex.1992.06.20) : ");
		int birth = sc.nextInt();
		System.out.print("몇 개를 주문하시겠습니까? : ");
		int num = sc.nextInt();
		
		

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("우대사항을 선택하세요. ");
		System.out.println("1.없음");
		System.out.println("2.장애인");
		System.out.println("3.국가유공자");
		System.out.println("4.다자녀");
		System.out.println("5.임산부");
		
		
		int grade = sc.nextInt();
		int totalPrice = 0;
		String people = " ";
		String memo = " ";
		if (grade==1) {
			switch(grade) {
		case 1:
			if(birth>= 20210325 && birth <=20210625) { //36개월미만 무료
				totalPrice =num * 0;
				people = "유아";
				memo ="* 36개월 미만 무료 적용";
				
			}else if (birth >=20081231 && birth<=20210324){
				// 소인36개월~만12세
				people = "소인";
				totalPrice = num * 48000;
				memo ="* 소인요금 적용";
				
			}else if (birth>=20050101 && birth <=20081230)	{ // 청소년 만13~18세
				totalPrice = num * 50000;
				people = "청소년";
				memo ="* 청소년요금 적용";
				
			}else if(birth<=19551212) {//, 65세 이상
					totalPrice = num * 48000;
					people = "노인";
					memo ="* 경로우대 적용";
			}else 
				totalPrice = num * 60000;
			people = "어른";
			break;	
		};// if
		} //switch case 1종료 
		
		switch(grade) {
		
		case 2:
			totalPrice = num* 36000;
			people = "우대";
			break;
		case 3:
			totalPrice = num *30000;
			people = "국가유공자 성인";
			break;
		case 4:
			totalPrice = num * 48000;
			people = "다자녀 성인";
			break;
		case 5:
			totalPrice = num * 51000;
			people = "임산부 성인";
			break;
		} // switch 종료
		
		System.out.printf("가격은 %d 원 입니다.", totalPrice);
		System.out.println("감사합니다");
		System.out.println("");
		System.out.println("========에버랜드==========");
		System.out.printf("A티켓 %s X %d %d 원   %s  \n",people,num, totalPrice, memo);
		System.out.println("========================");

			}
		
		}return;//기능 스위치 종료
		
		} // main 종료
	
	}

	
