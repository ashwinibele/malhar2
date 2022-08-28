package date26nonstaticmethods;

public class sample1 {
// non static method call from same class
	public static void main(String[] args) {
	//classname.objectname=new class name();	
		//object name.method name();
		sample1 s1=new sample1();
		 s1.m2();
	     s1.m3();
	      s1.m3();        }
	 //non static regular method
          public void m2()
          {
System.out.println("non static regular methodm2");
          }
         // non static regular method
          public void m3()
          {
        System.out.println("non static regular methodm3");
          }
}


