package Code;

public class Office {
     private String Office_Code;
     private Office Controlling_Office;
     private int Level;
     private static int numOfLevels=1;
     
     public Office()
     {
    	 Controlling_Office=null;
    	 Level=1;
    	 setOfficeCode();
     }
     
     public Office(Office controlling_office)
     {
    	 Controlling_Office=controlling_office;
    	 Level=Controlling_Office.getOfficeLevel()+1;
    	 setOfficeCode();
     }
     
     private void setOfficeCode()
     {
    	 if(Level==1)
    	 {
    		 if(numOfLevels==1)
    		 {
    			 Office_Code="1";
    		 }
    		 else
    		 {
    			 Office_Code="1"+paddzero();
    		 }
    	 }
    	 else
    	 {
    		 Office_Code=Controlling_Office.getOfficeCode().substring(, arg1)
    	 }
     }
     
     public String getOfficeCode()
     {
    	 return Office_Code;
     }
     
     private String paddzero()
     {
    	 String result="000";
    	 
    	 for(int i=0;i<numOfLevels-2;i++)
    	 {
    		 result=result+"000";
    	 }
    	 return result;
     }
     
     public static void setNumberOfLevels(int a)
     {
    	 numOfLevels=a;
     }
     
     public int getOfficeLevel()
     {
    	 return Level;
     }
}
