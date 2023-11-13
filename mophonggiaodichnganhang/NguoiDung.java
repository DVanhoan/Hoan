package mophonggiaodichnganhang;

public class NguoiDung implements INguoiDung{
    private String id_nguoi;
    private String ten;
    private String id_nganhang;
    private int sotaikhoan;
    private double sodutaikhoan;
    private String diachi;
    private boolean khachhangthanthiet;

    public NguoiDung(String id_nguoi, String ten, String id_nganhang, int sotaikhoan, double sodutaikhoan, String diachi) {
        this.id_nguoi = id_nguoi;
        this.ten = ten;
        this.id_nganhang = id_nganhang;
        this.sotaikhoan = sotaikhoan;
        this.sodutaikhoan = sodutaikhoan;
        this.diachi = diachi;
        this.khachhangthanthiet = (sodutaikhoan > 1000000);
    }

    public String getId_nguoi() {
        return id_nguoi;
    }

    public void setId_nguoi(String id_nguoi) {
        this.id_nguoi = id_nguoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId_nganhang() {
        return id_nganhang;
    }

    public void setId_nganhang(String id_nganhang) {
        this.id_nganhang = id_nganhang;
    }

    public int getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(int sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public double getSodutaikhoan() {
        return sodutaikhoan;
    }

    public void setSodutaikhoan(double sodutaikhoan) {
        this.sodutaikhoan = sodutaikhoan;
        this.khachhangthanthiet = (sodutaikhoan > 1000000);
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isKhachhangthanthiet() {
        return khachhangthanthiet;
    }

    public void setKhachhangthanthiet(boolean khachhangthanthiet) {
        this.khachhangthanthiet = (sodutaikhoan > 1000000);
    }


    @Override
    public void NapTien(double sotien) {
        this.sodutaikhoan += sotien;
        this.khachhangthanthiet = (sodutaikhoan > 1000000);
    }

    @Override
    public void ChuyenTien(String nguoinhan, double sotien) {
        this.sodutaikhoan -= sotien;
        System.out.println("chuyen so tien: " + sotien + " den " + nguoinhan);
    }

    @Override
    public void RutTien(double sotien) {
        this.sodutaikhoan -= sotien;
        this.khachhangthanthiet = (sodutaikhoan > 1000000);
    }

    @Override
    public double  SoDuTaiKhoan() {
        return sodutaikhoan;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "id_nguoi='" + id_nguoi + '\'' +
                ", ten='" + ten + '\'' +
                ", id_nganhang='" + id_nganhang + '\'' +
                ", sotaikhoan=" + sotaikhoan +
                ", sodutaikhoan=" + sodutaikhoan +
                ", diachi='" + diachi + '\'' +
                +'}';
    }
}
