package Java1;
/**
 * 类名称：继承Thread类
 * 类描述：继承了Thread类，然后在类中覆盖了run()方法，start()方法，在住方法没有调用start()方法之前，Thread对象只是一个实例，而不是一个真正的线程。
 * 创建人:陈键
 * 创建时间:2019/3/19/21/00
 * @version
 */

public class ThreadTest extends Thread {    // 指定类继承Thread类
	private int count = 10;
	
	public void run() {    // 重写run()方法
		while (true) {
			System.out.print(count+" ");    // 打印count变量
			if (--count == 0) {    // 使count变量自减，当自减为0时，退出循环
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
