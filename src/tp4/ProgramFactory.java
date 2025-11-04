package tp4;
public class ProgramFactory {
	public static ProgramInterface createProgram (int type) {
		switch(type) {
		case 1:
			return new Program1();
		case 2:
			return new Program2();
		case 3:	
			return new Program3();
		case 4:	
			return new Program3();
	    default:
	    	return null;
		}
	}

}
