package com.cn.cmm.utils;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xjz on 2019/10/3.
 */
public class DateUtils {
    public static String DATE_YYYY_MM_DD = "yyyy-MM-dd";
    public static String DATE_Y_M_DDHHMMSS = "yyyy-MM-dd HH:mm:ss";
    /**
     * 将长整型数字转换为日期格式的字符串
     * @param time
     * @param format
     * @return
     */
     public static String convert2String(long time, String format) {
         if (time > 0l&& StringUtils.isNotBlank(format)) {
             SimpleDateFormat sf = new SimpleDateFormat(format);
             Date date = new Date(time);
             return sf.format(date);
         }
         return "";
     }

    /**
     * 时间戳转换成日期格式字符串
     * @param seconds 精确到秒的字符串
     */
    public static String timeStamp2Date(String seconds,String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));
    }
    /**
     * 日期格式字符串转换成时间戳
     * @param date_str 字符串日期
     */
    public static String date2TimeStamp(String date_str,String format){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date_str).getTime()/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 取得当前时间戳（精确到秒）
     * @return
     */
    public static String timeStamp(){
        long time = System.currentTimeMillis();
        String t = String.valueOf(time/1000);
        return t;
    }

    public static void main(String[] args){
        String tt = timeStamp2Date("1570089265",null);
        System.out.println(tt);

     }
}

