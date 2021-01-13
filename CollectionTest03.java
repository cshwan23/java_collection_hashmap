package com.naver.iii;

import java.util.ArrayList;
import java.util.HashMap;

class Family{
	private int emp_no;
	private String relation;
	private String f_name;
	private int birth_year;
	public int getEmp_no() {
		return emp_no;
	}
	public String getRelation() {
		return relation;
	}
	public String getF_name() {
		return f_name;
	}
	public int getBirth_year() {
		return birth_year;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}
	
}
class Employee{
	private int emp_no;
	private String emp_name;
	private String jikup;
	private ArrayList<Family> family;  // employee 객체 안에 어레이 객체가 들어감
	
	public int getEmp_no() {
		return emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getJikup() {
		return jikup;
	}
	public ArrayList<Family> getFamily() {
		return family;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setJikup(String jikup) {
		this.jikup = jikup;
	}
	public void setFamily(ArrayList<Family> family) {
		this.family = family;
	}
	
}
public class CollectionTest03 {

	public static void main(String[] args) {
		
/*
--------------------------------------------------------
<문> 아래 2개의 테이블에 직원정보가 들어있다.
	2개의 테이블에 저장된 데이터를 자바의 객체 안에 저장하고 꺼내서 출력하면? 
--------------------------------------------------------

employee
--------------------------------------------------------
emp_no		emp_name		jikup
--------------------------------------------------------
1			황보민 			사장 
2			박인선 			전무 
3			차승윤 			상무 
--------------------------------------------------------

family
--------------------------------------------------------
emp_no		relation	f_name  	birth_year 
--------------------------------------------------------
1			배우자 		설현			1990  
2			부	 		박찬호 		1973  
2			모 			박세리		1977
3			배우자		신혜선		1989
3			자			차예린		2021 
--------------------------------------------------------


 */
		Family family1 = new Family();
		family1.setEmp_no(1);
		family1.setRelation("배우자");
		family1.setF_name("설현");
		family1.setBirth_year(1990);

		Family family2 = new Family();
		family2.setEmp_no(2);
		family2.setRelation("부");
		family2.setF_name("박찬호");
		family2.setBirth_year(1973);
		

		Family family3 = new Family();
		family3.setEmp_no(2);
		family3.setRelation("모");
		family3.setF_name("박세리");
		family3.setBirth_year(1977);
		

		Family family4 = new Family();
		family4.setEmp_no(3);
		family4.setRelation("배우자");
		family4.setF_name("신혜선");
		family4.setBirth_year(1993);
		

		Family family5 = new Family();
		family5.setEmp_no(3);
		family5.setRelation("자");
		family5.setF_name("차예린");
		family5.setBirth_year(2021);
		//--------------------------------------------------------
		ArrayList<Family> listFamily1 = new ArrayList<Family>();
		listFamily1.add(family1);
		
		Employee emp1 = new Employee();
		emp1.setEmp_no(1);
		emp1.setEmp_name("황보민");
		emp1.setJikup("사장");
		emp1.setFamily(listFamily1);
		//--------------------------------------------------------
		ArrayList<Family> listFamily2 = new ArrayList<Family>();
		listFamily2.add(family2);
		listFamily2.add(family3);
		
		Employee emp2 = new Employee();
		emp2.setEmp_no(2);
		emp2.setEmp_name("박인선");
		emp2.setJikup("전무");
		emp2.setFamily(listFamily2);
		//--------------------------------------------------------
		ArrayList<Family> listFamily3 = new ArrayList<Family>();
		listFamily2.add(family4);
		listFamily2.add(family5);
		
		Employee emp3 = new Employee();
		emp3.setEmp_no(3);
		emp3.setEmp_name("차승윤");
		emp3.setJikup("상무");
		emp3.setFamily( listFamily3 );
		//--------------------------------------------------------
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
	}
	

}
