package cn.itcast.day1;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Set集合：
 * 		无序，元素不得重复
 * 		使用HashSet：
 * 			存储字符串时，不能有相同的字符串,存储数字，不能有相同的数字。
 * 使用HashSet：
 * 			存储自定义对象时，判断的是对象的hash值，如果hash值不同，再判断equals方法比较的结果，
 * 			如果hash值相同，并且equals比较结果为true则为同一个对象。
 * 
 * 			hash值不等：直接判断两元素不同，加入到集合中。
 * 			hash值相等：
 * 				equals方法返回结果为true，则两元素相同，不加入到集合中
 * 				equals方法返回结果为false，则两元素不相同，加入到集合中
 * 
 * 			如果想让某个类型的对象,根据内容判断是否是相同的对象,则需要将这个类型的hashCode方法与equals方法重写,按照自己的逻辑。
 * 			注意：
 * 				在add方法时，判断两元素是否相等，调用的方法是新加入对象的方法，将老对象依次作为参数传入这个方法中。
 */
public class Demo12HashSet {
	public static void main(String[] args) {
		// 1:创建集合对象
		HashSet<String> set = new HashSet<>();
		// 2：创建元素对象
		String name = "1唐嫣";
		String name2 = "2杨幂";
		String name3 = "3徐静蕾";
		String name4 = "4柳岩";
		String name5 = "4柳岩";

		// 3：添加元素到集合
		set.add(name);
		set.add(name2);
		set.add(name3);
		set.add(name4);
		set.add(name5);

		System.out.println(set);

		// 调用迭代器方法迭代集合
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String next = it.next();
			System.out.println(next);

		}
	}
}
