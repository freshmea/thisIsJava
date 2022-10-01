package exam04;

public class ForNultiplicationTableExample {
	public static void main(String[] argc) {
		for(int i=2;i<10;i++) {
			System.out.println("*** "+ i + "단 ***");
			for(int n=1;n<10;n++) {
				System.out.println(i+" X "+n+" = "+i*n);
				
			}
		}
	}
}
