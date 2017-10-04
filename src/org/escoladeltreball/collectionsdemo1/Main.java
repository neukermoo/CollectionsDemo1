package org.escoladeltreball.collectionsdemo1;

import java.util.Collections;
import java.util.LinkedList; // es mes eficient que un arraylist
import java.util.List; //te que ser el de util no el de awt

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static List<String> subLlista(String expressio){
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
				
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		list.add("Alava");aaa
		list.add("Albacete");
		
		list.remove("Charlie");
		
		Collections.sort(list);
		
		for(String string: list) {
			System.out.println(string);
		}
	}
}
