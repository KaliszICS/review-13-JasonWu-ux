import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> list, int i1, int i2){
		String temp = list.get(i1);

		list.set(i1, list.get(i2));
		list.set(i2 ,temp);

	}

	public static ArrayList<Double> createArrayList(double[] doubleArray){
		ArrayList<Double> list = new ArrayList<Double>();

		for(double d : doubleArray){
			list.add(d);
		}
		return list;
	}
	public static HashMap<String, Integer> combineParallelArrays(String[] keys, int[] values){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < keys.length; i++){
			map.put(keys[i], values[i]);

	}
	return map;
	}
    public static void increaseAge(HashMap<String, Integer> map, String name) {
      
        if (map.containsKey(name)) {
             
            int currentAge = map.get(name);
                  
            int newAge = currentAge + 1;
                      
            map.put(name, newAge);
   	 }
	}
}
