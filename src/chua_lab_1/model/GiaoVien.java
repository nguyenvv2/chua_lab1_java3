/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_lab_1.model;

/**
 *
 * @author nguyenvv
 */
public class GiaoVien {

    private String hoTen;

    private String sdt;

    private int gioiTinh;

    private Float luong;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, String sdt, int gioiTinh, Float luong) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public String gioiTinh() {
        if (gioiTinh == 0) {
            return "Nam";
        } else {
            return "Nu";
        }
    }

    public String xepLoai() {
        if (luong > 1000000) {
            return "Cao";
        } else {
            return "Trung binh";
        }
    }

}
