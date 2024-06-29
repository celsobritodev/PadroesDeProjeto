package decorator;

public class AppDecorator {
	public static void doDecorator() {

		DataSource ds;
		ds =new CompactFileDecorator(
				new EncryptFileDecorator(
						new FileDecorator(new FileDataSource())));

		ds.write("ABCDEFGH");
		System.out.println(ds.read());

	}
}
