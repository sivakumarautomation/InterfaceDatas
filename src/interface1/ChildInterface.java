package interface1;

public class ChildInterface implements  Interface_Type1 {

	@Override
	public void pannumber() {
		System.out.println("Pannumber is FHYPS");
		
	}

	@Override
	public void aadharnumber() {
		System.out.println("Aadhar number is 123456789");
		
	}
	
	public static void main(String[] args) { //main method//
		
		ChildInterface c = new ChildInterface();
		c.aadharnumber();
		c.pannumber();
		
	}

}
