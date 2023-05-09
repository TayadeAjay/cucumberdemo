package base;

import java.util.ArrayList;

public class constant {

	public static String username = "rahul";

	public static String password = "123";

	public static String expectedtext = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

	public static String errormsg = "Not working";

	public constant(ArrayList<String> name1, ArrayList<String> pass) {

		name1.add("vinay");
		name1.add("virat");
		name1.add("sairat");
		name1.add("balma");
		name1.add("rahul");

		pass.add("vinay@123");
		pass.add("virat@123");
		pass.add("sairat@123");
		pass.add("balma@420");
		pass.add("rahul@123");
	}

}