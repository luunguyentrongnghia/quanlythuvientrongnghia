/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class Bao {

    public String getTennxs() {
        return Tennxs;
    }

    public void setTennxs(String Tennxs) {
        this.Tennxs = Tennxs;
    }

    public int getSobanphathanh() {
        return Sobanphathanh;
    }

    public void setSobanphathanh(int Sobanphathanh) {
        this.Sobanphathanh = Sobanphathanh;
    }

    public int getIDtailieu() {
        return IDtailieu;
    }

    public void setIDtailieu(int IDtailieu) {
        this.IDtailieu = IDtailieu;
    }
     private Date Ngayphathanh;
      private String Tennxs,Loai;

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }
    private int Sobanphathanh,IDtailieu;
    public Date getNgayphathanh() {
        return Ngayphathanh;
    }

    public void setNgayphathanh(Date Ngayphathanh) {
        this.Ngayphathanh = Ngayphathanh;
    }

   
     
}
