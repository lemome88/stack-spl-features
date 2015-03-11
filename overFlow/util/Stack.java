package util;

public class Stack {
	private int countMax = 50;
	
	public void push(Object obj) {
		if(countMax==50){
			System.out.println("max reached");
			return null;
			
		}
		else original(obj);
	}
	
}
