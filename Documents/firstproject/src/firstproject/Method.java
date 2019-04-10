package firstproject;

public class Method {
	//non static method void
 public void nsmv(int a, int b) {
	 int c = a+b;
	System.out.println("this is not static method void ");
}
 //static method viod 
 public static void smv(int a, int b){
	 int c = a+b;
	 System.out.println("this is static method void");
	  }
 //non static method with return  type 
 public int nsmr(int a, int b) {
	 int c = a+b;
	 System.out.println("this is not static method with return type ");
	 return c;
 }
 // static method with return type 
 public static int smr(int a, int b) {
	 int c = a+b;
	 System.out.println("this is static method with return type");
	 return c;
 }
}
