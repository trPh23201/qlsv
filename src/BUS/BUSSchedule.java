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
public class BUSSchedule {

    private DAOSchedule dao = new DAOSchedule();

    public ArrayList<ScheduleTable> showSchedule(String id) {
        return dao.showSchedule(id);
    }

    public String dangkyMH(String id, String groupId, String date, int start, int total) {
        String message;
        ArrayList<ScheduleTable> sche = dao.showSchedule(id);
        for (int i = 0; i < sche.size(); i++) {
            String day = sche.get(i).getDay();
            int startEx = sche.get(i).getStart();
            int totalEx = sche.get(i).getTotal();
            if (day.equalsIgnoreCase(date)) {
                if ((start + total) > startEx && start <= startEx) {
                    return "Không thể đăng ký vì ngày này đã có tiết học !";
                }
                if ((startEx + totalEx) > start && start >= startEx) {
                    return "Không thể đăng ký vì ngày này đã có tiết học !";
                }
            }
        }
        
        if(id.equals("")) message = "Bạn chưa chọn một sinh viên nào";
        else message = dao.dangkyMH(id, groupId, date, start, total);
        return message;
    }
}
