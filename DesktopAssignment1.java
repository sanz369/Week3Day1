package week3.day1;

public class DesktopAssignment1 extends ComputerAssignment1 {

			
		public int desktopSize() {
			return 14;
		}
		
		
		public static void main(String[] args) {
			DesktopAssignment1 dt=new DesktopAssignment1();
			
			System.out.println(dt.computerModel());
			System.out.println(dt.desktopSize());
		}


			
}
