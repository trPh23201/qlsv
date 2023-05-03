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
public class DAOMark {

    public ArrayList<Group_Schedule> showMark(String searchKey, String type) {
        ArrayList<Group_Schedule> gs = new ArrayList<>();
        String sql;
        if (searchKey.equals("")) {
            sql = "SELECT * FROM Table_Mark ORDER BY ID DESC";
        } else {
            sql = "SELECT * FROM Table_Mark Where " + type + " LIKE N'%" + searchKey + "%' ORDER BY ID DESC";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Group_Schedule temp = new Group_Schedule();
                temp.setId(rs.getInt("ID"));
                temp.setUserID(rs.getString("UserID"));
                temp.setName(rs.getString("Name"));
                temp.setSubjectName(rs.getString("SubjectName"));
                temp.setCredits(rs.getInt("Credits"));
                temp.setMarks(rs.getInt("Mark"));
                temp.setTeacher(rs.getString("Teacher"));
                gs.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gs;
    }
    
    public String updateMark(int id, int mark) {
        try {
            String sql = "UPDATE Group_Schedule SET Marks=?"
                    + " Where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mark);
            ps.setInt(2, id);
            ps.executeUpdate();
            return "Cập nhật điểm thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn!";
        }
    }
}
