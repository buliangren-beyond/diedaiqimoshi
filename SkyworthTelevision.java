package diedaiqi;

public class SkyworthTelevision implements Television{
	private Object [] obj = {"CCTV1","CCTV2","CCTV3","CCTV4"};
 	
	public TVIterator createIterator() {
		// TODO Auto-generated method stub
		return new SkyworthIterator();
	}
	public class SkyworthIterator implements TVIterator{
		private int currentindex = 0;
		@Override
		public void setChannel(int i) {
			// TODO Auto-generated method stub
			currentindex = i;
		}

		@Override
		public Object currentChannel() {
			// TODO Auto-generated method stub
			return obj[currentindex];
		}

		@Override
		public void next() {
			if(currentindex < obj.length)
				currentindex++;
		}

		@Override
		public void previous() {
			// TODO Auto-generated method stub
			if(currentindex != 0) 
				currentindex--;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return currentindex == obj.length;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return currentindex == 0;
		}
		
	}

}
