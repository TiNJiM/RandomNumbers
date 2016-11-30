import java.util.*;
public class TypicalProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rndm = new Random();
		for(int j = 0; j < 33; j++){
			int r = 71 + rndm.nextInt(29);
			System.out.println(r);
		}
	}

}
