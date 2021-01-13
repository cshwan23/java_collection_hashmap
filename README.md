# java_collection_hashmap
hashmap 객체

        package com.naver.iii;

        import java.util.ArrayList;
        import java.util.HashMap;

        public class CollectionTest01 {

          public static void main(String[] args) {

        /*
         ------------------------------------------
         오라클에 있는 데이터 자바로 끌어오고싶다.
         ------------------------------------------
         오라클 DB에 아래처럼 테이블이 있다고 가정한다.
         ------------------------------------------
         s_no 	s_name	  kor	  eng
         -------------------------------------
         1		고현영 		80		90
         2		한승우 		81		91
         3		고동현 		82		92
         4		김다유 		83		94  
        */

         //--------------------------------------
         // [HashMap 객체] 생성하고 객체의 메위주를 map1에 저장하기
         // HashMap<String,String> => 키값은 String, 저장객체는 String으로만 하겠다.
         //--------------------------------------
         HashMap<String,String> map1 = new HashMap<String,String>();
         //--------------------------------------
         // [HashMap 객체]의 put 메소드를 호출하여 키값-저장객체를 저장하기
         // 결국 키값은 오라클 DB의 테이블에서 컬럼명이 되고 저장객체는 테이블에 저장되는 테이터하고 매칭된다.
         // [HashMap 객체] 는 오라클의 한행을 저장하는 것 이다.
         //--------------------------------------
         map1.put("s_no", "1");
         map1.put("s_name", "고현영");
         map1.put("kor", "80");
         map1.put("eng", "90");

         //--------------------------------------
         // [HashMap 객체] 생성하고 객체의 메위주를 map2에 저장하기
         //--------------------------------------
         HashMap<String,String> map2 = new HashMap<String,String>();
         //--------------------------------------
         // [HashMap 객체]의 put 메소드를 호출하여 키값-저장객체를 저장하기
         // 결국 키값은 오라클 DB의 테이블에서 컬럼명이 되고 저장객체는 테이블에 저장되는 테이터하고 매칭된다.
         // [HashMap 객체] 는 오라클의 한행을 저장하는 것 이다.
         //--------------------------------------
         map2.put("s_no", "2");
         map2.put("s_name", "한승우");
         map2.put("kor", "81");
         map2.put("eng", "91");

         //--------------------------------------
         // [HashMap 객체] 생성하고 객체의 메위주를 map3에 저장하기
         //--------------------------------------
         HashMap<String,String> map3 = new HashMap<String,String>();
         //--------------------------------------
         // [HashMap 객체]의 put 메소드를 호출하여 키값-저장객체를 저장하기
         // 결국 키값은 오라클 DB의 테이블에서 컬럼명이 되고 저장객체는 테이블에 저장되는 테이터하고 매칭된다.
         // [HashMap 객체] 는 오라클의 한행을 저장하는 것 이다.
         //--------------------------------------
         map3.put("s_no", "3");
         map3.put("s_name", "고동현");
         map3.put("kor", "82");
         map3.put("eng", "92");

         //--------------------------------------
         // [ArrayList 객체] 생성하고 [ArrayList 객체]의 메위주를 list 에 저장하기
         // ArrayList<HashMap> => ArrayList 객체에 HashMap만 저장하겠다. 
         //--------------------------------------
         ArrayList<HashMap> list = new ArrayList<HashMap>();
         //--------------------------------------
         // [ArrayList 객체]의 add 메소드를 호출하여 map1안의 HashMap 객체 메위주 를 저장하기
         //--------------------------------------
         list.add(map1);
         //--------------------------------------
         // [ArrayList 객체]의 add 메소드를 호출하여 map2안의 HashMap 객체 메위주 를 저장하기
         //--------------------------------------
         list.add(map2);
         //--------------------------------------
         // [ArrayList 객체]의 add 메소드를 호출하여 map3안의 HashMap 객체 메위주 를 저장하기
         //--------------------------------------
         list.add(map3);

         //-------------------------------------
         // 반복문을 사용하여 ArrayList 객체 안의 i번째 HashMap객체를 꺼낸 후
         // 그 HashMap 객체 안의 데이터를 꺼내어 도스 창에 출력하기
         //-------------------------------------
         for(int i=0; i<list.size(); i++) {
         //i번째에 저장된 HashMap 객체를 꺼내어 변수 map에 저장하기 
         // 꺼낼 때 ArrayList 객체의 get 이라는 메소드를 사용한다.
         HashMap map = list.get(i);

         //꺼낸 HashMap 객체에서 키값에 해당하는 데이터를 꺼내어 도스창에 출력하기
         //키값에 해당하는 데이터를 꺼내기 위해 get("키값명")메소드가 호출된다. 
         System.out.println("[학생번호]:"+map.get("s_no"));
         System.out.println("[학생이름]:"+map.get("s_name"));
         System.out.println("[국어점수]:"+map.get("kor"));
         System.out.println("[영어점수]:"+map.get("eng")+"\n");
         }

         HashMap xxx = new HashMap();
        // xxx.put("s_no", new Integer(1));
         xxx.put("s_no", 1); //1이 Integer 객체로 바뀜 오토박싱(auto boxing)

         Integer yyy = 10;  // 10 Integer 객체로 바뀜. 오토 박싱(auto boxing) 
         int zzz = yyy;		// Integer 객체가 10으로 바뀜. 오토 언박싱(auto unboxing)
        }

        }
        /*
         ----------------------------------------
         <문1>HashMap 객체의 특징?
         ----------------------------------------
          <1> 다량, 다종의 객체 메위주를 저장하고 꺼낼수있는 기능을 가지고 있다.
            그러나 실무적으로는 같은 종류의 객체만 저장한다.
            왜? 꺼낼 때 자료형이 다르면 형변환이 거의 불가능하기 떄문이다.
          ----------------------------------------	
          <2> <주의>기본형 데이터는 저장이 불가능하다.
              기본형을 굳이 저장하고 싶다면 기본형을 관리하는 
              객체를 생성하여 그 객체를 저장한다.
              그러나 기본형을 저장하면 에러가 발생하지않고
              기본형이 기본형을 관리하는 객체로 자동 형변환이 된다.
              기본형이 기본형을 관리하는 객체로 자동 형변환이 되는 것을 
              오토박싱(auto boxing)이라고 한다.
              ----------------------------------------
              <예> 1이 new Integer(1) 로 자동형 변환되는 경우 오토 박싱
              <예> new Integer(1)이 1로 자동형 변환되는 경우 오토 언박싱
              ----------------------------------------
               HashMap xxx = new HashMap();

              xxx.put("s_no", 1);//1이 Integer 객체로 바뀜 오토박싱(auto boxing)
              Integer yyy = 10;  // 10 Integer 객체로 바뀜. 오토 박싱(auto boxing) 
              int zzz = yyy;	   // Integer 객체가 10으로 바뀜. 오토 언박싱(auto unboxing)
        ----------------------------------------
              기본형을 관리하는 객체의 종류는 아래와 같다.
              Boolean
              Byte
              Character
              Short
              Long
              Float
              Double
          ----------------------------------------		
          <3> 저장 시 저장 순서가 일정하지 않다. 즉 저장 순서를 알 수 없다.(=무순서)
            index 번호를 사용하여 꺼낼수없다.
          ----------------------------------------
          <4> 저장된 데이터를 꺼낼 때 키값을 사용한다.(=캐리어 맡긴거 찾을때 인식표로 찾듯이)
              즉 키값은 저장된 객체를 꺼내기 위해 붙인다.
          ----------------------------------------    
          <5> 웹 개발시 HashMap 객체는 오라클 테이블 안의 n행 n열의 데이터를 자바영역으로
              가져올 경우 한 행의 데이터를 저장할 때 많이 사용한다.
              웹 개발시 키값-저장객체메위주 는 아래 형태로 많이 사용된다.
                "컬럼명"-"오라클테이블의데이터"
          ----------------------------------------   		
          <주의>오라클 한 행의 데이터를 HashMap 객체에 저장 시 저장 객체는
             String 형으로 통일하여 저장하므로 오라클에 있는 자료형을 그대로
             가져올 수 없다. 즉 오라클 자료형을 살릴수가 없다. 
          ----------------------------------------

        +++++++++++++++++++++++++++++++++++++++
        <문2> ArrayList 객체의 특징? 
        +++++++++++++++++++++++++++++++++++++++
        <1> 다량, 다종의 객체 메위주를 저장하고 꺼낼 수 있는 기능을 가지고 있다.
            그러나 실무적으로는 같은 종류의 객체만 저장한다.
            왜? 꺼낼 때 자료형이 다르면 형변환이 어럽기 때문이다.
            ------------------------------------------
        <2> <주의>기본형 데이터는 저장이 불가능하다.
          기본형을 굳이 저장하고 싶다면 기본형을 관리하는	
          객체를 생성하여 그 객체를 저장한다.
          ------------------------------------------
        <3> 저장 시 저장 순서를 유지한다. 즉 저장 순서를 알 수 있다.(순차적 저장)
          ------------------------------------------
        <4> 저장된 데이터를 꺼낼때 인덱스번호(0부터시작하는번호)를 사용한다.
          HashMap 객체처럼 키값이 필요가 없다.
          ------------------------------------------
        <5> 웹 개발시 각행은 HashMap 객체에 저장하고 다량의 HashMap 객체는 
          1개의 ArrayList 객체에 저장한다. 
          웹 개발시 ArrayList 객체는 오라클 안의 n행 n열의 데이터를 자바영역으로
          가져올 경우 n행의 데이터를 저장한 다량의 HashMap 객체들을 저장할 때 사용한다.
          ------------------------------------------


         */


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






