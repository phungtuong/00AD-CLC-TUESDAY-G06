package Delegate;

public class Delegation implements DelegationInterface 
{
	private DelegationInterface delegate;
	
	public String f()
	{
		if (delegate == null)
		{
			return null;
		}
		return delegate.f();
	}
	
	public void toA() {delegate= new DelegateA();}
	public void toB() {delegate= new DelegateB();}
}

interface DelegationInterface {
	String f();
}
public class DelegateA implements DelegationInterface {
	public String f(){
		return "Delegate A";
	}
}
public class DelegateB implements DelegationInterface {
    public String f() {
        return "Delegate B";
    }
}