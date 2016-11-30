import java.util.*;
public class TypicalProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rndm = new Random();
		double r;
		for(int j = 0; j < 27; j++){
			r = 99.78 + 47.44 * rndm.nextDouble();
			System.out.println(r);
		}
	}

}
