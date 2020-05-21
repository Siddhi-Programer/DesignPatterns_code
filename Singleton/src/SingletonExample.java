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

class SingletonLazy {
	// only declaration of Class instance
	private static SingletonLazy instance;

	// private Constructor
	private SingletonLazy() {
	}

	// public Static metjd to return instance
	public static SingletonLazy getInstance() {
		if (instance == null) {

			// instance crated only when called (Lazy Initilization)
			instance = new SingletonLazy();
		}
		return instance;
	}

}

// Synchronized Method - 
// to avoid Data inconsistance problem in Multithreaded environment

class SingletonSynchronized {
	// only declaration of Class instance
	private static SingletonSynchronized instance;

	// private Constructor
	private SingletonSynchronized() {
	}

	// public Static Synchronized method to return instance
	public static synchronized SingletonSynchronized getInstance() {
		if (instance == null) {

			// instance crated only when called (Lazy Initilization)
			instance = new SingletonSynchronized();
		}
		return instance;
	}
}


//Synchronized block - 
//to avoid Data inconsistance problem in Multithreaded environment

class SingletonSynchronizedBlock {
	// only declaration of Class instance
	private static SingletonSynchronizedBlock instance;

	// private Constructor
	private SingletonSynchronizedBlock() {
	}

	// public Static Synchronized method to return instance
	public static synchronized SingletonSynchronizedBlock getInstance() {
		if (instance == null) {
			// Synchronized block 
            synchronized (SingletonSynchronizedBlock.class) {
            	if (instance == null) {
            	// instance crated only when called (Lazy Initilization)
    			instance = new SingletonSynchronizedBlock();
            	}
			}
			
		}
		return instance;
	}
}




public class SingletonExample {

	public static void main(String[] args) {

		SingletonEager instance1 = SingletonEager.getInstance();
		SingletonEager instance2 = SingletonEager.getInstance();

		System.out.println("instance1.equals(instanc2) : " + instance1.equals(instance2));
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println("so singleton class creates single instance and shares that throught application... ");
		
		SingletonLazy instance3 = SingletonLazy.getInstance();
		SingletonLazy instance4 = SingletonLazy.getInstance();

		System.out.println("instance3.equals(instanc4) : " + instance3.equals(instance4));
		System.out.println(instance3);
		System.out.println(instance4);
		
		SingletonSynchronized i5 = SingletonSynchronized.getInstance();
		SingletonSynchronized i6 = SingletonSynchronized.getInstance();
		System.out.println(i5);
		System.out.println(i6);
		System.out.println("i5.equals(i6) : " + i5.equals(i6));
		
	}

}
