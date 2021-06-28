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
		int reservationDate = sc.nextInt();
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
		String ticket = " ";
		String people = " ";
		String memo = " ";
		
		
		if(reservationDate == 20210703 || reservationDate == 20210704 || reservationDate == 20210710 || reservationDate == 20210711 || reservationDate == 20210717 
				 || reservationDate == 20210718 || reservationDate == 20210724 || reservationDate == 20210725 || reservationDate == 20210729 || reservationDate == 20210730 
				 || reservationDate == 20210731 || reservationDate == 20210801 || reservationDate == 20210802 || reservationDate == 20210803 || reservationDate == 20210807 
				 || reservationDate == 20210808 || reservationDate == 20210814 || reservationDate == 20210815 || reservationDate == 20210821 || reservationDate == 20210822 
				 || reservationDate == 20210828 || reservationDate == 20210829 || reservationDate == 20210903 || reservationDate == 20210906 || reservationDate == 20210907 
				 || reservationDate == 20210908 || reservationDate == 20210909 || reservationDate == 20210910 || reservationDate == 20210913 || reservationDate == 20210914 
				 || reservationDate == 20210915 || reservationDate == 20210916 || reservationDate == 20210917 || reservationDate == 20210923 || reservationDate == 20210924 
				 || reservationDate == 20210927 || reservationDate == 20210928 || reservationDate == 20210929 || reservationDate == 20210930 || reservationDate == 20211001 
				 || reservationDate == 20211004 || reservationDate == 20211005 || reservationDate == 20211006 || reservationDate == 20211007 || reservationDate == 20211008 
				 || reservationDate == 20211011 || reservationDate == 20211012 || reservationDate == 20211013 || reservationDate == 20211014 || reservationDate == 20211015 
				 || reservationDate == 20211018 || reservationDate == 20211019 || reservationDate == 20211020 || reservationDate == 20211021 || reservationDate == 20211022
				 || reservationDate == 20211025 || reservationDate == 20211026 || reservationDate == 20211027 || reservationDate == 20211028 || reservationDate == 20211029 
				 || reservationDate == 20211101 || reservationDate == 20211102 || reservationDate == 20211103 || reservationDate == 20211104 || reservationDate == 20211105 
				 || reservationDate == 20211108 || reservationDate == 20211109 || reservationDate == 20211110 || reservationDate == 20211111 || reservationDate == 20211112 
				 || reservationDate == 20211113 || reservationDate == 20211114 || reservationDate == 20211120 || reservationDate == 20211121 || reservationDate == 20211127 
				 || reservationDate == 20211128) {
				ticket = "B 티켓";
			
			} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
				 || reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
				 || reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
				 || reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
				 || reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
				ticket = "A 티켓";
				
			} else if(reservationDate == 20210628 || reservationDate == 20210629 || reservationDate == 20210630 || reservationDate == 20210701 || reservationDate == 20210702
				 || reservationDate == 20210705 || reservationDate == 20210706 || reservationDate == 20210707 || reservationDate == 20210708 || reservationDate == 20210709
				 || reservationDate == 20210712 || reservationDate == 20210713 || reservationDate == 20210714 || reservationDate == 20210715 || reservationDate == 20210716
				 || reservationDate == 20210719 || reservationDate == 20210720 || reservationDate == 20210721 || reservationDate == 20210722 || reservationDate == 20210723
				 || reservationDate == 20210726 || reservationDate == 20210727 || reservationDate == 20210728 || reservationDate == 20210804 || reservationDate == 20210805
				 || reservationDate == 20210806 || reservationDate == 20210809 || reservationDate == 20210810 || reservationDate == 20210811 || reservationDate == 20210812
				 || reservationDate == 20210813 || reservationDate == 20210816 || reservationDate == 20210817 || reservationDate == 20210818 || reservationDate == 20210819
				 || reservationDate == 20210820 || reservationDate == 20210823 || reservationDate == 20210824 || reservationDate == 20210825 || reservationDate == 20210826
				 || reservationDate == 20210827 || reservationDate == 20210830 || reservationDate == 20210831 || reservationDate == 20210901 || reservationDate == 20210902
				 || reservationDate == 20211115 || reservationDate == 20211116 || reservationDate == 20211117 || reservationDate == 20211118 || reservationDate == 20211119
				 || reservationDate == 20211122 || reservationDate == 20211123 || reservationDate == 20211124 || reservationDate == 20211125 || reservationDate == 20211126
				 || reservationDate == 20211129 || reservationDate == 20211130) {
				ticket = "C 티켓";
			
			}
		
		
		
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
		System.out.printf("%s %s X %d %d 원   %s  \n", ticket, people,num, totalPrice, memo);
		System.out.println("========================");

			}
	
		}//기능 스위치 종료
		
		} // main 종료
	
	}

	
