public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeLock codeLock = new CodeLock();
		codeLock.checkCode("123");	   
	     
	     
	}

}
class CodeLock
{    //attribute 
	public String code;
	public boolean isOpen;
	
}

public CodeLock()
	{
	    isOpen= false;
	    
	
		  code = "1234";
	}
	public void printStatus()
	{
	 if(true==isOpen)
	 
		 System.out.println("The door is open");
	 
	 else if(false==isOpen) 
	 
		 System.out.println("The door is closed");
	 
	}
