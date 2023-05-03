/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.*;
import DTO.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author gnoob
 */
public class BUSMark {
    private DAOMark dao = new DAOMark();
    
    public ArrayList<Group_Schedule> showMark(String searchKey, String type) {
        if(type.equals("MSSV")) return dao.showMark(searchKey, "UserID");
        if(type.equals("Tên sinh viên"))return dao.showMark(searchKey, "Name");
        if(type.equals("Tên môn học")) return dao.showMark(searchKey, "SubjectName");
        if(type.equals("Tín chỉ")) return dao.showMark(searchKey, "Credits");
        if(type.equals("Điểm")) return dao.showMark(searchKey, "Mark");
        if(type.equals("Giáo viên")) return dao.showMark(searchKey, "Teacher");
        return dao.showMark("", "");
    }
    
    public String updateMark(String id, String mark){
        String message = "";
        if(id.equals("") || mark.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            message = dao.updateMark(Integer.parseInt(id), Integer.parseInt(mark));
        }
        return message;
    }
}
