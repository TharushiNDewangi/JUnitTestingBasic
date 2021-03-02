import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculationTest.class })
public class AllTests {
	public static void beforClassAnnotation()
	{
		System.out.println("Test all Clsses");
	}

}
