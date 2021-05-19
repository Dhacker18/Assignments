package day_5;
import java.util.ArrayList;

public class Lamda {
	
		public static void main(String[] args) {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add("DHacker18");
			arrayList.add("Devashish");
			arrayList.add("Devashish 2 ");
			arrayList.add("Devashish 3");
			arrayList.add(2, "Some Name"); // inserting element in between 2 elements

			ArrayList<String> arrayList2 = new ArrayList<>();
			
			arrayList.forEach((word) -> {
				if(word.contains("Devashish"))
					arrayList2.add(word);
				}
			);
			
			arrayList2.forEach((word) -> System.out.println(word));

		}
	}


