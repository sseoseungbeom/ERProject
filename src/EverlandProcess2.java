package EverlandProject3;



	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.Scanner;



	
	public class EverlandProcess {
		public int todayYear, todayDate, birthYear, birthMonth, birthDay, birthDate, putDate, Prior, manAge;
		public int Count = 0, Price = 0, addOrder = 0;
		public String ticketType, registNumber, age = null, b = "";
		public String isEventCoupon = " ";
		
		public String pattern1 = "yyyyMMdd";
		public SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
		public String today = simpleDateFormat.format(new Date());
		public int couponOk, couponNum;

		public void whatToday() {

		System.out.println(today);
		todayYear = Integer.parseInt(today.substring(0,4));
	    todayDate = Integer.parseInt(today.substring(4,8));
	      Scanner myInput = new Scanner(System.in) ;

		}

		public void inputDate() {

			 System.out.println("--------------------------------------");
			 System.out.println("----�������� Ƽ�� ����â���Դϴ�.---");
			  System.out.println("�̿볯¥�� �Է����ּ���.	 ex) 20210916 ");
			  System.out.print(" ");
			  Scanner myInput1 = new Scanner(System.in);
			  putDate = myInput1.nextInt();


		   if(putDate == 20210904 || putDate == 20210905 || putDate == 20210911 || putDate == 20210912 ||
		      putDate == 20210918 || putDate == 20210919 || putDate == 20210920 || putDate == 20210921 ||
		      putDate == 20210922 || putDate == 20210925 || putDate == 20210926 || putDate == 20211002 ||
			  putDate == 20211003 || putDate == 20211009 || putDate == 20211010 || putDate == 20211016 || 
			  putDate == 20211017 || putDate == 20211023 || putDate == 20211024 || putDate == 20211030 ||
			  putDate == 20211031 || putDate == 20211106 || putDate == 20211107) {
			  ticketType = "A Ƽ��" ;

		   }else if(putDate == 20210703 || putDate == 20210704 || putDate == 20210710 || putDate == 20210711 || putDate == 20210717 
				 || putDate == 20210718 || putDate == 20210724 || putDate == 20210725 || putDate == 20210729 || putDate == 20210730 
				 || putDate == 20210731 || putDate == 20210801 || putDate == 20210802 || putDate == 20210803 || putDate == 20210807 
				 || putDate == 20210808 || putDate == 20210814 || putDate == 20210815 || putDate == 20210821 || putDate == 20210822 
				 || putDate == 20210828 || putDate == 20210829 || putDate == 20210903 || putDate == 20210906 || putDate == 20210907 
				 || putDate == 20210908 || putDate == 20210909 || putDate == 20210910 || putDate == 20210913 || putDate == 20210914 
				 || putDate == 20210915 || putDate == 20210916 || putDate == 20210917 || putDate == 20210923 || putDate == 20210924 
				 || putDate == 20210927 || putDate == 20210928 || putDate == 20210929 || putDate == 20210930 || putDate == 20211001 
				 || putDate == 20211004 || putDate == 20211005 || putDate == 20211006 || putDate == 20211007 || putDate == 20211008 
				 || putDate == 20211011 || putDate == 20211012 || putDate == 20211013 || putDate == 20211014 || putDate == 20211015 
				 || putDate == 20211018 || putDate == 20211019 || putDate == 20211020 || putDate == 20211021 || putDate == 20211022
				 || putDate == 20211025 || putDate == 20211026 || putDate == 20211027 || putDate == 20211028 || putDate == 20211029 
				 || putDate == 20211101 || putDate == 20211102 || putDate == 20211103 || putDate == 20211104 || putDate == 20211105 
				 || putDate == 20211108 || putDate == 20211109 || putDate == 20211110 || putDate == 20211111 || putDate == 20211112 
				 || putDate == 20211113 || putDate == 20211114 || putDate == 20211120 || putDate == 20211121 || putDate == 20211127 
				 || putDate == 20211128) {
			     ticketType = "B Ƽ��";

		   }else if(putDate == 20210628 || putDate == 20210629 || putDate == 20210630 || putDate == 20210701 || putDate == 20210702
				 || putDate == 20210705 || putDate == 20210706 || putDate == 20210707 || putDate == 20210708 || putDate == 20210709
				 || putDate == 20210712 || putDate == 20210713 || putDate == 20210714 || putDate == 20210715 || putDate == 20210716
				 || putDate == 20210719 || putDate == 20210720 || putDate == 20210721 || putDate == 20210722 || putDate == 20210723
				 || putDate == 20210726 || putDate == 20210727 || putDate == 20210728 || putDate == 20210804 || putDate == 20210805
				 || putDate == 20210806 || putDate == 20210809 || putDate == 20210810 || putDate == 20210811 || putDate == 20210812
				 || putDate == 20210813 || putDate == 20210816 || putDate == 20210817 || putDate == 20210818 || putDate == 20210819
				 || putDate == 20210820 || putDate == 20210823 || putDate == 20210824 || putDate == 20210825 || putDate == 20210826
				 || putDate == 20210827 || putDate == 20210830 || putDate == 20210831 || putDate == 20210901 || putDate == 20210902
				 || putDate == 20211115 || putDate == 20211116 || putDate == 20211117 || putDate == 20211118 || putDate == 20211119
				 || putDate == 20211122 || putDate == 20211123 || putDate == 20211124 || putDate == 20211125 || putDate == 20211126
				 || putDate == 20211129 || putDate == 20211130) {  
			     ticketType = "C Ƽ��";

		   }
		}

		public void Pricetag() {
			  if(ticketType == "A Ƽ��") {
					Price = 60000;
				} else if(ticketType == "B Ƽ��") {
					Price = 56000;
				} else {
					Price = 50000;
				}

		}

		public void putID() {
			while(true) {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� 920620)\n");
				System.out.print(" ");
				Scanner myInput2 = new Scanner(System.in);
				registNumber = myInput2.nextLine();
				if(registNumber.equals("0")) {
					break;
				} else if(registNumber.length() != 6) {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				} else if(registNumber.length() == 6) {
					birthMonth = Integer.parseInt(registNumber.substring(2,4));
					birthDay = Integer.parseInt(registNumber.substring(4,6));
					if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)  ) {	
						break;
					} else {
						System.out.println("�ٽ� �Է��� �ּ���.");
						continue;
					}					
				} else {
					break;
				}
			}

			}

		public void howBirth() {

			birthYear = Integer.parseInt(registNumber.substring(0,2));
			birthDate = Integer.parseInt(registNumber.substring(2,6));

			if(0 <= birthYear && birthYear <= 30) {
				birthYear += 2000;
			} else {
				birthYear += 1900;
			}
			manAge = todayYear - birthYear;
			if(todayDate < birthDate) {
				manAge = manAge - 1;
			} else {
				manAge = manAge + 0;
			}

			System.out.printf("�� %d\n", manAge);

			if((19 <= manAge) && (manAge <= 64 ))  {
				age = "�";	
			} else if(65 <= manAge) {
				age = "���";
			} else if((3 <= manAge) && (manAge <= 12 )) {
				age = "���";
				if(ticketType == "A Ƽ��") {
					Price = 48000;
				} else if(ticketType == "B Ƽ��") {
					Price = 44000;
				} else {
					Price = 40000;
				}
			} else if(manAge < 3) {
				age = "36�����̸�";
				Price = 0;
			} else {
				age = "û�ҳ�";
			}

			System.out.println("��");
		}

		public void howOrder() {

			while(true) {
				System.out.println("��� �ֹ��Ͻðڽ��ϱ�?");
				System.out.print(": ");
				Scanner myInput3 = new Scanner(System.in);
				Count = myInput3.nextInt();
					break;

			}

			if(Count == 0) {
				return;
			}


			System.out.println("��");

		}

		public void choosePrior() {
			while(true) {
				System.out.println("�������� �����ϼ���.(0 ������ ó������)");
				System.out.println("1. ���� (���� ���� �ڵ�ó��)");
				System.out.println("2. �����");
				System.out.println("3. ����������");
				System.out.println("4. ���ڳ�");
				System.out.println("5. �ӻ��");
				System.out.print(": ");
				Scanner myInput4 = new Scanner(System.in);
				Prior = myInput4.nextInt();
				if(0 <= Prior && Prior <=5 ) {
					break;
				} else {
					System.out.println("�ٽ� �Է��� �ּ���.");
					continue;
				}
			}



			switch(Prior) {
			case 1: b = "������� ����"; break;
			case 2: b = "����� �������"; 
			if(ticketType == "A Ƽ��") {
				if(age == "�") {
					Price = 36000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 28000;}
			} else if(ticketType == "B Ƽ��") {
				if(age == "�") {
					Price = 33000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 26000;}
			} else {
				if(age == "�") {
					Price = 30000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 24000;}
			} break;
			case 3: b = "���������� �������"; 
			if(ticketType == "A Ƽ��") {
				if(age == "�") {
					Price = 30000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 24000;}
			} else if(ticketType == "B Ƽ��") {
				if(age == "�") {
					Price = 28000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 22000;}
			} else {
				if(age == "�") {
					Price = 25000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 20000;}
			} break;
			case 4: b = "���ڳ� �������"; 
			if(ticketType == "A Ƽ��") {
				if(age == "�" || age == "û�ҳ�") {
					Price = 48000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 38000;}
			} else if(ticketType == "B Ƽ��") {
				if(age == "�" || age == "û�ҳ�") {
					Price = 44000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 35000;}
			} else {
				if(age == "�" || age == "û�ҳ�") {
					Price = 40000;
				} else if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 32000;}
			} break;
			case 5: b = "�ӻ�� �������"; 
			if(ticketType == "A Ƽ��") {
				if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 51000;}
			} else if(ticketType == "B Ƽ��") {
				if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 47000;}
			} else {
				if(age == "36�����̸�") {
					Price = 0;
				} else {Price = 42000;}
			} break;

			}




		}

		public void moreOrNot() {
			System.out.print("1. �߰�����, 2. ��������");
			Scanner sc = new Scanner(System.in);
			addOrder = sc.nextInt();
		}

		
		public void isEventCoupon() {
			System.out.print("1. ���������Ű���? \n, 2. �����Ű���?");
			Scanner sc = new Scanner(System.in);
			couponOk = sc.nextInt();
			
		if(couponOk ==1) {
			System.out.print("� ������ �����̽Ű���?  \n");
			System.out.println("1. VIP 50% ����");
			System.out.println("2. �� 30%���� ����");
			couponNum= sc.nextInt();

			if(couponNum ==1) {
				Price = (int) (Price * 0.5);	
				b= "�������� 50%";
			}
			if(couponNum ==2) {
				Price = (int) (Price *0.7);
				b= "�������� 30%";
			}
		}//if����
		
			
		}


		}
