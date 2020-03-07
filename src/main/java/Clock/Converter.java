/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.time.LocalDateTime;

/**
 *
 * @author Asif
 */
class Converter {
    public static int get_seconds(String hh, String mm, String ss){
        int hour = Integer.parseInt(hh);
        int min = Integer.parseInt(mm);
        int sec = Integer.parseInt(ss);
        return hour * 3600 + min * 60 + sec;
    }
    
    public static int get_seconds(LocalDateTime now){
        int h1 = now.getHour();
        int m1 = now.getMinute();
        int ss = now.getSecond();
        return h1 * 3600 + m1 * 60 + ss;
    }
}
