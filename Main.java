import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nhập số lượng sinh viên muốn tạo dữ liệu giả 
		System.out.println("Nhập số lượng sinh viên: ");
		int soLuong = sc.nextInt();
		
		// Tạo dữ liệu giả cho số lượng sinh viên vừa nhập bằng hàm taoDuLieu trong class quanLySinhVien
		QuanLySinhVien qlSV = new QuanLySinhVien();
		qlSV.taoDuLieu(soLuong);
		
		// Hiển thị 
		System.out.println("Danh sách sinh viên: ");
		qlSV.hienThiSV();
		
		double diemTBcaoNhat = 0;
		for (SinhVien sv : qlSV.danhSachSinhVien) {
			double dtb = (sv.diemToan + sv.diemLy + sv.diemHoa) / 3;
			if (dtb > diemTBcaoNhat) {
				diemTBcaoNhat = dtb;			
			}
		}
		for (SinhVien sv : qlSV.danhSachSinhVien) {
			double dtb = (sv.diemToan + sv.diemLy + sv.diemHoa) / 3;
			if (dtb == diemTBcaoNhat) {
				System.out.println("Sinh viên có điểm TB cao nhất là: " + sv.ten 
						+ " với ĐTB là: " + dtb + " xếp loại " + sv.xepLoai);			
			}
		}
		
		System.out.println("Danh sách sinh viên xếp loại yếu: ");
		int stt = 1;
		for (SinhVien sv : qlSV.danhSachSinhVien) {
			if (sv.xepLoai == "Yếu") {
				System.out.println(stt + ". " + sv.ten);
				stt++;
			}
		}
		
		// Tìm kiếm sinh viên theo tên
		sc.nextLine();  // Loại bỏ lỗi nuốt kí tự
		System.out.print("Nhập tên hoặc cụm từ chứa trong tên sinh viên: ");
		String searchText = sc.nextLine();
		// Tạo mảng chứa các tên trùng khớp tìm thấy
		ArrayList<String> kqTimKiem = qlSV.timSV(searchText);
		
		int soTT = 1;
		if (kqTimKiem.size() == 0) {
			System.out.println("Không tìm thấy sinh viên trung khớp với chuỗi bạn nhập!");
		} else {
			System.out.println("Kết quả tìm kiếm: ");
			for (String tenSV : kqTimKiem) {
				System.out.println(soTT + ". " + tenSV);
				soTT++;
			}
		}
		
		// Tìm sinh viên theo mã SV
		ArrayList<SinhVien> DSSV = qlSV.danhSachSinhVien;
		System.out.print("Nhập mã số SV muốn tìm: ");
		String searchMSSV = sc.nextLine();
		boolean found = false;
		for (SinhVien sv : DSSV) {
			if (sv.maSV.toLowerCase().contains(searchMSSV.toLowerCase())) {
				System.out.println("Sinh viên: " + sv.ten + " MSSV: " + sv.maSV);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("Không có sinh viên nào trùng với mã SV bạn vừa nhập!");
		}
		
		// Xóa sinh viên theo mã SV (cần nhập đúng mã SV)
		System.out.print("Nhập mã số SV muốn tìm: ");
		String xoaMSSV = sc.nextLine();
		boolean foundMSSV = false;
		String tenSVbiXoa = " ";
		for (SinhVien sv : DSSV) {
			if (sv.maSV.toLowerCase().equals(xoaMSSV.toLowerCase())) {
				found = true;
				tenSVbiXoa = sv.ten;
			}
		}
		if (found == false) {
			System.out.println("Không có sinh viên nào trùng với mã SV bạn vừa nhập!");
		} else {
			System.out.println("Hệ thống sẽ xóa sinh viên " + tenSVbiXoa + " có MSSV " + xoaMSSV );
			DSSV.remove(xoaMSSV);
		}
		
		// In danh sách sinh viên sau khi xóa
		System.out.println("---------------------------------------------\n"
				            + "Danh sách sinh viên sau khi xóa: ");
		for (SinhVien sv : DSSV) {
			System.out.println(sv);
			System.out.println("----------------------");
		}
	}
}
