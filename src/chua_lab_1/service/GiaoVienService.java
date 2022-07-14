/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chua_lab_1.service;

import chua_lab_1.model.GiaoVien;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public interface GiaoVienService {

    public ArrayList<GiaoVien> getList();

    public Boolean addNew(GiaoVien giaoVien);

    public Boolean xoa(int index);

    public ArrayList<GiaoVien> timKiem(String ten);

}
