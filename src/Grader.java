
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;


public class Grader {
	  


	public static void main(String[] args) throws Exception{
		/*Constructor<?>[] constructors = Rectangle.class.getDeclaredConstructors();
	    for (Constructor constructor:constructors) {
	    }
		 */
	    
	    Grader a = new Grader();
			a.grade();
	}
	
	public void writeCorrect(String a) {
		System.out.println(a+ " Correct");
	}
	
	public void writeIncorrect(String a) {
		System.out.println(a + " Incorrect");
	}
	
	public void grade()  {

	//CalculateAreaTest1
	String holder="CalculateAreaTest1";
	
	
	try{
		Rectangle obj = new Rectangle();
	    Class cls = obj.getClass();
		Constructor constructor = cls.getConstructor();
		System.out.println("The name of constructor is " +
		constructor.getName());
		        
		       
	Rectangle r = new Rectangle();
	if (r.calculateArea()==85) {
		writeCorrect(holder);
		} else {
			writeIncorrect(holder);
		}
	}
	catch (NoSuchMethodException e) {
		System.out.println("The constructor does not exist");
	}
	
	
	
	
	//CalculateAreaTest2
	holder="CalculateAreaTest2";
	
	
	/*
	try {
	Rectangle r = new Rectangle(19,32);
	
	if (r.calculateArea()==608)	
	writeCorrect(holder); 
	
	else 
		writeIncorrect(holder);
	}
	catch (NoSuchMethodException e) {
		System.out.println("Excpetion");
	}
*/	

	}
	}


