package diedaiqi;
//������
public class Client {
	public static void display(Television tv) {
		TVIterator it = tv.createIterator();
		System.out.println("���ӻ�Ƶ��:");
		while(!it.isLast()) {
			System.out.println(it.currentChannel());
			it.next();
		}
	}
}
