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
public class GroupSubject {
    private int id;
    private String name;
    private String date;
    private int start;
    private int total;
    private String room;
    private int capacity;
    private int subjectId;
    private String teachertId;
    private String teacherName;
    private String subjectName;

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

    public String getRoom() {
        return room;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getTeachertId() {
        return teachertId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setTeachertId(String teachertId) {
        this.teachertId = teachertId;
    }


}
