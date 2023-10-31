package PatternProgramming;

public class A {
	public static void main(String[] args) {

		//Pattern1
		//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//Pattern2
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//Pattern3
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int k=1;k<=4;k++) {
//			for(int l=4;l>=k;l--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//Pattern 4
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//			System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Pattern 5
		
//		for(int i=1;i<=5;i++) {
//			
//			for(int k=1;k<=i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=5;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Pattern 6
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int m=1;m<=5;m++) {
//			
//			for(int o=1;o<=m;o++) {
//				System.out.print(" ");
//			}
//			for(int n=5;n>=m;n--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		//Pattern 7
		
//		for(int i=1;i<=4;i++) {
//			
//			for(int k=4;k>=i;k--) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=(2*i)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		//Pattern 8
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			for(int l=1;l<=i;l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Pattern9
		
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=11-(2*i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
