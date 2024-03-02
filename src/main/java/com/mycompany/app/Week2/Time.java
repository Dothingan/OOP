package com.mycompany.app.Week2;

public class Time {
    int hour;
    int minute;
    int second;

    //Constructor khong tham so
    public Time(){
        setTime(0, 0, 0);
    }

    //Constructor voi mot tham so la gio(hour)
    public Time(int h){
        setTime(h, 0, 0);
    }

    //Constructor voi 2 tham so la gio(hour), phut(minute)
    public Time(int h, int m){
        setTime(h, m, 0);
    }

    //Constructor voi 3 tham so gio(hour), phut(minute), giay(second)
    public Time(int h, int m, int s){
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s){
        
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
        //return this;
    }
    
    //tra ve hour
    public int getHour(){
        return this.hour;
    }

    //tra ve minute
    public int getMinute(){
        return this.minute;
    }

    //tra ve second
    public int getSecond(){
        return this.second;
    }

    public String stringToScreen(){
        return hour + ":" + minute + ":" + second;
    }
        
}
