
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Grader {
	private String calculateArea="calculateArea";  
	
	public static void main(String[] args) throws Exception{
	    Grader a = new Grader();
	    	if (a.constru()==false)
	    		System.exit(0);
	    	if (a.method()==false)
	    		System.exit(0);
			a.grade();
	}

	
	public void grade()  {
		Grader a=new Grader();
		
	//CalculateAreaTest1
	String holder="CalculateAreaTest1";
	
	Rectangle r = new Rectangle(5,17);
	
	if (r.calculateArea()==85) {
		writeCorrect(holder);
		} else {
			writeIncorrect(holder);
		}
	
	//CalculateAreaTest2
	holder="CalculateAreaTest2";

	r = new Rectangle(19,32);
	
	if (r.calculateArea()==608)	
	writeCorrect(holder); 
	else 
		writeIncorrect(holder);
	
	//CalculatePerimeterTest1
	holder="CalculatePerimeterTest1";
	

	r = new Rectangle(19,32);
	if (r.calculatePerimeter()==102) 
		writeCorrect(holder);
	else
		writeIncorrect(holder);
	
	//CalculatePerimeterTest2
		holder="CalculatePerimeterTest2";
		 r = new Rectangle(12,15);
		 if (r.calculatePerimeter()==54)
			 writeCorrect(holder);
		else
			writeIncorrect(holder);
			 
	//EmptyArgumentConstructorTest
		 holder="EmptyArgumentConstructorTest";
		 
		r = new Rectangle();
		if (r.getLength()==1 && r.getWidth()==1)
			 writeCorrect(holder);
		else
			writeIncorrect(holder);
		
		//PreferredConstructorTest1
		holder="PreferredConstructorTest1";
		

		 r = new Rectangle(10,20);
		if (r.getLength()==10 && r.getWidth()==20)
			 writeCorrect(holder);
		else
			writeIncorrect(holder);
}
	
	
public boolean constru() {
	try{  
	    Class <?> cls = Class.forName("Rectangle");
		// System.out.println(cls);
	/*Constructor<?>[] constructors = cls.getConstructors();
	 for (int i=0; i<constructors.length; i++) {
		   System.out.println(constructors[i].toGenericString());
		    }
	*/
	  Constructor<?> cons1 = cls.getConstructor();
	 Constructor<?> cons2 = cls.getConstructor(int.class,int.class);
	    System.out.println("Constuctors correct");
	    return true;
	}
	catch (NoSuchMethodException e) {
		System.out.println("The constructor does not exist");
		return false;
	}
	catch (ClassNotFoundException e) {
		System.out.println("Rectangle class not found");
		return false;
	}
}

//For a new grader, change the declared method names and the parameters
//include parameters in method call, and put if statements for each method.
//Make methods for printing out methods exceptions (like the holder)
//Experiment with making grader into a jar file and then into a library
public boolean method() {
	try{ 
		 Rectangle rec = new Rectangle();
	
			Method met1 = rec.getClass().getDeclaredMethod("calculateArea");
		    Method met2 = rec.getClass().getDeclaredMethod("calculatePerimeter");
		    Method met3 = rec.getClass().getDeclaredMethod("getWidth");
		    Method met4 = rec.getClass().getDeclaredMethod("getLength");
		    
		    System.out.println("Methods correct");
		    return true;
}
	catch(NoSuchMethodException e) {
		System.out.println("A method does not exist");
		return false;
	}
	catch (SecurityException e) {
		System.out.println("Security Error");
		return false;
	}
}
	
	public void writeCorrect(String a) {
		System.out.println(a+ " Correct");
	}
	
	public void writeIncorrect(String a) {
		System.out.println(a + " Incorrect");
	}
}


