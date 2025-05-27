
package basics;

public class loops {

	public static void main(String[] args) {
	int k=15;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4-i;j++) {
				k--;
				System.out.print(k+ "\t");
			}
			System.out.println();
		}
	}
	
}
