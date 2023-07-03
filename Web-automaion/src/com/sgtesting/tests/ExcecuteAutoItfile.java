package com.sgtesting.tests;

public class ExcecuteAutoItfile {

	public static void main(String[] args) {
		ExecuteAutoitfile();

	}
	private static void ExecuteAutoitfile()
	{
		try {
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\Seleniumautomation\\Web-automaion\\src\\com\\sgtesting\\tests\\Autoit\\DemoSenario1st.exe");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
		
	}


