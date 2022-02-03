
public class mlat {

	public class source {
		public static String display(String name) {

			return name;
		}
	}

	public class subclass extends source {
		public static String display(String name) {
			return name;
		}
	}

	public static void main(String[] args) {
		System.out.println(source.display("hello"));
		System.out.println(subclass.display("have a nice day"));

		System.out.println(subclass.display("hello"));

	}

}
