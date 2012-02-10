//fmtRewrap.java
//James Dressel
public class fmtRewrap {
	static public String fmtRewrap(String input, int width){
		StringBuilder build = new StringBuilder();
		StringBuilder line = new StringBuilder();
		String[] words = input.split(" ");
		

		for(String word:words){
			int projectedLength = line.length()+word.length()+1;
			
			if(line.length()==0){
				//nothing in the line
				line.append(word);
			} else if(projectedLength<width){
				line.append(" ");
				line.append(word);
			} else{
				build.append(line.toString());
				build.append("\n");
				line = new StringBuilder(word);
				
			}
			
			
		} 
		
		build.append(line.toString());
		
		
		
		build.append("\n");
		return build.toString();
	}
}
