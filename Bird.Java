package com.chenjian.test;

public class Bird {

	private int time;
	private String name;
	private int age;
	private int flightTime;
	private String wing = "白色的翅膀";

	private String say(String word) {
		System.out.println(this.name + "说了" + word);
		return word;
	}

	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void fly() {
		for (int i = 1; i <= time; i++) {
			System.out.println(name + "第" + i + "分钟用" + wing);
			System.out.println("正在飞");
		}
	}

	private int lightTime(int time) {
		return time * 100;
	}

	private void walk(String foot) {
		for (int i = 1; i <= time; i++) {
			System.out.println(name + "第" + i + "分钟用" + foot);
			System.out.println("正在走路");

		}
	}

	private static void speak() {
		System.out.println("叽叽喳喳...............");
	}

	public static void main(String[] args) {
		Bird bird1 = new Bird("火烈鸟", 1);
		bird1.time = 15;
		bird1.fly();
		int a = bird1.lightTime(10);
		System.out.println("===============飞了" + a + "m");

		Bird bird2 = new Bird("白鹤", 2);
		bird2.time = 10;
		bird2.walk("长脚");

		Bird.speak();

		String word1 = bird1.say("s");
		String word2 = bird2.say("s");
		boolean b = word1.equals(word2);
		if (b) {
			System.out.print("两个鸟说的话是一样的");
		} else {
			System.out.println("两个鸟说的话不一样");
		}
	}
}
