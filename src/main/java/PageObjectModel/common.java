package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class common {

	public static void commonselect(WebElement dropdownElement, String optionText) {

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(optionText);
	}

}
