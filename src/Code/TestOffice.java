package Code;

public class TestOffice {

	public static void main(String[] args) 
	{
		Office.setNumberOfLevels(5);
		Office a=new Office();
		Office b=new Office(a);
		Office c=new Office(b);
		Office d=new Office(c);
		Office e=new Office(d);
		Office f=new Office(a);
		Office g=new Office(b);
		System.out.println(a.getOfficeCode());
		System.out.println(a.getOfficeLevel());
		System.out.println(b.getOfficeCode());
		System.out.println(b.getOfficeLevel());
		System.out.println(c.getOfficeCode());
		System.out.println(c.getOfficeLevel());
		System.out.println(d.getOfficeCode());
		System.out.println(d.getOfficeLevel());
		System.out.println(e.getOfficeCode());
		System.out.println(e.getOfficeLevel());
		System.out.println(f.getOfficeCode());
		System.out.println(f.getOfficeLevel());
		System.out.println(g.getOfficeCode());
		System.out.println(g.getOfficeLevel());
		
	}

}
