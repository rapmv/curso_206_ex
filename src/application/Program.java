package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		//lista de inteiros
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		//lista de double
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		//lista de objetos
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	/*função em que consigo transferir dados de uma sub-classe pra uma super-classe
	 pois Integer, Byte, Long, Short, Float, Double são sub-classe de Number e
	 Number e sub-classe de Object
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}