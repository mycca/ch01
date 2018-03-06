package cn.itcast.day1;

import java.util.Date;

/*
 * Date类：
 * 		类 Date 表示特定的瞬间，精确到毫秒。就是表示时间的。
 * 		构造方法：
 * 			1：public Date()分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。  获取当前时间
 * 			2：public Date(long date) 根据毫秒值，创建日期对象。
 *		主要方法:
 *			3:public long getTime() 获取毫秒数
 *			4:public void setTime(long time)  设置毫秒数
 */
public class Demo07Date {
	public static void main(String[] args) {

		// 1
		Date date = new Date();
		System.out.println(date);

		// 2
		Date date2 = new Date(1645645766712l);
		System.out.println(date2);
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(date3);
		// 3,4
		System.out.println("=========================");
		Date date4 = new Date();
		long time = date4.getTime();
		System.out.println(time);

		date4.setTime(1234566788l);
		System.out.println(date4);
	}

}
