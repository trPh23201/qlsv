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
public class BUSUser {
    private DAOUser dao = new DAOUser();
    
    public ArrayList<UserTable> showUser(String searchKey, String type) {
        if(type.equals("Mã số")) return dao.showUser(searchKey, "ID");
        if(type.equals("Họ và tên")) return dao.showUser(searchKey, "Name");
        if(type.equals("Giới tính")){
            if(searchKey.equalsIgnoreCase("Nam")) searchKey = "0";
            if(searchKey.equalsIgnoreCase("Nữ")) searchKey = "1";
            return dao.showUser(searchKey, "Gender");
        } 
        if(type.equals("Ngày sinh")) return dao.showUser(searchKey, "DateOfBirth");
        if(type.equals("SĐT")) return dao.showUser(searchKey, "Phone");
        if(type.equals("Địa chỉ")) return dao.showUser(searchKey, "Address");
        if(type.equals("Quê quán")) return dao.showUser(searchKey, "Country");
        if(type.equals("Chức vụ")){
            if(searchKey.equalsIgnoreCase("Sinh viên")) searchKey = "0";
            if(searchKey.equalsIgnoreCase("Giảng viên")) searchKey = "1";
            if(searchKey.equalsIgnoreCase("Admin")) searchKey = "2";
            return dao.showUser(searchKey, "Role");
        } 
        if(type.equals("Chặn")){
            if(searchKey.equalsIgnoreCase("Bị khóa")) searchKey = "1";
            if(searchKey.equalsIgnoreCase("")) searchKey = "0";
            return dao.showUser(searchKey, "Banned");
        }
        return dao.showUser("", "");
    }   
    
    public String addUser(String ID,String Name,String Gender,String DateOfBirth,
            String Phone,String Address,String Country, String Role)
    {
        String message = "";
        Date dob = new Date();
        try{
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(DateOfBirth); 
        } catch (ParseException e){
            message = "Kiểu dữ liệu ngày phải là (year-month-date)";
        }
        if(ID.equals("") || Name.equals("") || Gender.equals("-- Giới tính --") || DateOfBirth.equals("") || 
        Phone.equals("") || Address.equals("") || Country.equals("") || Role.equals("-- Chức vụ --") ){
            message = "Bạn nhập còn thiếu";
        } 
        if(message.equals("")){
            UserTable ust = new UserTable();
            ust.setId(ID);
            ust.setName(Name);
            ust.setGender(Gender.equals("Nữ") ? true : false);
            ust.setDateOfBirth(dob);
            ust.setPhone(Phone);
            ust.setAddress(Address);
            ust.setCountry(Country);
            ust.setRole(Role.equals("Sinh viên")? 0 : (Role.equals("Giảng viên") ? 1 : 2) );
            message = dao.addUser(ust);
        }
        return message;
    }
    
    public String updateUser(String ID,String Name,String Gender,String DateOfBirth,
            String Phone,String Address,String Country, String Role)
    {
        String message = "";
        Date dob = new Date();
        try{
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(DateOfBirth); 
        } catch (ParseException e){
            message = "Kiểu dữ liệu ngày phải là (year-month-date)";
        }
        if(ID.equals("") || Name.equals("") || Gender.equals("-- Giới tính --") || DateOfBirth.equals("") || 
        Phone.equals("") || Address.equals("") || Country.equals("") || Role.equals("-- Chức vụ --") ){
            message = "Bạn nhập còn thiếu";
        } 
        if(message.equals("")){
            UserTable ust = new UserTable();
            ust.setId(ID);
            ust.setName(Name);
            ust.setGender(Gender.equals("Nữ") ? true : false);
            ust.setDateOfBirth(dob);
            ust.setPhone(Phone);
            ust.setAddress(Address);
            ust.setCountry(Country);
            ust.setRole(Role.equals("Sinh viên")? 0 : (Role.equals("Giảng viên") ? 1 : 2) );
            message = dao.updateUser(ust);
        }
        return message;
    }
    
    public String deleteUser(String id){
        String message = "";
        message = dao.deleteUser(id);
        return message;
    }
    
    public String banUser(String id){
        String message = "";
        message = dao.banUser(id);
        return message;
    }
}
