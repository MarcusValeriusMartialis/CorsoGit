package arraylist;
import java.util.ArrayList;

import base2.Rettangolo;
import util.View;

public class AppArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numeri = new ArrayList<>();
		View.print("numeri.size(): "+numeri.size());
		View.print("numeri.isEmpty(): "+numeri.isEmpty());
		numeri.add(1);
		View.print("numeri.size(): "+numeri.size());
		View.print("numeri.isEmpty(): "+numeri.isEmpty());
		View.print(numeri);
		numeri.add(2);
		View.print(numeri);
		numeri.set(1, 555);
		View.print(numeri);
		numeri.add(1, 50);
		View.print(numeri);
		numeri.remove(1);
		View.print(numeri);
		
		ArrayList<String> s = new ArrayList<>();
		s.add("a");
		s.add("b");
		s.add("c");
		View.print(s);
		s.set(1, "x");
		View.print(s);
		s.add(1, "y");
		View.print(s);
		s.add("k");
		View.print(s);
		s.remove(1);
		View.print(s);
		s.remove("c");
		View.print(s);
		s.add("k");
		s.add("k");
		View.print(s);
		s.remove("k");
		View.print(s);
		View.print(s.get(1));
		View.print(s.get(1).toUpperCase());
		
		ArrayList<Rettangolo> rettangoli = new ArrayList<>();
		rettangoli.add(new Rettangolo(40,50));
		View.print(rettangoli.get(0).calcolaArea());
		
	}

}
