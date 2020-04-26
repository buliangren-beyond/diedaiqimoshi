package diedaiqi;
//迭代器
public class Client {
	public static void display(Television tv) {
		TVIterator it = tv.createIterator();
		System.out.println("电视机频道:");
		while(!it.isLast()) {
			System.out.println(it.currentChannel());
			it.next();
		}
	}
}
