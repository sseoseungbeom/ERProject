package EverlandProject;

import java.util.Scanner;

public class EverlandProject {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��Ͻʴϱ� ���������Դϴ�.");
		
		System.out.println("�ʿ��� ���񽺸� �����ּ���! : 1. ����  2. ����");
		int choice = sc.nextInt();

		switch(choice) {
		case 2 :
			break;
			
		case 1:
			while(true) {
		
		System.out.print("�̿볯¥�� �Է����ּ��� : ");
		int date = sc.nextInt();
		System.out.print("�ֹι�ȣ ���ڸ��� �Է����ּ���(ex.1992.06.20) : ");
		int birth = sc.nextInt();
		System.out.print("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
		int num = sc.nextInt();
		
		

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("�������� �����ϼ���. ");
		System.out.println("1.����");
		System.out.println("2.�����");
		System.out.println("3.����������");
		System.out.println("4.���ڳ�");
		System.out.println("5.�ӻ��");
		
		
		int grade = sc.nextInt();
		int totalPrice = 0;
		String people = " ";
		String memo = " ";
		if (grade==1) {
			switch(grade) {
		case 1:
			if(birth>= 20210325 && birth <=20210625) { //36�����̸� ����
				totalPrice =num * 0;
				people = "����";
				memo ="* 36���� �̸� ���� ����";
				
			}else if (birth >=20081231 && birth<=20210324){
				// ����36����~��12��
				people = "����";
				totalPrice = num * 48000;
				memo ="* ���ο�� ����";
				
			}else if (birth>=20050101 && birth <=20081230)	{ // û�ҳ� ��13~18��
				totalPrice = num * 50000;
				people = "û�ҳ�";
				memo ="* û�ҳ��� ����";
				
			}else if(birth<=19551212) {//, 65�� �̻�
					totalPrice = num * 48000;
					people = "����";
					memo ="* ��ο�� ����";
			}else 
				totalPrice = num * 60000;
			people = "�";
			break;	
		};// if
		} //switch case 1���� 
		
		switch(grade) {
		
		case 2:
			totalPrice = num* 36000;
			people = "���";
			break;
		case 3:
			totalPrice = num *30000;
			people = "���������� ����";
			break;
		case 4:
			totalPrice = num * 48000;
			people = "���ڳ� ����";
			break;
		case 5:
			totalPrice = num * 51000;
			people = "�ӻ�� ����";
			break;
		} // switch ����
		
		System.out.printf("������ %d �� �Դϴ�.", totalPrice);
		System.out.println("�����մϴ�");
		System.out.println("");
		System.out.println("========��������==========");
		System.out.printf("AƼ�� %s X %d %d ��   %s  \n",people,num, totalPrice, memo);
		System.out.println("========================");

			}
		
		}return;//��� ����ġ ����
		
		} // main ����
	
	}

	
