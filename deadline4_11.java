import java.util.ArrayList;
import java.util.Scanner;

/*
 * Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng
 * 
 */
public class Deadline04_11 {
	// Hàm nhập
	public static void hamNhap(ArrayList<Integer> list, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Mời nhập phần tử thứ " + (i+1) + " của mảng: ");
			int number = sc.nextInt();
			list.add(number);
		}
	}
	
	// Hàm xuất
	public static void hamXuat(ArrayList<Integer> list) {
		System.out.print("Các phần tử trong mảng: ");
		for (int value : list) {
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập vào số phần tử trong mảng: ");
		int n;
		do {
			n = sc.nextInt();
			if (n <= 0) {
				System.out.print("số phần tử không hợp lệ, mời nhập lại: ");
			}
		} while (n <= 0);
		
		ArrayList<Integer> list = new ArrayList<>();
		hamNhap(list, n);
		hamXuat(list);
	
		// Tìm số lớn nhất và vị trí của nó trong mảng
		int maxNumber = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (list.get(i) > maxNumber) {
				maxNumber = list.get(i);
				index = i;
			}
		}
		System.out.println("Số lớn nhất trong mảng là: " + maxNumber + " có chỉ số tại " + index + " trong mảng");
		
		// Tìm số âm đầu tiên và vị trí của nó trong mảng
		int chiSoAm = -1;
		int soAm = 0;
		for (int i = 0; i < n; i++) {
			if (list.get(i) < 0) {
				soAm = list.get(i);
				chiSoAm = i;
				break;
			}
		}
		if (chiSoAm == -1) {
			System.out.println("Trong mảng không tồn tại số âm");
		} else {
			System.out.println("Số âm đầu tiên trong mảng là: " + soAm + " có chỉ số tại " + chiSoAm + " trong mảng");
		}
		
		// Tìm số âm lớn nhất và vị trí của nó trong mảng
		int chiSoAmLN = -1;
		int soAmLN = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (list.get(i) < 0 && list.get(i) > soAmLN) {
				soAmLN = list.get(i);
				chiSoAmLN = i;
			}
		}
		if (chiSoAmLN == -1) {
			System.out.println("Trong mảng không tồn tại số âm");
		} else {
			System.out.println("Số âm lớn nhất trong mảng là: " + soAmLN + " có chỉ số tại " + chiSoAmLN + " trong mảng");
		}
		
		// Tính tổng các số chẵn
		int tongChan = 0;
		for (int value: list) {
			if (value % 2 == 0) {
				tongChan += value;
			}
		}
		System.out.println("Tổng các số chẵn trong mảng là: " + tongChan);
		
		// Đếm xem có bao nhiêu số âm
		int tongSoAm = 0;
		for (int value : list) {
			if (value < 0) {
				tongSoAm++;
			}
		}
		System.out.println("Tổng số âm trong mảng: " + tongSoAm);
		
		// Tính tổng các số âm
		int tongAm = 0;
		for (int value: list) {
			if (value < 0) {
				tongAm += value;
			}
		}
		System.out.println("Tổng các số âm trong mảng là: " + tongAm);
		
		// Cho người dùng nhập vào x, kiểm tra x có trong mảng hay không
		System.out.print("Mời nhập vào số x cần kiểm tra: ");
		int x = sc.nextInt();
		if (list.contains(x)) {
			System.out.println("x có tồn tại trong mảng");
		} else {
			System.out.println("x không tồn tại trong mảng");
		}
		sc.close();
	}	
}	
	
