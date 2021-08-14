package Week3Notes;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 24 };
			System.out.println(ages[ages.length - 1] - ages[0]);

			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i];
			}
			System.out.println(sum / ages.length);
		}
		{
			int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 24 };
			System.out.println(ages[ages.length - 1] - ages[0]);

			int sum = 0;
			for (int age : ages) {
				sum += age;
			}
			System.out.println(sum / ages.length);
		}
		{
			String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
			double sum = 0;
			for (String name : names) {
				sum += name.length();
			}
			System.out.println(sum / names.length);

			String allNames = names[0];
			for (int i = 1; i < names.length; i++) {
				allNames += " " + names[i];
			}
			System.out.println(allNames);

			allNames = "";
			for (String name : names) {
				allNames += " " + name;
			}
			System.out.println(allNames.substring(1));

			allNames = "";
			for (int i = 0; i < names.length; i++) {
				if (i != 0) {
					allNames += " ";
				}
				allNames += names[i];
			}
			System.out.println(allNames);
		}
		{// last element of array:dynamic
			int[] a = { 1, 2, 3 };
			System.out.println(a[a.length - 1]);
			System.out.println(a[0]);
			// first element of array, not dynamic because it is always zero.
		}
		{
			String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			System.out.println("nameLengths");
			for (int length : nameLengths) {
				System.out.println(length);
			}
			int sum = 0;
			for (int nameLength : nameLengths) {
				sum += nameLength;
			}
			System.out.println(sum);
		}
//7		
		System.out.println(myMethod7("Yuppers", 5));
//8
		System.out.println(myMethod8("James", "Jensen"));
//9 
		int[] number9Array = { 25, 28, 55, 17 };
		System.out.println(sumOfAll(number9Array));
//10	
		double[] number10Array = { 2.5, 3.9, 4.7, };
		System.out.println(aveOfAll(number10Array));
//11
		double[] array1 = { 3.8, 5, 6.2 };
		double[] array2 = { 4.7, 16, 78 };
		System.out.println(aveOfBoth(array1, array2));
//12
		boolean isHotOutside = true;
		double moneyInPocket = 10.43;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//13 
		String encourage = "You got an";
		char grade = 'A';
		System.out.println(willNotCry(encourage, grade));
	}
//7
	public static String myMethod7(String word, int n) {
		String wordTimes = "";
		for (int i = 0; i < n; i++) {
			wordTimes += word;
		}
		return wordTimes;
	}
//8
	public static String myMethod8(String x, String y) {
		return x + " " + y;

	}
//9
	public static boolean sumOfAll(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum > 100;
	}
//10
	public static double aveOfAll(double[] digits) {
		double sum = 0;
		for (double digit : digits) {
			sum += digit;
		}
		return sum / digits.length;
	}
//11
	public static boolean aveOfBoth(double[] arrays1, double[] arrays2) {
		double sum1 = 0;
		for (double array1 : arrays1) {
			sum1 += array1;
		}
		double sum2 = 0;
		for (double array2 : arrays2) {
			sum2 += array2;
		}
		return sum1 / arrays1.length > sum2 / arrays2.length;
	}
//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}
//13	
	public static String willNotCry(String x, char y) {
		return x + " " + y;
	}
}
