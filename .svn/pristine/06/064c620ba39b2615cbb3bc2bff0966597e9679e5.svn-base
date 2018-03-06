package cn.itcast.day1;

import java.util.TreeSet;


/*
 * 
 * TreeSet:
 *      元素排序的Set集合：存储字符串与数字可以直接排序
 * 		元素排序的Set集合：存储自定义对象，可以让存储的元素类型，保证数据唯一性主要有一下两种方法
 * 		1：定义时实现Comparable接口，重写CompareTo方法，比较大小的逻辑按照需求确定。Comparable接口实在实体类里实现的
 * 		2：或者在创建TreeSet集合对象时，指定元素比较的规则：用到带参的构造方法 public TreeSet(Comparator comparator)  
 * 
 * 		即：
 * 		1：让集合内元素类型，实现Comparable接口，重写CompareTo方法
 * 		2：让集合创建时，传入一个Comparator对象，重写compare方法
 */
public class Demo14TreeSet{
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);
	}


}
