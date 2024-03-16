package laptrinhhdt;
import java.util.InputMismatchException;
import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    public String toString() {
        return String.format("| %-6s | %-17s | %6.2f | %6.2f | %6.2f |", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}

public class Qlsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien("SV001", "Hồ Văn Diện", 8.5f, 7.5f);
        SinhVien sv2 = new SinhVien("SV002", "Nguyễn Văn Tùng", 7.0f, 8.0f);

        while (true) {
            SinhVien sv3 = new SinhVien();
            System.out.println("Nhập thông tin sinh viên thứ 3 (nhập 0 để kết thúc):");
            try {
                System.out.print("Nhập mã sinh viên: ");
                String maSV = sc.nextLine();
                if (maSV.equals("0")) {
                    System.out.println("Kết thúc chương trình!");
                    break;
                }
                sv3.setMaSV(maSV);

                System.out.print("Nhập họ tên sinh viên: ");
                sv3.setHoTen(sc.nextLine());

                float diemLT, diemTH;
                do {
                    System.out.print("Nhập điểm lý thuyết (nhỏ hơn hoặc bằng 10): ");
                    diemLT = sc.nextFloat();
                    if (diemLT < 0 || diemLT > 10) {
                        System.out.println("Điểm không hợp lệ, vui lòng nhập lại.");
                    }
                } while (diemLT < 0 || diemLT > 10);
                sv3.setDiemLT(diemLT);

                do {
                    System.out.print("Nhập điểm thực hành (nhỏ hơn hoặc bằng 10): ");
                    diemTH = sc.nextFloat();
                    if (diemTH < 0 || diemTH > 10) {
                        System.out.println("Điểm không hợp lệ, vui lòng nhập lại.");
                    }
                } while (diemTH < 0 || diemTH > 10);
                sv3.setDiemTH(diemTH);
            } catch (InputMismatchException ex) {
                System.out.println("Điểm phải là số, vui lòng nhập lại.");
                sc.nextLine(); 
            } finally {
                sc.nextLine(); 
            }

            System.out.println("+--------+-------------------+-------+------+------+--------+");
            System.out.println("|  MSSV  |     Họ và tên    | Điểm LT | Điểm TH | Điểm TB |");
            System.out.println("+--------+-------------------+-------+------+------+--------+");
            System.out.println(sv1);
            System.out.println(sv2);
            System.out.println(sv3);
            System.out.println("+--------+-------------------+-------+------+------+--------+");

            
        }

        sc.close();
    }
}
