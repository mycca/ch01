package cn.itcast.day1;

import java.util.Arrays;
/*
 * 数组常用方法
 */
public class Demo02 {
	public static void main(String[] args) {

		int[] arr = { 123, 5, 6, 3, 67 };// 定义数组

		int[] clone = arr.clone(); // 复制
		System.out.println(Arrays.toString(clone));
		System.out.println(arr.length);// 长度
		System.out.println(arr.hashCode());// 返回对象的哈希码值
		System.out.println(arr.getClass());//得到类型名

	}

	// 函数的重载：
	// 方法名一样参数不一样。与返回值类型无关
	public static int getSum(int x, int y) {
		System.out.println("两个int类型参数的方法运行了！");
		return x + y;

	}

	public static double getSum(double x, int y) {
		System.out.println("一个double和一个int类型参数的方法运行了！");
		return x + y;
	}
}
