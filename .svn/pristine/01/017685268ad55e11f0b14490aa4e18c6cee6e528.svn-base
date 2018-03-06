package cn.itcast.day1;

import java.util.Arrays;

/**
 * java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
 * 给数组赋值：通过 fill 方法。
 * 对数组排序：通过 sort 方法,按升序。 
 * 比较数组：通过 equals 方法比较数组中元素值是否相等。
 * deepEquals用于判定两个指定数组彼此是否深层相等
 * 查找数组元素：通过 binarySearch方法能对排序好的数组进行二分查找法操作
 * 复制数组copyOfRange
 * 
 * @author CCA
 *
 */
public class Demo05Arrays {

	public static void main(String[] args) {
		// Test1();
		// test2();
		// test3();
		// test04();
		// test05();
		//deepEquals用于判定两个指定数组彼此是否深层相等，此方法适用于任意深度的嵌套数组
		String[] name1 = { "G", "a", "o", "H", "u", "a", "n", "j", "i", "e" };
		String[] name2 = { "G", "a", "o", "H", "u", "a", "n", "j", "i", "e" };
		System.out.println(Arrays.equals(name1, name2));
		System.out.println(Arrays.deepEquals(name1, name2));

	}

	// 二分搜索法,sort()方法将数组排序,如果key在数组中，则返回搜索值的第一个索引
	private static void test05() {
		int[] x = { 2, 5, 7, 9, 2, 3 };
		Arrays.sort(x);
		System.out.println(Arrays.binarySearch(x, 9));
	}

	// 复制x数组的0到5,然后赋值给is,最后打印出来
	private static void test04() {

		int[] x = { 2, 5, 7, 9, 2, 3 };
		int[] is = Arrays.copyOfRange(x, 0, 5);
		System.out.println(Arrays.toString(is));
	}

	// 比较是否相等
	private static void test3() {
		int[] x = { 2, 5, 7, 9, 2, 3 };
		int[] y = { 2, 5, 7, 9, 2, 3 };
		System.out.println(Arrays.equals(x, y));
	}

	// 赋值
	private static void test2() {
		int[] x = { 2, 5, 7, 9, 2, 3 };
		Arrays.fill(x, 3);
		for (int i : x) {
			System.out.println(i);
		}
	}

	// 排序
	private static void Test1() {
		int[] x = { 2, 5, 7, 9, 2, 3 };
		Arrays.sort(x);
		for (int i : x) {
			System.out.println(i);
		}
	}
}
