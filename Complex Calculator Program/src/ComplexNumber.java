public class ComplexNumber implements Interface{
	
	//initializing variables 
	private double a;
	private double b;
	private double c;
	private double d;
	
	public ComplexNumber (String con1, String coef1, String con2, String coef2) {
		a = Double.parseDouble(con1.replaceAll(" ", ""));
		b = Double.parseDouble(coef1.replaceAll(" ", ""));
		c = Double.parseDouble(con2.replaceAll(" ", ""));
		d = Double.parseDouble(coef2.replaceAll(" ", ""));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	@Override
	public String add(int num) {
		return String.valueOf(a+c) + " + " + String.valueOf(b+d) + "i";
	}

	@Override
	public String subtract(int num) {
		return String.valueOf(a-c) + " + " + String.valueOf(b-d) + "i";
	}

	@Override
	public String multiply(int num) {
		return String.valueOf(a * c - d * b) + " + " + String.valueOf(a * d + b * c) + "i";
	}

	@Override 	
	public String divide(int num) {
		return String.valueOf(a * c + d * b) + " + " + String.valueOf(b * c - a * d) + "i  /  " + String.valueOf(c * c + d * d);
	}
	
}
