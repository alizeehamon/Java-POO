package POO;

public class Classroom {

	public static void main(String[] args) {

		Wilder Bob = new Wilder("Bob", true);
		Wilder John = new Wilder("John", false);
		System.out.println(Bob.whoAmI());
		System.out.println(John.whoAmI());
	}

}
