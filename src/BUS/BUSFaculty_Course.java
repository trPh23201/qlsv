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
public class BUSFaculty_Course {
    private DAOFaculty_Course dao = new DAOFaculty_Course();
    
    public ArrayList<Faculty> showFaculty(String searchKey) {
        return dao.showFaculty(searchKey);
    }   
    
    public ArrayList<Course> showCourse(String searchKey) {
        return dao.showCourse(searchKey);
    }  
    
    public String addFaculty(String Name,String Phone,String Room){
        String message = "";
        if(Name.equals("") || Phone.equals("") || Room.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            Faculty fal = new Faculty();
            fal.setName(Name);
            fal.setPhone(Phone);
            fal.setRoom(Room);
            message = dao.addFaculty(fal);
        }
        return message;
    }
    
    public String addCourse(String Name,String Period){
        String message = "";
        if(Name.equals("") || Period.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            Course co = new Course();
            co.setName(Name);
            co.setPeriod(Period);
            message = dao.addCourse(co);
        }
        return message;
    }
    
    public String updateFaculty(String Name,String Phone,String Room, String Id){
        String message = "";
        if(Name.equals("") || Phone.equals("") || Room.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            Faculty fal = new Faculty();
            fal.setId(Integer.parseInt(Id));
            fal.setName(Name);
            fal.setPhone(Phone);
            fal.setRoom(Room);
            message = dao.updateFaculty(fal);
        }
        return message;
    }
    
    public String updateCourse(String Name,String Period, String Id){
        String message = "";
        if(Name.equals("") || Period.equals("")) message = "Bạn nhập còn thiếu";
        if(message.equals("")){
            Course co = new Course();
            co.setId(Integer.parseInt(Id));
            co.setName(Name);
            co.setPeriod(Period);
            message = dao.updateCourse(co);
        }
        return message;
    }
    
    public String deleteCourse(String id){
        String message = "";
        message = dao.deleteCourse(id);
        return message;
    }
    
    public String deleteFaculty(String id){
        String message = "";
        message = dao.deleteFaculty(id);
        return message;
    }
}
