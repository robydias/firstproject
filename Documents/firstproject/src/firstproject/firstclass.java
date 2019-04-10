package firstproject;

public class firstclass {

	public static void main(String[] args) {
		Method refvar=new Method();
		refvar.nsmv(1,2);
		Method.nsmv();
		refvar.smv(1,2);
		Method.smv(1,2);
		refvar.nsmr(1,2);
		System.out.println("return is "+refvar.nsmr(1,2));
		System.out.println("return is "+MEthod.nsmr());
		refvar.smr(1,2);
		Method.smr(1,2);
		System.out.println("return is "+refvar.smr(1,2));
		System.out.println("return is "+Method.smr(1,2));
	Day.ref(31);
	Month.ref(11);
	year.ref(123);
	
	}
	}