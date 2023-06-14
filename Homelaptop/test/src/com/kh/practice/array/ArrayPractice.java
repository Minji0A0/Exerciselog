package com.kh.practice.array;

import java.awt.Container;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.annotation.processing.Generated;

public class ArrayPractice {

	private static Scanner sc = new Scanner(System.in);

	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10
		// 2부터 짝수값을로 채워줏요
		System.out.println("■■■배열 실습 1■■■");

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public void practice2() {
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//	ex.
//	10 9 8 7 6 5 4 3 2 1
		System.out.println("■■■배열 실습 2■■■");

		int[] arr = new int[10];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = 10 - j;
			System.out.print(arr[j] + " ");
		}
		System.out.println(" ");

	}

	public void practice3() {
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//	ex.
//	양의 정수 : 5
//	1 2 3 4 5
		System.out.println("■■■배열 실습 3■■■");
		System.out.print("양의 정수 : ");
		int num3a = sc.nextInt();

		int[] arr = new int[num3a];
		for (int k = 0; k < arr.length; k++) {
			arr[k] = k + 1;
			System.out.print(arr[k] + " ");
		}
		System.out.println(" ");

	}

	public void practice4() {
//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//	배열 인덱스를 활용해서 귤을 출력하세요.
//	ex.
//	귤
		System.out.println("■■■배열 실습 4■■■");

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println("과일의 숫자를 입력해주세요 : ");
		int num4a = sc.nextInt();

		System.out.println(arr[num4a]);

	}

	public void practice5() {
//	 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//	 ex.
//	 문자열 : application
//	 문자 : i
//	 application에 i가 존재하는 위치(인덱스) : 4 8 
//	 i 개수 : 2
		System.out.println("■■■배열 실습 5■■■");

		System.out.print("문자열 : ");
		String munja5a = sc.next();
		System.out.print("문자 : ");
		char munja5b = sc.next().charAt(0);

		int count = 0;

		System.out.println(munja5a + "가 존재하는 위치(인덱스) :");
		for (int i = 0; i < munja5a.length(); i++) {
			if (munja5a.charAt(i) == munja5b) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("");
		System.out.println(munja5b + "개수 : " + count);
	}

	public void practice6() {
//	 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//	 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//	 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//	 ex.
//	 0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
//	 금요일 잘못 입력하셨습니다.
		System.out.println("■■■배열 실습 6■■■");

		String[] mon = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0~6 사이 숫자 입력 : ");
		int num6a = sc.nextInt();

		while (true) {
			if (num6a < 0 || num6a > 6) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("0~6 사이 숫자 입력 : ");
				num6a = sc.nextInt();
			} else {
				System.out.println(mon[num6a] + "요일");
				break;

			}
		}
	}

	public void practice7() {
//	 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//	 ex.
//	 정수 : 5
//	 배열 0번째 인덱스에 넣을 값 : 4
//	 배열 1번째 인덱스에 넣을 값 : -4
//	 배열 2번째 인덱스에 넣을 값 : 3
//	 배열 3번째 인덱스에 넣을 값 : -3
//	 배열 4번째 인덱스에 넣을 값 : 2
//	 4 -4 3 -3 2 
//	 총 합 : 2
		System.out.println("■■■배열 실습 7■■■");

		System.out.print("정수 : ");
		int num7a = sc.nextInt();

		int[] num7b = new int[num7a];

		for (int i = 0; i < num7a; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			num7b[i] = sc.nextInt();
		}
		System.out.print("배열 : ");
		for (int i = 0; i < num7a; i++) {
			System.out.print(num7b[i] + " ");
		}
		int sum = 0;

		for (int i = 0; i < num7a; i++) {
			sum += num7b[i];
		}
		System.out.println("\n총합 : " + sum);
	}

	public void practice8() {
//	 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	 다시 정수를 받도록 하세요.
//	 ex.
//	 정수 : 4
//	 다시 입력하세요.
//	 정수 : -6
//	 다시 입력하세요.
//	 정수 : 5
//	 1, 2, 3, 2, 1
		System.out.println("■■■배열 실습 8■■■");

	}

	public void practice9() {
//	 사용자가 입력한 값이 배열에 있는지 검색하여
//	 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//	 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//	 ex.
//	 치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//	 양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.

		System.out.println("■■■배열 실습 9■■■");

		String[] chicken9a = { "양념", "불닭", "간장", "후라이드", "소금", "머쉬룸", "허니콤보", "윙봉" };

		System.out.println("치킨의 이름을 입력하세요 : ");
		String name9a = sc.next();

		boolean menu = false;

		while (!menu) {
			for (String chicken9b : chicken9a) {
				if (chicken9b.equals(name9a)) {
					menu = true;
					break;
				}
			}
			if (!menu) {
				System.out.println(name9a + "치킨은 없는 메뉴입니다.");
				System.out.println("치킨의 이름을 입력하세요 : ");
				name9a = sc.next();
			} else if (menu) {
				System.out.println(name9a + "치킨은 배달 가능합니다.");
			}
		}

	}

	public void practice10() {
//	 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//	 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//	 ex.
//	 주민등록번호(-포함) : 123456-1234567
//	 123456-1******
		System.out.println("■■■배열 실습 10■■■");

		System.out.print("주민등록번호 (-포함) 입력: ");
		String socialnumber10a = sc.nextLine();

		char[] socialnumber10aArray = socialnumber10a.toCharArray();
		char[] maskedArray = socialnumber10aArray.clone();

		for (int i = 7; i < maskedArray.length; i++) {
			maskedArray[i] = '*';
		}
		String socialnumber10b = new String(maskedArray);
		System.out.println(socialnumber10b);
	}

	public void practice11() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//	ex.
