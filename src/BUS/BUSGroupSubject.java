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
public class BUSGroupSubject {
    private DAOGroupSucject dao = new DAOGroupSucject();
    
    public ArrayList<GroupSubject> showGroup(String searchKey, String type) {
        if(type.equals("Tên môn")) return dao.showGroup(searchKey, "SubjectName");
        if(type.equals("Giảng viên"))return dao.showGroup(searchKey, "Teacher");
        if(type.equals("Thứ")) return dao.showGroup(searchKey, "Date");
        return dao.showGroup("", "");
    }
    
    public String addGroup(String Name, String Date, String Start, String Total, String Room,String Capacity,
            String SubjectId, String TeacherId){
        String message = "";
        int i,j,k,l;
        try {
            i=Integer.parseInt(Start);
            j=Integer.parseInt(Total);
            k=Integer.parseInt(Capacity);
            l=Integer.parseInt(SubjectId);
        } catch (Exception e) {
            message = "Nhập sai kiểu dữ liệu của số!";
        }
        i=Integer.parseInt(Start);
        j=Integer.parseInt(Total);
        k=Integer.parseInt(Capacity);
        l=Integer.parseInt(SubjectId);
        if(Name.equals("") || Date.equals("") || Start.equals("") || Total.equals("") || Room.equals("")
                 || Capacity.equals("") || SubjectId.equals("") || TeacherId.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            GroupSubject group = new GroupSubject();
            group.setName(Name);
            group.setDate(Date);
            group.setStart(i);
            group.setTotal(j);
            group.setRoom(Room);
            group.setCapacity(k);
            group.setSubjectId(l);
            group.setTeachertId(TeacherId);
            message = dao.addGroup(group);
        }
        return message;
    }
    
    public String deleteSub(String id){
        String message = "";
        message = dao.deleteGroup(id);
        return message;
    }
}
