


package EverlandProject;

import java.util.ArrayList;
import java.util.Scanner;
//���� �� �и�

public class EverlandProject1_05 {
	
	public static Scanner sc = new Scanner(System.in);
	public static String ticket = " ";
	//public static	int num;
	public static	int totalPrice = 0;
	public static String people = " ";
	public static String memo = " ";
	public static int number;
	public static int grade;
	public static int birth;
	public static int socialNumber;
	public static int choice;
	
	public static int addOrder =0; public static int orderCount =0;
	public static ArrayList<String> saveTicket = new ArrayList<String>();
	public static ArrayList<String>savePeople =new ArrayList<String>();
	public static ArrayList<Integer> saveNum = new ArrayList<Integer>();
	public static ArrayList<Integer> saveTotalPrice = new ArrayList<Integer>();
	public static ArrayList<String> saveMemo = new ArrayList<String>();

	
		public static void reservationDate() { //��¥
			System.out.print("�̿볯¥�� �Է����ּ��� : ");
			int reservationDate = sc.nextInt();
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
					ticket = "B Ƽ��";
				
				} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
					 || reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
					 || reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
					 || reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
					 || reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
					ticket = "A Ƽ��";
					
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
					ticket = "C Ƽ��";
				
				}
		};  //reservationDate () ����
		
		public static void birth() {
				
		}; // birth() ����
	
		public static void ticketing() {
			System.out.println("�ȳ��Ͻʴϱ� ���������Դϴ�.");
		};
		
		public static void pricetag() {
			System.out.println("�����մϴ�");
			System.out.println("");
			System.out.println("========��������==========");
				
			for(int index=0; index < orderCount; index++) {
					System.out.printf("%s %s X %d %d ��   %s  \n", saveTicket.get(index), savePeople.get(index),
							saveNum.get(index), saveTotalPrice.get(index), saveMemo.get(index));
				} // for ����
			
			System.out.println("========================");
		};
	
		public static void clearAll() {
			saveTicket.clear();
			savePeople.clear();
			saveNum.clear();
			saveTotalPrice.clear();
			saveMemo.clear();
			
		};
		
		public static void ticketGrade() {
			System.out.println("�������� �����ϼ���. ");
			System.out.println("1.����");
			System.out.println("2.�����");
			System.out.println("3.����������");
			System.out.println("4.���ڳ�");
			System.out.println("5.�ӻ��");
			
		

		grade = sc.nextInt();
	if(0 == grade || grade >= 6 ) {
		System.out.println("�ٽ� �Է��� �ּ���.");
	//continue;
		}else if (grade==1) {
		switch(grade) {
	case 1:
		if(birth>= 20210325 && birth <=20210625) { //36�����̸� ����
			totalPrice =number * 0;
			people = "����";
			memo ="* 36���� �̸� ���� ����";
			
		}else if (birth >=20081231 && birth<=20210324){
			// ����36����~��12��
			people = "����";
			totalPrice = number * 48000;
			memo ="* ���ο�� ����";
			
		}else if (birth>=20050101 && birth <=20081230)	{ // û�ҳ� ��13~18��
			totalPrice = number * 50000;
			people = "û�ҳ�";
			memo ="* û�ҳ��� ����";
			
		}else if(birth<=19551212) {//, 65�� �̻�
				totalPrice = number * 48000;
				people = "����";
				memo ="* ��ο�� ����";
		}else if(birth<=19300101 || birth >=20210629) {
			System.out.println("���̰� �ùٸ��� �Էµ��� �ʾҽ��ϴ�. �ٽ� �Է����ּ���");
			//continue
		}else 
			totalPrice = number * 60000;
		people = "�";
		break;	
	};// if
	} //switch case 1���� 
	
	switch(grade) {
	
	case 2:
		totalPrice = number * 36000;
		people = "���";
		break;
	case 3:
		totalPrice = number *30000;
		people = "���������� ����";
		break;
	case 4:
		totalPrice = number * 48000;
		people = "���ڳ� ����";
		break;
	case 5:
		totalPrice = number * 51000;
		people = "�ӻ�� ����";
		break;
	} // switch ����	
	
		};
			
		public static void addOrder() {
			System.out.print("1.�߰�����  2.��������");
			 addOrder = sc.nextInt();
			 saveTicket.add(ticket);
			 savePeople.add(people);
			 saveNum.add(number);
			 saveTotalPrice.add(totalPrice);
			 saveMemo.add(memo);
			 orderCount++;
		};	
		
		public static void startService() {
			System.out.println("�ʿ��� ���񽺸� �����ּ���! : 1. ����  2. ����");
			 choice = sc.nextInt();
		};
		
		public static void infoAndNum() {

			System.out.print("�ֹι�ȣ ���ڸ��� �Է����ּ���(ex.1992.06.20) : ");
			 birth = sc.nextInt();
			System.out.print("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
			number = sc.nextInt();

		};
		
		
		
		public static void main(String[] args) {		
			ticketing();
		while (true) {
			clearAll();
			startService();
		switch(choice) {
		case 2 :
			break;
		case 1:
			do {		
				reservationDate();
				infoAndNum();
			/**
				System.out.print("�ֹι�ȣ ���ڸ��� �Է����ּ���(ex.1992.06.20) : ");
				 birth = sc.nextInt();
				System.out.print("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
				number = sc.nextInt();
*/
				System.out.println(" ");
				System.out.println(" ");			
				ticketGrade();
				addOrder();
			}while (addOrder == 1);
			pricetag();
		}//��� ����ġ ����
		break;  //switch 2 ����
		}// main ����
		}
} 	
		