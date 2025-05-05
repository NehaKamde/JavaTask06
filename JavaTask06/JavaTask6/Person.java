package JavaTask6;

import java.lang.reflect.Constructor;

public class Person {

	static String name;
	static int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;

	}

	public int getage() {
		return age;

	}

	public static void main(String[] args) {

		Person test = new Person("Neha", 29);

		System.out.println("Name :: " + test.getName());
		System.out.println("age ::" + test.getage());

	}

}
