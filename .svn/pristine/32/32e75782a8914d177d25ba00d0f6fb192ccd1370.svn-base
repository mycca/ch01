package cn.itcast.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet
 * 		在HashSet集合的基础上，使迭代顺序可预测
 * 		可以用这个集合去除list的重复
 * 
 */
public class Demo13LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("ddd");
		lhs.add("ccc");
		lhs.add("ddd");
		lhs.add("aaa");
		System.out.println(lhs);
		
		Iterator it = lhs.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
			
		}
	}
}
