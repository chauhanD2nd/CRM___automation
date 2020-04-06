package testSet;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.utils.Util4Data_Sheet1;

import pages.SeleniumTestPage;

public class DataEntryTest extends Base {

	SeleniumTestPage seleniumPageTest;

	@BeforeMethod
	public void SetupPage() {

		seleniumPageTest = new SeleniumTestPage();
	}

	@Test(dataProvider = "getDataFromSheet")
	public void enterData(String firstName, String lastName, String email, String phoneNum, String address, String city,
			String State, String zipcode, String website, String hosting, String Project) {

		seleniumPageTest.EnterData(firstName, lastName, email, phoneNum, address, city, State, zipcode, website,
				hosting, Project);
		seleniumPageTest.clickSend();
		Assert.assertEquals(seleniumPageTest.validatePageImage(), true);

	}

	@DataProvider
	public Iterator<Object[]> getDataFromSheet() {

		ArrayList<Object[]> it = Util4Data_Sheet1.storeData();
		return it.iterator();
	}

}
