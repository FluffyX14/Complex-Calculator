public class Fraction implements Interface{
	
	//initializing variables
	private int num1;
	private int num2;
	private int den1;
	private int den2;
	GCF gcf = new GCF();
	
	public Fraction (String numerator1, String numerator2, String denominator1, String denominator2) {
		
		num1 = Integer.parseInt(numerator1.replaceAll(" ", ""));
		num2 = Integer.parseInt(numerator2.replaceAll(" ", ""));
		den1 = Integer.parseInt(denominator1.replaceAll(" ", ""));
		den2 = Integer.parseInt(denominator2.replaceAll(" ", ""));
		
		//gets common denominators
		num1 = num1 * den2;
		num2 = num2 * den1;
		den1 = den1 * den2;
	}

	@Override
	public String add(int num) {
		return String.valueOf((num1 + num2) / gcf.getFractionGCF(num1 + num2, den1)) + "/" + String.valueOf((den1 / gcf.getFractionGCF(num1 + num2, den1)));
	}

	@Override
	public String subtract(int num) {
		return String.valueOf((num1 - num2) / gcf.getFractionGCF(num1 - num2, den1)) + "/" + String.valueOf((den1 / gcf.getFractionGCF(num1 - num2, den1)));
	}

	@Override
	public String multiply(int num) {
		return String.valueOf((num1 * num2) / gcf.getFractionGCF(num1 * num2, den1 * den1)) + "/" + String.valueOf((den1 * den1 / gcf.getFractionGCF(num1 * num2, den1 * den1)));

	}

	@Override
	public String divide(int num) {
		return String.valueOf((num1 * den1) / gcf.getFractionGCF(num1 * den1, den1 * num2)) + "/" + String.valueOf((den1 * num2 / gcf.getFractionGCF(num1 * den1, den1 * num2)));

	}
	
}
