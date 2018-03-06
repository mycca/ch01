package cn.itcast.day1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * HashMap:
 * 		主要方法：
 * 			public Set<Map.Entry<K,V>> entrySet()  返回所有键值对对应关系
 * Map.Entry:
 * 		是Map内的一个内部接口
 * 		主要方法：
 * 			K getKey()
 * 			V getValue()
 * 			V setValue(V value)  设置值
 */
public class Demo16HashMap {
	public static void main(String[] args) {
		// 创建map集合对象
		HashMap<String, String> map = new HashMap<String, String>();
		// 向集合中添加元素
		map.put("黑旋风", "李逵");
		map.put("及时雨", "宋江");
		map.put("花和尚", "鲁智深");
		map.put("母夜叉", "孙二娘");
		map.put("鼓上蚤", "时迁");
		// 返回所有键值对对应关系的Set集合
		Set<Entry<String, String>> entrySet = map.entrySet();
		// 迭代所有关系的set集合
		for (Entry<String, String> entry : entrySet) {// 获取到每一个Entry的元素对象
			// 通过Entry对象获取键与值
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.print(key + ":" + value + "     ");

			if (key.equals("花和尚")) {
				// 根据键修改值
				entry.setValue("鲁提辖");
			}
		}
		System.out.println();
		System.out.println(map);
	}

}
