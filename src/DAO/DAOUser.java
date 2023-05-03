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
public class DAOUser {

    public ArrayList<UserTable> showUser(String searchKey, String type) {
        ArrayList<UserTable> user = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM UserAccount ORDER BY Created DESC";
        } else {
            sql = "SELECT * FROM UserAccount Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY Created DESC";
        }
        System.err.println(sql);
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                UserTable temp = new UserTable();
                temp.setId(rs.getString("ID"));
                temp.setAddress(rs.getString("Address"));
                temp.setBanned(rs.getBoolean("Banned"));
                temp.setCountry(rs.getString("Country"));
                temp.setDateOfBirth(rs.getDate("DateOfBirth"));
                temp.setGender(rs.getBoolean("Gender"));
                temp.setName(rs.getString("Name"));
                temp.setPhone(rs.getString("Phone"));
                temp.setRole(rs.getInt("Role"));
                user.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public String addUser(UserTable user) {
        try {
            String sql = "INSERT INTO UserAccount (ID,Name,Gender,DateOfBirth,Phone,Address,Country,Role)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setBoolean(3, user.isGender());
            ps.setDate(4, new java.sql.Date(user.getDateOfBirth().getTime()));
            ps.setString(5, user.getPhone());
            ps.setString(6, user.getAddress());
            ps.setString(7, user.getCountry());
            ps.setInt(8, user.getRole());
            ps.executeUpdate();
            
            Statement st = connection.createStatement();
            String sql1 = "INSERT INTO Schedule (Semester,Weeks,UserID)"
                    + "VALUES(N'Học kỳ 1','15','"+user.getId()+"')";
            st.executeUpdate(sql1);
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Mã số bạn nhập có thể đã bị trùng";
        }
    }

    public String updateUser(UserTable user) {
        try {
            String sql = "UPDATE UserAccount SET Name=?,Gender=?,DateOfBirth=?,Phone=?,Address=?,Country=?,Role=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(8, user.getId());
            ps.setString(1, user.getName());
            ps.setBoolean(2, user.isGender());
            ps.setDate(3, new java.sql.Date(user.getDateOfBirth().getTime()));
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getCountry());
            ps.setInt(7, user.getRole());
            ps.executeUpdate();
            return "Cập nhật thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }

    public String deleteUser(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM UserAccount WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa vì tài khoản bạn đang xóa có thể đã bị ràng buộc khá nhiều việc!";
        }
    }
    
    public String banUser(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE UserAccount SET Banned=1 WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Khóa tài khoản thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
}
