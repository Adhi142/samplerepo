package inheritance;

public class HierarchialChildB extends HierarchialParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB obj1=new HierarchialChildB();
		obj1.display();
		obj1.display2();

	}
	public void  display2()
	{
		System.out.println("child B");
	}

}
