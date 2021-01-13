package com.naver.iii;

import java.util.ArrayList;

public class CollectionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		오라클 DB에 아래처럼 테이블이 있다고 가정한다. 
		 ------------------------------------------
		 s_no 	s_name	  kor	  eng
		 -------------------------------------
		 1		고현영 		80		90
		 2		한승우 		81		91
		 3		고동현 		82		92
		 -------------------------------------
*/
		//------------------------------------
		//[Student 객체]를 생성하고 객체의 메위주를 stu1에 저장하기
		//------------------------------------
		Student stu1 = new Student();
		//[Student 객체]의 setS_no 메소드를 호출하여 학생번호 1을 저장하기
		stu1.setS_no(1);
		//[Student 객체]의 setS_no 메소드를 호출하여 학생이름 "고현영"을 저장하기
		stu1.setS_name("고현영");
		//[Student 객체]의 setS_no 메소드를 호출하여 국어점수 80을 저장하기
		stu1.setKor(80);
		//[Student 객체]의 setS_no 메소드를 호출하여 영어점수 90을 저장하기
		stu1.setEng(90); 
		
		//------------------------------------
		//[Student 객체]를 생성하고 객체의 메위주를 stu2에 저장하기
		//------------------------------------
		Student stu2 = new Student();
		//[Student 객체]의 setS_no 메소드를 호출하여 학생번호 2을 저장하기
		stu1.setS_no(2);
		//[Student 객체]의 setS_no 메소드를 호출하여 학생이름 "한승우"을 저장하기
		stu1.setS_name("한승우");
		//[Student 객체]의 setS_no 메소드를 호출하여 국어점수 81을 저장하기
		stu1.setKor(81);
		//[Student 객체]의 setS_no 메소드를 호출하여 영어점수 91을 저장하기
		stu1.setEng(91);

		//------------------------------------
		//[Student 객체]를 생성하고 객체의 메위주를 stu3에 저장하기
		//------------------------------------
		Student stu3 = new Student();
		//[Student 객체]의 setS_no 메소드를 호출하여 학생번호 3을 저장하기
		stu1.setS_no(3);
		//[Student 객체]의 setS_no 메소드를 호출하여 학생이름 "고동현"을 저장하기
		stu1.setS_name("고동현");
		//[Student 객체]의 setS_no 메소드를 호출하여 국어점수 82을 저장하기
		stu1.setKor(82);
		//[Student 객체]의 setS_no 메소드를 호출하여 영어점수 92을 저장하기
		stu1.setEng(92); 		
		
		//------------------------------------
		// [ArrayList 객체] 생성하고 [ArrayList 객체]의 메위주를 list에 저장하기.
		// 제네릭스를 사용하여 Student 객체의 메위주만 저장하기로 설정함.
		//------------------------------------
		ArrayList<Student> list = new ArrayList<Student>();
		//------------------------------------
		// [ArrayList 객체]의 add 메소드를 호출하여 stu1 안의 Student 객체 메위주를 저장하기
		// [ArrayList 객체]의 add 메소드를 호출하여 stu2 안의 Student 객체 메위주를 저장하기
		// [ArrayList 객체]의 add 메소드를 호출하여 stu3 안의 Student 객체 메위주를 저장하기
		//------------------------------------
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		//------------------------------------
		// 반복문을 사용하여 ArrayList 객체 안의 i번째 Student 객체를 꺼낸 후
		// 그 Student 객체 안의 getS_no 메소드, getS_name 메소드, getKor 메소드,
		//		getEng 메소드를 호출하여 학생번호, 학생명, 국어점수, 영어점수를 얻어 도스창에 출력하기
		//------------------------------------
		for(int i=0; i<list.size(); i++) {
			//ArrayList 객체 안의 i번째 Student 객체 꺼내기
			Student stu = list.get(i);
			//꺼낸 Student 객체 안의 getS_no 메소드 호출해서 학생번호 꺼내 도스창에 출력하기
			System.out.println("[학생번호]:"+stu.getS_no());
			//꺼낸 Student 객체 안의 getS_no 메소드 호출해서 학생이름 꺼내 도스창에 출력하기
			System.out.println("[학생번호]:"+stu.getS_name());
			//꺼낸 Student 객체 안의 getS_no 메소드 호출해서 국어점수 꺼내 도스창에 출력하기
			System.out.println("[학생번호]:"+stu.getKor());
			//꺼낸 Student 객체 안의 getS_no 메소드 호출해서 영어점수 꺼내 도스창에 출력하기
			System.out.println("[학생번호]:"+stu.getEng());
			
		}
	}

}
