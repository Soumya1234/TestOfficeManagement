package Code;

public class TestOffice {

	public static void main(String[] args) 
	{
		Office.setNumberOfLevels(4);
		Office a=new Office();
		Office b=new Office(a);
		Office c=new Office(b);
		Office d=new Office(c);
		System.out.println(a.getOfficeCode());
		System.out.println(b.getOfficeCode());
		System.out.println(c.getOfficeCode());
		System.out.println(d.getOfficeCode());
	}

}
