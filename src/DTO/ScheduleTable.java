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
public class ScheduleTable {
    private int id;
    private String semester;
    private int weeks;
    private String userId;
    private String subjectName;
    private String day;
    private int start;
    private int total;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getSemester() {
        return semester;
    }

    public int getWeeks() {
        return weeks;
    }

    public String getUserId() {
        return userId;
    }
    
    
}
