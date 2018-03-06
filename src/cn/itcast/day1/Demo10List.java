package cn.itcast.day1;

import java.util.ArrayList;
import java.util.List;
/*
 * 常用的方法
 */
public class Demo10List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.indexOf("d"));// 第一个出现的位置
		System.out.println(list.lastIndexOf("c"));// 最后一个出现的位置
		System.out.println(list.toArray());// 转为数组
		System.out.println(list.subList(2, 3));// 截取字符
		System.out.println(list.contains("d"));// 是否包含d
		list.clear();// 删除所有数据

	}
}
