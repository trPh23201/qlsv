/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.KetNoiSQL.connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DTO.*;
import java.sql.PreparedStatement;

/**
 *
 * @author gnoob
 */
public class DAOSubjects {


    public ArrayList<SubjectTable> showSubject(String searchKey, String type) {
        ArrayList<SubjectTable> sjt = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Subject ORDER BY Created DESC";
        } else {
            sql = "SELECT * FROM Subject Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY Created DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SubjectTable temp = new SubjectTable();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setType(rs.getString("Type"));
                temp.setCredits(rs.getInt("Credits"));
                sjt.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sjt;
    }

    public String addSubject(SubjectTable sub) {
        try {
            String sql = "INSERT INTO Subject (Name,Credits,Type)"
                    + "VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, sub.getName());
            ps.setInt(2, sub.getCredits());
            ps.setString(3, sub.getType());
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }

    public String updateSubject(SubjectTable sub) {
        try {
            String sql = "UPDATE Subject SET Name=?,Credits=?,Type=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(4, sub.getId());
            ps.setString(1, sub.getName());
            ps.setInt(2, sub.getCredits());
            ps.setString(3, sub.getType());
            ps.executeUpdate();
            return "Cập nhật thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }

    public String deleteSub(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM Subject WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa vì môn học bạn đang xóa có thể đã bị ràng buộc!";
        }
    }

}
