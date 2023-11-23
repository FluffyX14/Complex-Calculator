public class GCF {
	public int getFractionGCF(int n, int d) {
		boolean found = false;
		int gcf;
		
		if (n < d) {
			gcf = n;
		}
		else {
			gcf = d;
		}
		while (found == false) {
			if (n % gcf == 0 && d % gcf == 0) {
				found = true;
			}
			else {
				gcf--;
			}
		}
		return gcf;
	}
}
