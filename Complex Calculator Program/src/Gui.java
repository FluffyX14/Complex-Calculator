import javax.swing.*;
import BreezySwing.*;
public class Gui extends GBFrame {
	
	//input boxes
	JTextField numerator1Input = addTextField ("Numerator", 1, 1, 1, 1);
	JTextField denominator1Input = addTextField ("Denominator", 1, 2, 1, 1);
	JTextField fractionOperatorInput = addTextField ("Operator", 1, 3, 1, 1);
	JTextField numerator2Input = addTextField ("Numerator", 1, 4, 1, 1);
	JTextField denominator2Input = addTextField ("Denominator", 1, 5, 1, 1);
	JButton calculateFractionButton = addButton("Calculate fractions", 2, 1, 1, 1);
	
	JTextField constant1Input = addTextField ("Constant", 3, 1, 1, 1);
	JTextField coefficient1Input = addTextField ("Coefficient of i", 3, 2, 1, 1);
	JTextField complexOperatorInput = addTextField ("Operator", 3, 3, 1, 1);
	JTextField constant2Input = addTextField ("Constant", 3, 4, 1, 1);
	JTextField coefficient2Input = addTextField ("Coefficient of i", 3, 5, 1, 1);
	JButton calculateComplexButton = addButton("Calculate complex numbers", 4, 1, 1, 1);
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == calculateFractionButton) {
			try {
				Fraction fraction = new Fraction(numerator1Input.getText(), numerator2Input.getText(), denominator1Input.getText(), denominator2Input.getText());
				if (fractionOperatorInput.getText().replaceAll(" ", "").equals("+")) {
					messageBox(numerator1Input.getText().replaceAll(" ", "") + "/" + denominator1Input.getText().replaceAll(" ", "") + " + " + numerator2Input.getText().replaceAll(" ", "") + "/" + denominator2Input.getText().replaceAll(" ", "") + " = " + fraction.add(1));
				}
				if (fractionOperatorInput.getText().replaceAll(" ", "").equals("-")) {
					messageBox(numerator1Input.getText().replaceAll(" ", "") + "/" + denominator1Input.getText().replaceAll(" ", "") + " - " + numerator2Input.getText().replaceAll(" ", "") + "/" + denominator2Input.getText().replaceAll(" ", "") + " = " + fraction.subtract(1));
				}
				if (fractionOperatorInput.getText().replaceAll(" ", "").equals("*")) {
					messageBox(numerator1Input.getText().replaceAll(" ", "") + "/" + denominator1Input.getText().replaceAll(" ", "") + " * " + numerator2Input.getText().replaceAll(" ", "") + "/" + denominator2Input.getText().replaceAll(" ", "") + " = " + fraction.multiply(1));
				}
				if (fractionOperatorInput.getText().replaceAll(" ", "").equals("/")) {
					messageBox(numerator1Input.getText().replaceAll(" ", "") + "/" + denominator1Input.getText().replaceAll(" ", "") + " / " + numerator2Input.getText().replaceAll(" ", "") + "/" + denominator2Input.getText().replaceAll(" ", "") + " = " + fraction.divide(1));
				}
				else {
					messageBox("Invalid operator");
				}
			}
			catch (Exception e) {
				messageBox("Invalid input");
			}
		}
		if (buttonObj == calculateComplexButton) {
			try {
				ComplexNumber complex = new ComplexNumber(constant1Input.getText(), coefficient1Input.getText(), constant2Input.getText(), coefficient2Input.getText());
				if (complexOperatorInput.getText().replaceAll(" ", "").equals("+")) {
					messageBox(complex.add(1));
				}
				if (complexOperatorInput.getText().replaceAll(" ", "").equals("-")) {
					messageBox(complex.subtract(1));
				}
				if (complexOperatorInput.getText().replaceAll(" ", "").equals("*")) {
					messageBox(complex.multiply(1));
				}
				if (complexOperatorInput.getText().replaceAll(" ", "").equals("/")) {
					messageBox(complex.divide(1));
				}
				else {
					messageBox("Invalid operator");
				}
			}
			catch (Exception e) {
				messageBox("Invalid input");
			}
		}
	}
	
	//outputs GUI
	public static void main(String[] args) {
		JFrame frm = new Gui();
		frm.setTitle("Complex Calculator");
		frm.setSize(800, 800);
		frm.setVisible(true);
	}
}