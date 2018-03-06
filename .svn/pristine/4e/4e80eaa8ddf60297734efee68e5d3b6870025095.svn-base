package cn.itcast.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Collection方法：
 * 		1：boolean addAll(Collection c) //传入一个集合,用来合并两个集合
 * 		2：boolean removeAll(Collection c)//从a集合删除b集合中的数据,最后只保留a和b不重复的数据
 * 		3：boolean containsAll(Collection c)//a集合中是否包含b集合中的所有数据
 * 		4：boolean retainAll(Collection c)  //a集合中和b集合中取交集。如果集合内容改变了，返回true，没改变返回false
 * 			retainAll方法说明：
 * 				将两个集合的交集赋值给调用该方法的集合
 * 				
 */
public class Demo08Collection {
	public static void main(String[] args) {

		// 创建集合对象
		List<String> c = new ArrayList();
		// 创建数据对象
		String s = "唐嫣";
		String s2 = "高圆圆";
		String s3 = "baby";
		String s4 = "柳岩";
		// 将数据添加到集合中
		c.add(s);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		System.out.println(c);

		// ============================================================
		List<String> c2 = new ArrayList();
		c2.add("唐嫣");
		c2.add("高圆圆");
		c2.add("杨幂");
		c2.add("刘诗诗");
		// 把c2放到c里面,最后打印c addAll
		boolean addAll = c.addAll(c2);
		System.out.println(addAll);
		System.out.println(c);
		//c中是否包含c2中的所有元素
		boolean containsAll = c.containsAll(c2);
		System.out.println(containsAll);	
	
		
		// 把c中的所有c2集合元素删掉,c和c2中重复的数据也会被删除 removeAll
		boolean removeAll = c.removeAll(c2);
		System.out.println(removeAll);
		System.out.println(c);
		
		boolean retainAll = c.retainAll(c2);
		System.out.println(removeAll);
		
		
		

	}
}
