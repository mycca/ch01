package cn.itcast.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.tools.ForwardingFileObject;
/*
 * 集合的增删改查
 */
public class Demo09List {
	public static void main(String[] args) {
		// test01();
		// test02();
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.get(0));// 查找指定位置
		System.out.println(list.set(2, "2"));// 替换指定位置
		System.out.println(list.subList(0, 3));// 查看位置0到3之间的值
		System.out.println(list.indexOf("b"));// 获取指定元素的索引
		System.out.println(list.lastIndexOf("b"));// 获取指定元素最后出现的索引
	}

	// 利用迭代的删除方法,避免并发修改异常
	private static void test02() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(0, "f");// 集合增加
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String next = it.next();
			if ("b".equals(next)) {
				it.remove();
			}

		}
		System.out.println(list);
	}

	// 集合的创建和遍历
	private static void test01() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
