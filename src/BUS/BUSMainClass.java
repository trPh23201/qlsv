/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.*;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author gnoob
 */
public class BUSMainClass {
    private DAOMainClass dao = new DAOMainClass();
    
    public ArrayList<MainClassTable> showClass(String searchKey, String type) {
        if(type.equals("Tên lớp")) return dao.showMainClass(searchKey, "ClassName");
        if(type.equals("Giảng viên"))return dao.showMainClass(searchKey, "Teacher");
        if(type.equals("MSSV")) return dao.showMainClass(searchKey, "UserID");
        if(type.equals("Tên SV")) return dao.showMainClass(searchKey, "Name");
        return dao.showMainClass("", "");
    }
    
    public String addMainClass(String Name, String Type, String UserID,
            String TeacherID, String FacultyID, String CourseID){
        String message = "";
        if(Name.equals("") || UserID.equals("") || Type.equals("-- Loại lớp --") || TeacherID.equals("") 
        || FacultyID.equals("") || CourseID.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            message = dao.addMainClass(Name, Type, UserID, TeacherID, Integer.parseInt(FacultyID), Integer.parseInt(CourseID));
        }
        return message;
    }

    public String deleteMainClass(String id){
        String message = "";
        message = dao.deleteMainClass(id);
        return message;
    }
}
