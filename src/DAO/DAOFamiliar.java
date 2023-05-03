/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.KetNoiSQL.connection;
import DTO.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gnoob
 */
public class DAOFamiliar {

    public ArrayList<FamiliarTable> showFamiliar(String searchKey, String type) {
        ArrayList<FamiliarTable> fa = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Familiar ORDER BY Created DESC";
        } else {
            sql = "SELECT * FROM Familiar Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY Created DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                FamiliarTable temp = new FamiliarTable();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setPhone(rs.getString("Phone"));
                temp.setRelationship(rs.getString("Relationship"));
                temp.setUserId(rs.getString("UserID"));
                fa.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fa;
    }
    
    public String addFamiliar(FamiliarTable fa) {
        try {
            String sql = "INSERT INTO Familiar (Name,Relationship,Phone,UserID)"
                    + "VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, fa.getName());
            ps.setString(2, fa.getRelationship());
            ps.setString(3, fa.getPhone());
            ps.setString(4, fa.getUserId());
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String updateSubject(FamiliarTable fa) {
        try {
            String sql = "UPDATE Familiar SET Name=?,Relationship=?,Phone=?,UserID=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(5, fa.getId());
            ps.setString(1, fa.getName());
            ps.setString(2, fa.getRelationship());
            ps.setString(3, fa.getPhone());
            ps.setString(4, fa.getUserId());
            ps.executeUpdate();
            return "Cập nhật thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
       public String deleteFamiliar(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM Familiar WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
}
