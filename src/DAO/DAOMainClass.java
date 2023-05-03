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

public class DAOMainClass {


    public ArrayList<MainClassTable> showMainClass(String searchKey, String type) {
        ArrayList<MainClassTable> mct = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Table_MainClass ORDER BY ID DESC";
        } else {
            sql = "SELECT * FROM Table_MainClass Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY ID DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MainClassTable temp = new MainClassTable();
                temp.setId(rs.getInt("ID"));
                temp.setName(rs.getString("Name"));
                temp.setType(rs.getString("Type"));
                temp.setClassName(rs.getString("ClassName"));
                temp.setCourseName(rs.getString("CourseName"));
                temp.setFacultyName(rs.getString("FacultyName"));
                temp.setTeacher(rs.getString("Teacher"));
                temp.setUserID(rs.getString("UserID"));
                mct.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mct;
    }

    public String addMainClass(String Name, String Type, String UserID,
            String TeacherID, int FacultyID, int CourseID ) {
        try {
            String sql = "INSERT INTO MainClass (Name,Type,UserID,TeacherID,FacultyID,CourseID)"
                    + "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, Name);
            ps.setString(2, Type);
            ps.setString(3, UserID);
            ps.setString(4, TeacherID);
            ps.setInt(5, FacultyID);
            ps.setInt(6, CourseID);
            ps.executeUpdate();
            return "Thêm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
    
    public String deleteMainClass(String id) {
        try {
            Statement st = connection.createStatement();
            String sql = "DELETE FROM MainClass WHERE ID='" + id + "'";
            st.executeUpdate(sql);
            return "Xóa thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Không thể xóa !";
        }
    }
    
    public void createView() {
        try {
            Statement st = connection.createStatement();
            String sql = "create view Table_MainClass as " +
"select MainClass.ID, MainClass.Name as 'ClassName', UserAccount.Name, MainClass.UserID, Course.Name as 'CourseName', Faculty.Name as 'FacultyName', MainClass.Type, UA.Name as 'Teacher' " +
"from UserAccount, MainClass, Course, Faculty, UserAccount as UA " +
"where UserAccount.ID = MainClass.UserID and MainClass.CourseID = Course.ID and MainClass.FacultyID = Faculty.ID and MainClass.TeacherID = UA.ID";
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
