package cn.itcast.day1;

import java.util.LinkedList;

/*
 * LinkedList：增删快，查找慢的集合
 * 		特殊方法：
 * 			public void addFirst(E e) 插入开头
 * 			public void addLast(E e) 插入结尾
 * 			public E getFirst()  获取第一个
 * 			public E getLast()  获取第最后一个
 */
public class Demo11LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("唐嫣");
		list.add("baby");
		list.add("高圆圆");
		list.addFirst("你是傻逼");
		list.addLast("哈哈");
		list.add(1, "ddddd");// 插入指定位置
		// list.addAll(c) 将一个集合中的所有元素插入到另一个集合的结尾
		// list.addAll(index, c) 将一个集合中的所有元素插入到另一个集合的指定位置
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		System.out.println(list.set(1, "你是谁啊"));
		System.out.println("=============================");
		System.out.println(list.removeFirst());// 删除并且返回第一个元素
		System.out.println(list.removeLast());// 删除并且返回最后一个元素
		System.out.println(list.clone());// 复制
		System.out.println(list.element());//获取但不移除列表的第一个元素
		System.out.println(list.offer("ddd"));//将指定元素添加到列表的末尾
		System.out.println(list.offerFirst("dd"));//在列表的开头插入指定的元素
		System.out.println(list.offerLast("ddd"));// 在列表末尾插入指定的元素
		System.out.println(list.peek());// 获取但不移除第一个元素
		System.out.println(list.peekFirst());// 获取但不移除列表的第一个元素；如果列表为空，则返回 null。
		System.out.println(list.peekLast());//获取但不移除列表的最后一个元素；如果列表为空，则返回 null。
		System.out.println(list.poll());// 获取并且移除第一个元素
		System.out.println(list.pollFirst());//获取并移除列表的第一个元素；如果列表为空，则返回 null。
		System.out.println(list.peekLast());//获取并移除列表的最后一个元素；如果列表为空，则返回 null
		System.out.println(list.pop());// 从栈中弹出第一个元素
		list.push("dd");// 将元素压入栈中
		System.out.println(list.toArray());//转换成数组
		System.out.println(list.subList(0, 2));//截取指定位置的元素
		list.clear();//移除所有元素
		System.out.println(list.descendingIterator());//逆向顺序在此双端队列的元素上进行迭代的迭代器。
	}
}