//	9 7 6 2 5 10 7 2 9 6
		System.out.println("■■■배열 실습 11■■■");

		int[] arr11 = new int[10];
		Random random = new Random();

		for (int i = 0; i < arr11.length; i++) {
			arr11[i] = random.nextInt(10) + 1;
		}
		for (int num11 : arr11) {
			System.out.print(num11 + " ");
		}
		System.out.println(" ");

	}

	public void practice12() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		// ex.
		// 5 3 2 7 4 8 6 10 9 10
		// 최대값 : 10
		// 최소값 : 2
		System.out.println("■■■배열 실습 12■■■");

//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		int[] arr12 = new int[10];
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
		Random random = new Random();

		for (int i = 0; i < arr12.length; i++) {
			arr12[i] = random.nextInt(10) + 1;
		}

		for (int num12 : arr12) {
			System.out.print(num12 + " ");
		}
		System.out.println(" ");

//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		int max = arr12[0];
		int min = arr12[0];

		for (int i = 1; i < arr12.length; i++) {
			if (arr12[i] > max) {
				max = arr12[i];
			}
			if (arr12[i] < min) {
				min = arr12[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	public void practice13() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//	ex.
//	4 1 3 6 9 5 8 10 7 2 

		System.out.println("■■■배열 실습 13■■■");

		int[] arr13 = new int[10];
		Random random = new Random();
		Set<Integer> num13b = new HashSet<>();

		for (int i = 0; i < arr13.length; i++) {
			int num13;
			do {
				num13 = random.nextInt(10) + 1;
			} while (num13b.contains(num13));

			arr13[i] = num13;
			num13b.add(num13);
		}

		for (int num13 : arr13) {
			System.out.print(num13 + " ");
		}

		System.out.println(" ");
	}

	public void practice14() {
//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//	ex.
//	3 4 15 17 28 40
		System.out.println("■■■배열 실습 14■■■");
		System.out.println("●●●●● 로또 번호 자동 생성기 ●●●●●");

		int[] arr14 = new int[6];
		Random random = new Random();
		Set<Integer> lottonum14a = new HashSet<>(); // 중복제거

		for (int i = 0; i < arr14.length; i++) {
			int lottonum14b;
			do {
				arr14[i] = random.nextInt(45) + 1;
			} while (contains(arr14, i, lottonum14a));

			lottonum14b = arr14[i];
		}
		Arrays.sort(arr14);
		for (int lottonum14b : arr14) {
			lottonum14a.add(lottonum14b);
			System.out.print(lottonum14b + " ");
		}

		System.out.println(" ");
	}

	private boolean contains(int[] arr14, int lottonum14a, Set<Integer> set) {
		for (int i = 0; i < lottonum14a; i++) {
			if (arr14[i] == arr14[lottonum14a] || set.contains(arr14[lottonum14a])) {
				return true;
			}
		}
		return false;
	}

	public void practice15() {
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.
//	ex.
//	문자열 : application
//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
//	문자 개수 : 8
		System.out.println("■■■배열 실습 15■■■");
		System.out.print("문자열 : ");
		String munja15a = sc.next();
		Set<Character> char15a = new HashSet<Character>();

		for (int i = 0; i < munja15a.length(); i++) {
			char15a.add(munja15a.charAt(i));
		}
		System.out.print("문자열에 있는 문자 : ");
		for (char ch : char15a) {
			System.out.print(ch + ", ");
		}
		System.out.println("\n문자 개수 : " + char15a.size());
	}


	public void practice16() {
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요
//		ex.
//		배열의 크기를 입력하세요 : 3
//		1번째 문자열 : 자바의 정석
//		2번째 문자열 : 알고리즘
//		3번째 문자열 : C프로그래밍
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 2
//		4번째 문자열 : 인간관계
//		5번째 문자열 : 자기계발
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 1
//		6번째 문자열 : 영단어600
//		더 값을 입력하시겠습니까?(Y/N) : n
//		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]

		System.out.println("■■■배열 실습 16■■■");

	}

}
