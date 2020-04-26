package diedaiqi;


public interface TVIterator {
	void setChannel(int i);
	Object currentChannel();
	void next();
	void previous();
	boolean isLast();
	boolean isFirst();
}
