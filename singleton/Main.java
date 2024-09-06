package singleton;

public class Main {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		// Check if both instances are the same
		if (instance1 == instance2) {
			System.out.println("Test Passed: Only one instance is created.");
		} else {
			System.out.println("Test Failed: Different instances were created.");
		}
	}
}

//import java.lang.reflect.Constructor;
//
//public class SingletonReflectionTest {
//    public static void main(String[] args) {
//        Singleton instance1 = Singleton.getInstance();
//
//        Singleton instance2 = null;
//        try {
//            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            instance2 = constructor.newInstance();
//        } catch (Exception e) {
//            System.out.println("Test Passed: Reflection prevented new instance creation.");
//        }
//
//        if (instance1 == instance2) {
//            System.out.println("Test Failed: Reflection created a new instance.");
//        } else {
//            System.out.println("Test Passed: Reflection prevented new instance creation.");
//        }
//    }
//}
