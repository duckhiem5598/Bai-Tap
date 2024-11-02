package FileBaiTapNop;

import java.util.Scanner;

public class baiTap8 {
		// Hàm tìm số lớn nhất trong 3 số a,b,c 
		public static int max(int a, int b, int c) {
			int max = a;
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			return max;
		}
		
		// Hàm kiểm tra một số do người dùng nhập vào là số chẵn hay lẻ
		public static boolean isEven(int n) {
			if (n % 2 == 0) {
				return true;
			}
			return false;
		}
		
		// Viết hàm tính tổng 3 số do người dùng nhập vào
		public static int sum(int a, int b, int c) {
			return a+b+c;
		}
		
		// Hàm tính toán cộng, trừ, nhân chia 
		public static float arithmetic(float a, float b, int operator) {
			if (operator == 1) {
				return a + b;
			}
			else if (operator == 2) {
				return a - b;
			}
			else if (operator == 3) {
				return a * b;
			}
			else if (operator == 4) {
				return a / b;
			} 
			else {
				System.out.println("Không tồn tại phương thức này!");
				return 0;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Nhập 3 số a, b, c: ");
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			// Kiểm tra hàm tính tổng 3 số
			System.out.println("Số lớn nhất trong 3 số a, b, c vừa nhập là: " + max(a,b,c));
			
			// Kiểm tra hàm chẵn lẻ bằng số a
			if (isEven(a)) {
				System.out.println("Số a là số chẵn");
			} 
			else {
				System.out.println("Số a là số lẻ");
			}
			
			// Kiểm tra hàm tính tổng 
			System.out.println("Tổng 3 số a, b, c là: " + sum(a,b,c));
			
			// Kiểm tra hàm cộng trừ nhân chia
			System.out.println("Mời nhập phương thức (1 để cộng, 2 trừ, 3 nhân, 4 chia): " );
			int operator = sc.nextInt();
			System.out.println("Kết quả theo phương thức bạn vừa nhập là: " + arithmetic(a, b, operator));
			
			sc.close();
		}
	
}
