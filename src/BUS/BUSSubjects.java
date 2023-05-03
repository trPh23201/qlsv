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
public class BUSSubjects {
    private DAOSubjects dao = new DAOSubjects();
    
    public ArrayList<SubjectTable> showSuject(String searchKey, String type) {
        if(type.equals("Tên môn học")) return dao.showSubject(searchKey, "Name");
        if(type.equals("Số tín chỉ"))return dao.showSubject(searchKey, "Credits");
        if(type.equals("Loại môn học")) return dao.showSubject(searchKey, "type");
        return dao.showSubject("", "");
    }   
    
    public String addSubject(String Name,String Credits,String Type){
        String message = "";
        int i;
        try {
            i=Integer.parseInt(Credits);
        } catch (Exception e) {
            return message = "Nhập sai kiểu dữ liệu của số tín chỉ";
        }
        i=Integer.parseInt(Credits);
        if(Name.equals("") || Credits.equals("") || Type.equals("-- Loại môn học --")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            SubjectTable sub = new SubjectTable();
            sub.setName(Name);
            sub.setCredits(i);
            sub.setType(Type);
            message = dao.addSubject(sub);
        }
        return message;
    }
    
    public String updateSubject(String Name,String Credits,String Type, String id){
        String message = "";
        int i;
        try {
            i=Integer.parseInt(Credits);
        } catch (Exception e) {
            return message = "Nhập sai kiểu dữ liệu của số tín chỉ";
        }
        i=Integer.parseInt(Credits);
        if(Name.equals("") || Credits.equals("") || Type.equals("-- Loại môn học --")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            SubjectTable sub = new SubjectTable();
            sub.setId(Integer.parseInt(id));
            sub.setName(Name);
            sub.setCredits(i);
            sub.setType(Type);
            message = dao.updateSubject(sub);
        }
        return message;
    }
    
    public String deleteSub(String id){
        String message = "";
        message = dao.deleteSub(id);
        return message;
    }
    
}
