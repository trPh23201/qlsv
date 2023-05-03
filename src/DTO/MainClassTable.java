/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author gnoob
 */
public class MainClassTable {
    private int id;
    private String className;
    private String name;
    private String userID;
    private String courseName;
    private String facultyName;
    private String type;
    private String teacher;

    public void setId(int id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getType() {
        return type;
    }

    public String getTeacher() {
        return teacher;
    }

    
}
