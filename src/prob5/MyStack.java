package prob5;

public class MyStack {
	private String[] buffer;
	private int top;
	
	public MyStack(int size) {
		buffer=new String[size];
		top=-1;
	}
	
	public int size() {
		return top+1;
	}
	
	private void resize() {
		String[] newBuffer=new String[buffer.length * 2];

		for(int i=0; i<size(); i++) {
			newBuffer[i]=buffer[i];
		}

		buffer=newBuffer;
	}

	public String pop() throws MyStackException {
		if(size()==0) {
			throw new MyStackException("stack is empty");
		}
		
		String elem=buffer[top--];
		return elem;
	}
	
	public void push(String elem) {
		if(buffer.length==size()) {
			resize();
		}
		buffer[++top]=elem;
	}
	
	public boolean isEmpty() {
		if(size()!=0)return false;
		
		return true;
	}
}