/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.KetNoiSQL.connection;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gnoob
 */
public class DAOSchedule {
    public ArrayList<ScheduleTable> showSchedule(String id) {
        ArrayList<ScheduleTable> sche = new ArrayList<>();
        String sql = "SELECT * FROM Table_Schedule Where UserId = '" + id + "'";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ScheduleTable temp = new ScheduleTable();
                temp.setUserId(rs.getString("UserID"));
                temp.setSubjectName(rs.getString("SubjectName"));
                temp.setDay(rs.getString("Day"));
                temp.setStart(rs.getInt("Start"));
                temp.setTotal(rs.getInt("Total"));
                sche.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sche;
    }

    public String dangkyMH(String id, String idGroup, String date, int start, int total) {
        String sql = "SELECT * FROM Schedule Where UserID = '" + id + "'";
        String sqlCheck = "SELECT * FROM UserAccount Where ID = '" + id + "'";
        String scheduleId = "";
        boolean banned = false;
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                scheduleId = rs.getString("ID");
            }
            ResultSet rsCheck = st.executeQuery(sqlCheck);
            while (rsCheck.next()) {
                banned = rsCheck.getBoolean("Banned");
            }
            
            if(banned == false){
                String sql2 = "insert into Group_Schedule(ScheduleID,GroupID,Marks)" +
                "values("+scheduleId+","+idGroup+",'')";
                System.err.println(sql2);
                st.executeUpdate(sql2);
                return "Đăng ký thành công!";
            } else {
                return "Không thể đăng ký vì tài khoản đã bị khóa!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Lỗi truy vấn! Select!";
        }
    }
}
