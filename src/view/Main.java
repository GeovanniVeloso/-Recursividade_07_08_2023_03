package view;

import controller.RecursivaFatorial;

public class Main {

	public static void main(String[] args) {
		RecursivaFatorial rf = new RecursivaFatorial();
		
		int n = 6;
		
		int res = rf.FFAT(n);
		
		System.out.println(res);

	}

}
