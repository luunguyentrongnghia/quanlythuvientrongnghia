/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien.service;

import quanlythuvien.Dao.thuvienDao;
import quanlythuvien.sach;        
import java.sql.SQLException;
import java.util.List;
import quanlythuvien.Bao;
import quanlythuvien.Tapchi;

/**
 *
 * @author Dell
 */
public class thuvienService {
    private thuvienDao thuviendao;
    
    public thuvienService(){
        thuviendao=new thuvienDao();
    }
    
    public List<sach> getALLItems1() throws SQLException{
        return thuviendao.getALLItems1();
    }
    public List<Tapchi> getALLItems2() throws SQLException{
        return thuviendao.getALLItems2();
    }
    public List<Bao> getALLItems3() throws SQLException{
        return thuviendao.getALLItems3();
    }
    public void addItem1(sach item) throws SQLException{
    thuviendao.addItem1(item);
    } 
    public void addItem2(Tapchi item) throws SQLException{
    thuviendao.addItem2(item);
    }
    public void addItem3(Bao item) throws SQLException{
    thuviendao.addItem3(item);
    }
    public void xoadulieu(int id) throws SQLException{
    thuviendao.Deletethuvien(id);
    }
}
