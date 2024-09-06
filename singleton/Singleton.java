package singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
		private static volatile Singleton instance;

	    private Singleton() {
	        if (instance != null) {
	            throw new IllegalStateException("Instance already exists");
	        }
	    }

	    public static Singleton getInstance() {
	        if (instance == null) {
	            synchronized (Singleton.class) {
	                if (instance == null) {
	                    instance = new Singleton();
	                }
	            }
	        }
	        return instance;
	    }
}

//	    @Override
//	    protected Object clone() throws CloneNotSupportedException {
//	        throw new CloneNotSupportedException("Singleton object cannot be cloned");
//	    }
//
//	    private Object readResolve() {
//	        return getInstance();
//	    }
//
//	    public void showMessage() {
//	        System.out.println("Hello from Singleton");
//	    }
//    }

