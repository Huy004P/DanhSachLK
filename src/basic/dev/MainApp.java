package basic.dev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		ArrayList<Integer> list2 = new ArrayList<Integer>();



		System.out.println("Nhập số lượng phần tử trong danh sách:");

		int n = sc.nextInt();

		//nhập list1

		System.out.println("list");

		for (int i = 0; i < n; i++) {

			System.out.println("Phần tử " + (i + 1));

			int num = sc.nextInt();

			list1.add(num);

		}
		//nhập list2

				System.out.println("list2");

				for (int i = 0; i < n; i++) {

					System.out.println("Phần tử " + (i + 1));

					int num = sc.nextInt();

					list2.add(num);
				}
				// theo thứ tự nhập vào

				for (int i = 0; i < list1.size(); i++) {

					System.out.print(list1.get(i) + " ");
				}
				System.out.println("Danh sách đặt theo thứ tự nhập vào: ");

				for (int x : list2) {

					System.out.print(x + " ");

				}

				System.out.println("\nDanh sách đặt theo thứ tự ngược với thứ tự nhập vào: ");

				for (int x : list1) {

					System.out.print(x + " ");

				}

				locPhantu1(list1);

				System.out.println("\nDanh sách đặt theo thứ tự ngược với thứ tự nhập vào: ");

				System.out.println(list1);

				locPhantu1(list2);

				System.out.println("Danh sách thứ tự nhập vào:");

				System.out.println(list2);

				loaiBoSoLe(list1,list2);

				}

	private static void loaiBoSoLe(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		
	}

	private static void locPhantu1(ArrayList<Integer> list1) {
		// TODO Auto-generated method stub
		
	}

private static void loaiBoSoLe(LinkedList<Integer> list1,LinkedList<Integer> list2) {

	// TODO Auto-generated method stub

	for (int i = 0; i < list1.size(); i++) {

        if (list1.get(i) % 2 != 0) {

            list1.remove(i);

            i--;

        }

    }

	System.out.println("Danh sách sau khi loại bỏ");

	System.out.println(list1);

	for (int i = 0; i < list2.size(); i++) {

        if (list2.get(i) % 2 != 0) {

            list2.remove(i);

            i--;

        }

    }

	System.out.println(list2);

}



private static void locPhantu2(LinkedList<Integer> list2) {

	// TODO Auto-generated method stub

	for (int i = 0; i < list2.size() - 1; i++) {

		if (list2.get(i) == list2.get(i + 1)) {

			list2.remove(i);

			i--;

		}	

	}

}



private static void locPhantu1(LinkedList<Integer> list1) {

	// TODO Auto-generated method stub

	for (int i = 0; i < list1.size() - 1; i++) {

		if (list1.get(i) == list1.get(i + 1)) {

			list1.remove(i);

			i--;

}
	}
}
}



