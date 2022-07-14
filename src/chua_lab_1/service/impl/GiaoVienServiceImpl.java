/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_lab_1.service.impl;

import chua_lab_1.model.GiaoVien;
import chua_lab_1.service.GiaoVienService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class GiaoVienServiceImpl implements GiaoVienService {

    private ArrayList<GiaoVien> listGiaoVien;

    public GiaoVienServiceImpl() {
        listGiaoVien = new ArrayList<>();
    }

    @Override
    public ArrayList<GiaoVien> getList() {
        return listGiaoVien;
    }

    @Override
    public Boolean addNew(GiaoVien giaoVien) {
        listGiaoVien.add(giaoVien);
        return true;
    }

    @Override
    public Boolean xoa(int index) {
        listGiaoVien.remove(index);
        return true;
    }

    @Override
    public ArrayList<GiaoVien> timKiem(String ten) {
        ArrayList<GiaoVien> listOutput = new ArrayList<>();
        for (GiaoVien giaoVien : listGiaoVien) {
            if (giaoVien.getHoTen().contains(ten)) {
                listOutput.add(giaoVien);
            }
        }
        return listOutput;
    }

}
