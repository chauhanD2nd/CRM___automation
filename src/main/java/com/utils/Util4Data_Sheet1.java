package com.utils;

import java.util.ArrayList;

public class Util4Data_Sheet1 {
	static Xls_Reader reader;
	static String xlsLocation = "C:\\Users\\Cp\\eclipse-workspace\\GRP001\\src\\main\\resources\\com\\testdata\\dataExcel.xlsx";

	public static ArrayList<Object[]> storeData() {

		ArrayList<Object[]> excelAllData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader(xlsLocation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

			String firstName = reader.getCellData("Sheet1", "First Name", rowNum);
			String lastName = reader.getCellData("Sheet1", "Last Name", rowNum);
			String e_Mail = reader.getCellData("Sheet1", "E-Mail", rowNum);
			String phoneNum = reader.getCellData("Sheet1", "Phone #", rowNum);
			String address = reader.getCellData("Sheet1", "Address", rowNum);
			String city = reader.getCellData("Sheet1", "City", rowNum);
			String state = reader.getCellData("Sheet1", "State", rowNum);
			String zipCode = reader.getCellData("Sheet1", "Zip Code", rowNum);
			String website = reader.getCellData("Sheet1", "Website or domain name", rowNum);
			String doYouHaveHosting = reader.getCellData("Sheet1", "Do you have hosting?", rowNum);
			String projectDesc = reader.getCellData("Sheet1", "Project Description", rowNum);

			Object ob[] = { firstName, lastName, e_Mail, phoneNum, address, city, state, zipCode, website,
					doYouHaveHosting, projectDesc };
			excelAllData.add(ob);

		}
		return excelAllData;

	}
}
