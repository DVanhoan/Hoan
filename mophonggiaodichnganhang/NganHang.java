package mophonggiaodichnganhang;

import java.util.ArrayList;
import java.util.List;

public class NganHang {

    private String id;
    private String ten;
    private List<INguoiDung> dsnguoidung;

    public NganHang(String id, String ten) {
        this.id = id;
        this.ten = ten;
        this.dsnguoidung = dsnguoidung;
    }
    public void add(INguoiDung nguoiDung){
        dsnguoidung.add(nguoiDung);
    }
    public double getTongSoTien(){
        double tongSoTien = 0;
        for(INguoiDung nguoiDung : dsnguoidung) {
            tongSoTien += nguoiDung.SoDuTaiKhoan();
        }
        return tongSoTien;
    }

    public String getId() {
        return id;
    }
    public String getTen() {
        return ten;
    }
    public List<INguoiDung> getDsnguoidung() {
        return dsnguoidung;
    }
    public String toString() {
        return "Bank ID: " + id + ", Tên : " + ten + ", Tổng số dư : " + getTongSoTien();
    }
}
