package mophonggiaodichnganhang;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NganHang nganHang = new NganHang("1", "bidv");

        NguoiDung user1 = new NguoiDung("1","hoan", "123",322,232432443,"daknong");
        NguoiDung user2 = new NguoiDung("2","trung","322",234,322433333,"daklak");
        NguoiDung user3 = new NguoiDung("3","hoan","2834",223,343434444,"gia lai");

        nganHang.add(user1);
        nganHang.add(user2);
        nganHang.add(user3);

        System.out.println(user1.getTen() + " dang dung: " + nganHang.getTen());

        System.out.println("danh sach nguoi dung cua: " + nganHang.getTen());
        for (INguoiDung nguoiDung : nganHang.getDsnguoidung()){
            System.out.println(nguoiDung.toString());
        }
        System.out.println("tong so tien trong ngan hang: " + nganHang.getTen() + " la: " + nganHang.getTongSoTien());

        user1.NapTien(400000000);
        user3.RutTien(233333);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        List<INguoiDung> sapxep = new ArrayList<>(nganHang.getDsnguoidung());
        Collections.sort(sapxep, new Comparator<INguoiDung>() {
            @Override
            public int compare(INguoiDung o1, INguoiDung o2) {
                return Double.compare(o1.SoDuTaiKhoan(), o2.SoDuTaiKhoan());
            }
        });
        System.out.println("nguoi dung trong ngan hang " + nganHang.getTen() + "duoc sap xep theo so du: ");
        for (INguoiDung nguoiDung : sapxep){
            System.out.println(nguoiDung.toString());
        }
    }
}