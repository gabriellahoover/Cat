package singleton;

public class CatSingleton {

	private static CatSingleton INSTANCE;
	
	public String name;
	
	private CatSingleton() {
			}
	public static CatSingleton getInstance() {
		if( INSTANCE == null ) {
			INSTANCE = new CatSingleton();
		}
		return INSTANCE;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[]arg) {
		CatSingleton s = CatSingleton.getInstance();
		CatSingleton t = CatSingleton.getInstance();
		s.setName("Tonya");
		t.setName("Nancy");
		System.out.println("Tonya = " + s.getName());
		System.out.println("Nancy = " + t.getName());
	}

}

