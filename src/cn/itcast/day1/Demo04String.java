package cn.itcast.day1;
/**
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * StringBuilder 相较于 StringBuffer 有速度优势
 * StringBuilder线程不安全,大部分情况下使用
 * 应用程序要求线程安全的情况下，则必须使用 StringBuffer 类
 * @author CCA
 *
 */
public class Demo04String {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("菜鸟教程官网");
		System.out.println(buffer.append("Aa"));//增加
		System.out.println(buffer.reverse());//反转
		System.out.println(buffer.delete(0, 3));//移除第0到3之间的字符
		System.out.println(buffer.insert(4, "ddd"));//从位置4开始插入ddd
		System.out.println(buffer.replace(0, 5, "dddd"));//从位置0到位置5之间替换成dddd
		System.out.println(buffer.capacity());//返回当前容量
		System.out.println(buffer.indexOf("菜"));//第一次出现的位置

	}
}
