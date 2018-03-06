package cn.itcast;

public class Person implements Comparable {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// public int hashCode(){
	// System.out.println("hashCode方法被调用了");
	// return 0;
	// }
	//
	// public boolean equals(Object o){
	//
	// System.out.println("equals方法被调用了");
	//
	// Person p = (Person)o;
	// System.out.println("this:"+this+" p:"+p);
	//
	// if(this.name.equals(p.name)){
	// if(this.age==p.age){
	// return true;
	// }
	// }
	// return false;
	// }

	@Override
	public int hashCode() {

		// int result;
		// result = age*100;
		// result = result+this.name.hashCode();
		// //年龄：10 唐嫣.hashCode():20;
		// //年龄：20 柳岩.hashCode():10;

		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// 该方法负责判断两元素的大小，返回0俩对象相同。
	// 正数，集合前边的元素小于后加进来的元素。
	// 反之负数，集合前边的元素大于后加进来的元素。

	// 在这里，我自己规定了规则：先比较年龄，再比较姓名
	@Override
	public int compareTo(Object o) {
		// this：新加入的对象 o： 集合前边的元素
		// System.out.println("this:"+this+" o:"+o);

		Person p = (Person) o;
		// 定义比较的结果
		int result = 0;
		// 先比较年龄
		result = this.age - p.age;
		// 如果年龄相同，再比较姓名
		if (result == 0) {
			result = this.name.compareTo(p.name);
		}
		// 返回比较值
		return result;
	}

}
