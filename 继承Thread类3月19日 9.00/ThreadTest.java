package Java1;
/**
 * �����ƣ��̳�Thread��
 * ���������̳���Thread�࣬Ȼ�������и�����run()������start()��������ס����û�е���start()����֮ǰ��Thread����ֻ��һ��ʵ����������һ���������̡߳�
 * ������:�¼�
 * ����ʱ��:2019/3/19/21/00
 * @version
 */

public class ThreadTest extends Thread {    // ָ����̳�Thread��
	private int count = 10;
	
	public void run() {    // ��дrun()����
		while (true) {
			System.out.print(count+" ");    // ��ӡcount����
			if (--count == 0) {    // ʹcount�����Լ������Լ�Ϊ0ʱ���˳�ѭ��
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
