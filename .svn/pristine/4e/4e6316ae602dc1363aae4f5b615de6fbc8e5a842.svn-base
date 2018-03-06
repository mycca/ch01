package cn.itcast.day1;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap:
 * 		构造：
 * 			public HashMap()
 * 		主要方法：
 * 			1:public V put(K key, V value)  添加元素
 * 			2:public void putAll(Map<? extends K,? extends V> m) 将另外一个Map集合的
 * 				所有元素添加到该集合中
 * 			3:public boolean isEmpty()  判断集合是否为空
 * 			4:public int size()  获取集合元素个数
 * 			5:public boolean containsKey(Object key)  判断是否包含某个键
 * 			6:public boolean containsValue(Object value)  判断是否包含某个值
 * 			7:public void clear()	清空集合
 */
public class Demo15HashMap {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		// 1:
		hashMap.put("貂蝉", "唐嫣");
		hashMap.put("西施", "王丽坤");
		hashMap.put("昭君", "马苏");
		hashMap.put("杨玉环", "佟丽娅");

		System.out.println(hashMap.get("貂蝉"));
		System.out.println(hashMap.containsKey("杨玉环"));// 判断是否包含某个键
		System.out.println(hashMap.containsValue("马苏"));// 判断是否包含某个值
		System.out.println("================");
		System.out.println(hashMap.entrySet());// 返回所有键值对应关系,所有数据.返回的是set类型
		// Iterator<String> iterator =
		// keySet.iterator();遍历时用的,返回所有键的set集合,键不可以重复,所以用set
		// Collection<String> values =
		// hashMap.values();返回所有值的Collection集合,值是可以重复的 ,不可以用值获取键
		System.out.println(hashMap.clone());

		hashMap.clear();// 清空


	}

}
