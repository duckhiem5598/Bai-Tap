import java.util.ArrayList;
import java.util.Random;

/*
 * Class quản lý sinh viên gồm các method
 * 
 * themSinhVien : thêm một sinh viên vào danh sách sinh viên
 * hienthiSV : hiển thị tất cả các sinh viên đang có trong danh sách
 * taoDuLieu : tạo dữ liệu giả cho danh sách sinh viên
 *
 */


public class QuanLySinhVien {
	
	 public String[] firstNames = {"Nguyen", "Tran", "Le", "Pham", "Dinh", "Vu", "Hoang", "Ngo", "Bui", "Đoan",
             "Mai", "Ha", "Khanh", "Thao", "Hong", "Duy", "Long", "Minh", "Tuan", "Hai",
             "Yen", "Lan", "Quan", "Tu", "Thanh", "Tam", "Bao", "Nhung", "Ngoc", "Son",
             "Van", "Phuc", "Tin", "Lien", "Nha", "Dan", "Manh", "Đien", "Tram", "Kieu",
             "Thao", "Huy", "Nhan", "Loc", "Tien", "An", "Dat", "Nhi", "Mai Anh", "The"};

	 public String[] lastNames = {"An", "Binh", "Cưong", "Dung", "Em", "Hai", "Kien", "Linh", "Minh", "Nam",
            "Khai", "Đang", "Phu", "Hung", "Thai", "Tue", "Tuyen", "Thanh", "Vinh", "Van",
            "Tam", "Nguyen", "Quyen", "Tinh", "Hoa", "Khoa", "Sang", "Quoc", "Vo", "Chinh"};
	 
	public ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
	
	public void themSinhVien (SinhVien sv) {
		danhSachSinhVien.add(sv);
	}
	
	public void hienThiSV() {
		for (SinhVien sv : danhSachSinhVien) {
			System.out.println(sv + "\n");
			
		}
	}
	
	// Tạo dữ liệu giả 
	public void taoDuLieu(int soLuong) {
		Random random = new Random();
		
		for (int i = 0; i < soLuong; i++) {
			String firstName = firstNames[random.nextInt(firstNames.length)];
			String lastName = lastNames[random.nextInt(lastNames.length)];
			String ten = firstName + " " + lastName;
			String maSV = "SV" + (10000 + random.nextInt(90000));
			double diemToan = random.nextDouble() * 10;
			double diemLy = random.nextDouble() * 10;
			double diemHoa = random.nextDouble() * 10;
			
			double dtb = (diemToan + diemLy + diemHoa) / 3;
			String xepLoai;
			if (dtb >= 9) {
				xepLoai = "Xuất sắc";
			}
			else if (dtb >= 8) {
				xepLoai = "Giỏi";
			}
			else if (dtb >= 7) {
				xepLoai = "Khá";
			}
			else if (dtb >= 6) {
				xepLoai = "Trung bình khá";
			}
			else if (dtb >= 5) {
				xepLoai = "Trung bình";
			}
			else {
				xepLoai = "Yếu";
			}
			SinhVien sv = new SinhVien(ten, maSV, diemToan, diemLy, diemHoa, xepLoai);
			danhSachSinhVien.add(sv);
		}
	}
	
	// Hàm tìm sinh viên theo một cụm từ nhập từ bàn phím 
	// Với mỗi sinh viên trong danhSachSinhVien -> Nếu tên sinh viên có chứa "cụm từ nhập từ bàn phím" -> add sinh viên đó vào list kết quả
	public ArrayList<String> timSV(String searchText){
		ArrayList<String> ketqua = new ArrayList<>();
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.ten.toLowerCase().contains(searchText.toLowerCase())) {
				ketqua.add(sv.ten);
			}
		}
		return ketqua;
	}
	
	// Hàm tìm sinh viên theo MSSV
	// Với mỗi sinh viên trong danhSachSinhVien -> Nếu MSSV có chứa "cụm từ nhập từ bàn phím" -> add sinh viên đó vào list kết quả
	public ArrayList<String> timMSSV(String searchText){
		ArrayList<String> ketqua = new ArrayList<>();
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.maSV.toLowerCase().contains(searchText.toLowerCase())) {
				ketqua.add(sv.ten);
			}
		}
		return ketqua;
	}
}
