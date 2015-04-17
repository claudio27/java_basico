import java.io.*;
import java.util.*;

public class FileReader{

	private StringBuilder builder = null;
	private Scanner scanner = null;
	
	public FileReader(String fileName){
	
		scanner = new Scanner(new File(fileName));	
		builder = new StringBuilder();
		
	}

	public  String read(){

		while(scanner.hasNext()){
			builder.append(Scanner.next());	
		}
	return builder.toString();
	}


}
