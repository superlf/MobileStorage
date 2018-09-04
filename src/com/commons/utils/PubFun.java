package com.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>创建一个公共方法类 </p>
 * @author 刘福兴
 * 2018年9月4日
 */
public class PubFun {
	
	private final static String pattern1 = "yyyy-MM-dd";
	private final static String pattern2 = "yyyyMMdd";
	private final static String pattern3 = "HH:mm:ss";
	
	public PubFun(){}
	
	/**
	 * 比较两个日期大小
	 * @param StartDate 开始时间
	 * @param EndDate 结束时间
	 * @return 比较结果
	 */
	public static boolean checkDate(String StartDate , String EndDate ){
		PubFun pub = new PubFun();
		Date start = pub.getDate(StartDate);
		Date end = pub.getDate(StartDate);
		if(start.after(end)){
			System.out.print("开始日期大于结束日期！");
			return false;
		}else{
			System.out.print("开始日期小于结束日期！");
			return true;
		}
	}
	
	
	/**
	 * 输入符合格式要求的日期字符串，返回日期类型变量
	 * @param dateString
	 * @return
	 * @throws Exception 
	 */
	public Date getDate(String dateString){
		Date date = null;
		SimpleDateFormat df;
		try{
			if(dateString.indexOf("-")!=-1){
				df = new SimpleDateFormat(pattern1);
				date = df.parse(dateString);
			}else{
				df = new SimpleDateFormat(pattern2);
				date = df.parse(dateString);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 得到当前系统日期
	 * @return 当前日期的格式字符串,日期格式为"yyyy-MM-dd"
	 */
	public static String getCurrentDate(){
		SimpleDateFormat df;
		df = new SimpleDateFormat(pattern1);
		Date today = new Date();
		return df.format(today);
	}
	
	/**
	 * 得到当前系统时间
	 * @return 当前日期的格式字符串,日期格式为"HH:mm:ss"
	 */
	public static String getCurrentTime(){
		SimpleDateFormat df;
		df = new SimpleDateFormat(pattern3);
		Date time = new Date();
		return df.format(time);
	}
	

}
