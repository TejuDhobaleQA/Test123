package practice;

public class This {
	
	
	public static void main(String[] args) {
		
		int space1=4;
		int space2=0;
		int star=0;
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=space1;b++) {
				System.out.print("-");
			}
			System.out.print("*");
			for(int d=1;d<=space2;d++) {
				System.out.print("-");
			}
			for(int c=1;c<=star;c++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(1>=a) {
				star++;
				space1--;
			}
			else {
				space1--;
				space2++;
				
			}
		}
	}
}
