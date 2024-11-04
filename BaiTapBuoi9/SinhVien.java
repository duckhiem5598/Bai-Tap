public class SinhVien {
	// Attribute
	String ten;
	String maSV;
	double diemToan;
	double diemLy;
	double diemHoa;
	String xepLoai;
	
	// Constructor
	public SinhVien() {}
	
	public SinhVien(String name, String id, double math, double physic, double chemistry, String xepLoai) {
		this.ten = name;
		this.maSV = id;
		this.diemToan = math;
		this.diemLy = physic;
		this.diemHoa = chemistry;
		this.xepLoai = xepLoai;
	}
	
	// Getter and Setter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public double diemTrungBinh() {
		return (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}
	
	
	public String toString() {
		String res = "Tên sinh viên: " + this.ten + "\n" 
				+ "Mã số SV: " + this.maSV + "\n"
				+ "Điểm Toán: " + this.diemToan + "\n"
				+ "Điểm Lý: " + this.diemLy + "\n"
				+ "Tên hóa: " + this.diemHoa + "\n"
				+ "Điểm trung bình: " + diemTrungBinh() + "\n"
				+ "Xếp loại: " + xepLoai;
		return res;
	}
	
}
