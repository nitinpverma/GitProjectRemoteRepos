/**
 * 
 */

package myPackage;


/**
 * @author Nitin
 *
 */
public class Myclass {
	
	
	 /* change added by Nitin
	 */
	private String varNew="";
	private String var3="new idea";
	public String getVarNew() {
		return varNew;
	}

	public void setVarNew(String varNew) {
		this.varNew = varNew;
	}

	public String getVar3() {
		return var3;
	}

	public void setVar3(String var3) {
		this.var3 = var3;
	}

	public String getDummyChange2() {
		return dummyChange2;
	}

	public void setDummyChange2(String dummyChange2) {
		this.dummyChange2 = dummyChange2;
	}

	public String getDummyChange1() {
		return dummyChange1;
	}

	public void setDummyChange1(String dummyChange1) {
		this.dummyChange1 = dummyChange1;
	}

	private String dummyChange2="";

	/**
	
	
	/**
	 * change added by Nikhil
	 */
	private String dummyChange1="";

	/**
	 * 
	 */
	
	
	
		public Myclass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass myclass= new Myclass();
		myclass.setDummyChange1("nipun");
		myclass.setDummyChange2("nitin");
		
		System.out.println("Dummy print added by Nitin");

	}

}
