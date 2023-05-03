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
public class DAOGroupSucject {
    
    public ArrayList<GroupSubject> showGroup(String searchKey, String type) {
        ArrayList<GroupSubject> group = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Table_Group ORDER BY ID DESC";
        } else {
            sql = "SELECT * FROM Table_Group Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY ID DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                GroupSubject temp = new GroupSubject();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setCapacity(rs.getInt("Capacity"));
                temp.setDate(rs.getString("Date"));
                temp.setStart(rs.getInt("Start"));
                temp.setTotal(rs.getInt("Total"));
                temp.setRoom(rs.getString("Room"));
                temp.setTeacherName(rs.getString("Teacher"));
                temp.setSubjectName(rs.getString("SubjectName"));
                group.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return group;
    }
    
    public String addGroup(GroupSubject group) {
        try {
            String sql = "INSERT INTO GroupSubject (Name,Date,Start,Total,Room,Capacity,SubjectID,TeacherID)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, group.getName());
            ps.setString(2, group.getDate());
            ps.setInt(3, group.getStart());
            ps.setInt(4, group.getTotal());
            ps.setString(5, group.getRoom());
            ps.setInt(6, group.getCapacity());
            ps.setInt(7, group.getSubjectId());
            ps.setString(8, group.getTeachertId());
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String deleteGroup(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM GroupSubject WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa !";
        }
    }
}
