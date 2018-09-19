public class Commas {

	public Commas(){
	}

	public String addComas(int num){
		String toReturn = num+"";
		for (int i = toReturn.length()-3; i>0; i=i-3){
			String help = toReturn.substring(0,i);
			help=help+",";
			help=help+toReturn.substring(i,toReturn.length());
			toReturn=help;
		}
		return toReturn;
	}
}