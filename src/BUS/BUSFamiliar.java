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

/**
 *
 * @author gnoob
 */
public class BUSFamiliar {
    private DAOFamiliar dao = new DAOFamiliar();
    
    public ArrayList<FamiliarTable> showFamiliar(String searchKey, String type) {
        if(type.equals("Tên")) return dao.showFamiliar(searchKey, "Name");
        if(type.equals("SĐT"))return dao.showFamiliar(searchKey, "Phone");
        if(type.equals("Quan hệ")) return dao.showFamiliar(searchKey, "Relationship");
        return dao.showFamiliar("", "");
    }   
    
    public String addFamiliar(String Name,String Phone,String Relationship, String UserId){
        String message = "";
        if(Name.equals("") || Phone.equals("") || Relationship.equals("") || UserId.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            FamiliarTable fa = new FamiliarTable();
            fa.setName(Name);
            fa.setPhone(Phone);
            fa.setRelationship(Relationship);
            fa.setUserId(UserId);
            message = dao.addFamiliar(fa);
        }
        return message;
    }
    
    public String updateFamiliar(String Name,String Phone,String Relationship, String UserId, String Id){
        String message = "";
        if(Name.equals("") || Phone.equals("") || Relationship.equals("") || UserId.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            FamiliarTable fa = new FamiliarTable();
            fa.setName(Name);
            fa.setPhone(Phone);
            fa.setRelationship(Relationship);
            fa.setUserId(UserId);
            fa.setId(Integer.parseInt(Id));
            message = dao.updateSubject(fa);
        }
        return message;
    }
    
    public String deleteFamiliar(String id){
        String message = "";
        message = dao.deleteFamiliar(id);
        return message;
    }
}
