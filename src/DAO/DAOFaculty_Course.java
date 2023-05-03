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
public class DAOFaculty_Course {

    public ArrayList<Faculty> showFaculty(String searchKey) {
        ArrayList<Faculty> fa = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Faculty ORDER BY Created DESC";
        } else {
            sql = "SELECT * FROM Faculty Where Name LIKE N'%" + searchKey + "%' ORDER BY Created DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Faculty temp = new Faculty();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setPhone(rs.getString("Phone"));
                temp.setRoom(rs.getString("Room"));
                fa.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fa;
    }
    
    public ArrayList<Course> showCourse(String searchKey) {
        ArrayList<Course> co = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Course ORDER BY Created DESC";
        } else {
            sql = "SELECT * FROM Course Where Name LIKE N'%" + searchKey + "%' ORDER BY Created DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Course temp = new Course();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setPeriod(rs.getString("Period"));
                co.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return co;
    }
    
    public String addFaculty(Faculty fal){
        try {
            String sql = "INSERT INTO Faculty (Name,Phone,Room)"
                    + "VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, fal.getName());
            ps.setString(2, fal.getPhone());
            ps.setString(3, fal.getRoom());
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String addCourse(Course co){
        try {
            String sql = "INSERT INTO Course (Name,Period)"
                    + "VALUES(?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, co.getName());
            ps.setString(2, co.getPeriod());
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String updateFaculty(Faculty fal) {
        try {
            String sql = "UPDATE Faculty SET Name=?,Phone=?,Room=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(4, fal.getId());
            ps.setString(1, fal.getName());
            ps.setString(2, fal.getPhone());
            ps.setString(3, fal.getRoom());
            ps.executeUpdate();
            return "Cập nhật thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String updateCourse(Course co) {
        try {
            String sql = "UPDATE Course SET Name=?,Period=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(3, co.getId());
            ps.setString(1, co.getName());
            ps.setString(2, co.getPeriod());
            ps.executeUpdate();
            return "Cập nhật thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String deleteCourse(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM Course WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa vì khóa bạn đang xóa có thể đã bị ràng buộc!";
        }
    }
    
    public String deleteFaculty(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM Faculty WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa vì khoa bạn đang xóa có thể đã bị ràng buộc!";
        }
    }
}
