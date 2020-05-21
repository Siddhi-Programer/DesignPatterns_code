class SingletonEager {
    
	// declaration and intializing instance at same time
	private static SingletonEager instance = new SingletonEager();

	// private Constructor 
	private SingletonEager() {
	}

	// public Static metjd to return instance 
	public static SingletonEager getInstance() {
		return instance;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		
		SingletonEager instance1 = SingletonEager.getInstance();
		SingletonEager instance2 = SingletonEager.getInstance();
		
		System.out.println("instance1.equals(instanc2) : "+instance1.equals(instance2));
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println("so singleton class creates single instance and shares that throught application... ");
	}

}
