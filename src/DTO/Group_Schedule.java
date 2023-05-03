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
public class Group_Schedule {
    private int id;
    private String userID;
    private String name;
    private String subjectName;
    private int credits;
    private int marks;
    private String teacher;

    public int getId() {
        return id;
    }


    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }

   
   
}
