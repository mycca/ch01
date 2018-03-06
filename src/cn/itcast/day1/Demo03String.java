package cn.itcast.day1;

import java.util.Arrays;

/**
 * String类的常用方法
 * 
 * @author CCA
 *
 */
public class Demo03String {
	public static void main(String[] args) {
		String str = "asd   dffdfdfdfg";
		String str1 = "ddddddfdfd";
		char[] cs = { 'a', 'b', 'c', 'd' };
		String[] strings = { "a", "s", "d" };
		System.out.println(cs);
		System.out.println(Arrays.toString(strings));
		System.out.println(str.charAt(5));// 指定位置的字符?
		System.out.println(str.length());// 长度
		System.out.println(str.equals(str1));// 测试等?
		System.out.println(str.equalsIgnoreCase(str1));// 比较字符串到另一个字符串，忽略大小写因素。
		System.out.println(str.substring(2, 4));// 截取字符串2到4之间,返回的是String
		System.out.println(str.subSequence(0, 6));// 截取字符串0到6之间,返回的是类
		System.out.println(str.trim());// 去掉两边的空格
		System.out.println(str.codePointAt(0));// 指定索引处unicode
		System.out.println(str.codePointCount(2, 7));// 指定范围内的字符个数
		System.out.println(str.concat("adc"));// 将abc连接到字符串的结尾
		System.out.println(str.contains("A"));// 字符串里面是不是有A字符
		System.out.println(str.contentEquals("ss"));// 用于将将此字符串与指定的 StringBuffer
		System.out.println(str.codePointBefore(4));// 返回的Unicode代码点之前给定的索引
		System.out.println(str.compareTo(str1));// 按字典顺序比较两个字符串的大小。如果两个字符串首字母不同，则该方法返回首字母的asc码的差,即参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值
		System.out.println(str.compareToIgnoreCase(str));// 按字典顺序比较两个字符串的大小，不考虑大小写
		System.out.println(str.copyValueOf(cs));// 返回cs的值
		System.out.println(str.copyValueOf(cs, 0, 2));// 返回cs指定位置的值
		System.out.println(String.valueOf(str));// 返回最适合该对象类型的原始值,类似tostring
		System.out.println(String.valueOf(cs, 0, 3));// 返回char数组的0到3位置的值
		System.out.println(str.hashCode());// 返回对象的哈希码值
		System.out.println(str.indexOf("d"));// 第一次出现的字符位置
		System.out.println(str.indexOf("d", 4));// 从第4位开始,找到出现d的位置
		System.out.println(str.intern());// 返回字符串对象的规范化表示形式
		System.out.println(str.isEmpty());// 判断字符串是否是空的
		System.out.println(str.startsWith("a"));// 是否以A开始
		System.out.println(str.endsWith("g"));// 是否以指定的字符结尾
		System.out.println(str.lastIndexOf("d"));// d最后出现的位置
		System.out.println(str.lastIndexOf("f", 5));// 截止位置5,最后出现f的地方
		System.out.println(str.replace("a", "cc"));// 用一些字符替换另一些字符
		System.out.println(str.replaceFirst("d", "2"));// 替换第一次出现的字符串
		System.out.println(str.replaceAll("d", "8"));// 基于规则表达式的替换
		System.out.println(str.toCharArray());// 将字符串转换为字符数组
		System.out.println(str.toLowerCase());// 将所有的英文字符转换为小写字母
		System.out.println(str.toUpperCase());// 将所有的英文字符转换为大写字母
		System.out.println(str.toString());// 该对象的字符串表示,返回字符串本身的数值
		System.out.println(str.getClass());// 获得全类名
		String[] ｓ = str.split("　");
		System.out.println(str.format("%b", str1));// 用于创建格式化的字符串以及连接多个字符串对象
		// System.out.println(str.getBytes(0, 3, cs, 0));//将字符串转换成byte数组
		// System.out.println(str.getChars(srcBegin, srcEnd, dst, dstBegin););
		// System.out.println(str.format(l, format, args));
		// System.out.println(str.wait());
		// System.out.println(str.wait(timeout));
		// System.out.println(str.wait(timeout, nanos));
		// System.out.println(str.notify());
		// System.out.println(str.notifyAll());

		// System.out.println(str.matches(regex));正则表达式
		// System.out.println(str.offsetByCodePoints(index,
		// codePointOffset));获取偏移量
		// System.out.println(str.regionMatches(toffset, other, ooffset, len));
		// System.out.println(str.regionMatches(ignoreCase, toffset,
		// other,ooffset, len));
	
	}

}
