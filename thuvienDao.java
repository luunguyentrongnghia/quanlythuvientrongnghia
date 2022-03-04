/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien.Dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quanlythuvien.Bao;
import quanlythuvien.Tapchi;
import quanlythuvien.sach;

/**
 *
 * @author Dell
 */
public class thuvienDao {
  Connection conn = JDBCConnection.getJDBCConnection();
/**
 *
 * @author kvan2
 */

    public List<sach> getALLItems1() throws SQLException{
        List<sach> items= new ArrayList<sach>();
        Connection connection=JDBCConnection.getJDBCConnection();
        String sql="SELECT * FROM QLthuvien WHERE Loai='sach'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                sach item=new sach();
                item.setIDtailieu(rs.getInt("IDtailieu"));
                item.setLoai(rs.getString("Loai"));
                item.setTennxs(rs.getString("Tennxs"));
                item.setTentacgia(rs.getString("Tentacgia"));
                item.setSotrang(rs.getInt("Sotrang"));
                item.setSobanphathanh(rs.getInt("Sobanphathanh"));               
                items.add(item);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return items;
        }
    public List<Tapchi> getALLItems2() throws SQLException{
        List<Tapchi> items= new ArrayList<Tapchi>();
        Connection connection=JDBCConnection.getJDBCConnection();
        String sql="SELECT * FROM QLthuvien WHERE Loai='Tapchi'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Tapchi item=new Tapchi();
                item.setIDtailieu(rs.getInt("IDtailieu"));
                item.setTennxs(rs.getString("Tennxs"));
                item.setLoai(rs.getString("Loai"));
                item.setIdPH(rs.getString("idPH"));
                item.setThangphathanh(rs.getInt("Thangphathanh"));
                item.setSobanphathanh(rs.getInt("Sobanphathanh"));
                
                items.add(item);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return items;
        }
      public List<Bao> getALLItems3() throws SQLException{
        List<Bao> items= new ArrayList<Bao>();
        Connection connection=JDBCConnection.getJDBCConnection();
        String sql="SELECT * FROM QLthuvien WHERE Loai='bao'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Bao item=new Bao();
                item.setIDtailieu(rs.getInt("IDtailieu"));
                item.setTennxs(rs.getString("Tennxs"));
               item.setLoai(rs.getString("Loai"));
                item.setNgayphathanh(rs.getDate("Ngayphathanh"));
                item.setSobanphathanh(rs.getInt("Sobanphathanh"));
                
                items.add(item);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return items;
        }
    public void addItem1(sach item) throws SQLException{
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="INSERT INTO qlthuvien( Loai, Tennxs, Tentacgia,Sotrang,Sobanphathanh)"
                + "values(?,?,?,?,? )";
        
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, item.getLoai());
            preparedStatement.setString(2, item.getTennxs());
           preparedStatement.setString(3, item.getTentacgia());
           preparedStatement.setInt(4, item.getSotrang());
            preparedStatement.setInt(5, item.getSobanphathanh());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    } 
     public void addItem2(Tapchi item) throws SQLException{
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="INSERT INTO qlthuvien(Tennxs, Loai, idPH, Thangphathanh,Sobanphathanh)"+ "values(?,?,?,?,? )";
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setString(1, item.getTennxs());
             preparedStatement.setString(2, item.getLoai());
           preparedStatement.setString(3, item.getIdPH());
           preparedStatement.setInt(4, item.getThangphathanh());
            preparedStatement.setInt(5, item.getSobanphathanh());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public void addItem3(Bao item) throws SQLException{
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql="INSERT INTO qlthuvien(Tennxs, Loai,Ngayphathanh,Sobanphathanh)"+ "values(?,?,?,? )";
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setString(1, item.getTennxs());
           preparedStatement.setString(2, item.getLoai());
           preparedStatement.setDate(3, item.getNgayphathanh());
            preparedStatement.setInt(4, item.getSobanphathanh());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public void Deletethuvien(int id) throws SQLException{
         Connection connection = JDBCConnection.getJDBCConnection();
         String sql="delete from qlthuvien where IDtailieu = ? ";
         try {
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1, id);
             int rs=preparedStatement.executeUpdate();
             System.out.println(rs);
         }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public List<sach>timkiemsach(String name){
        ResultSet rs = null;
        Statement sttm =null;
          List<sach> ls = new ArrayList<>();
          try{
          String sql="select * from qlthuvien where Loai='sach' and Tennxs like '"+name+"'";
          conn = JDBCConnection.getJDBCConnection();
          sttm=conn.createStatement();
          rs=sttm.executeQuery(sql);
          while (rs.next()){
                sach item=new sach();
                item.setIDtailieu(rs.getInt(1));
                item.setLoai(rs.getString(2));
                item.setTennxs(rs.getString(3));
                item.setTentacgia(rs.getString(4));
                item.setSotrang(rs.getInt(5));
                item.setSobanphathanh(rs.getInt(6));               
                ls.add(item);
            }
          }catch(Exception e){
              System.out.println("loi:"+e.toString());
          }
          finally{
            try{
            rs.close();
            sttm.close();
            conn.close();           
            }catch(Exception e){}
          
          }
      
      return ls;
      }
}
