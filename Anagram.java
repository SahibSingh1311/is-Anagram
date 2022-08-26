import java.util.*;

public class Anagram{
public static void main(String[] args){
	String s1 = "SILENT";
	String s2 = "listen";
	System.out.println(isAnagram(s1,s2));
}

static boolean isAnagram(String str1, String str2){
	if(str1.length()!=str2.length())
		return false;	

	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	
	HashMap<Character,Integer> map = new HashMap<>();
	for(int i = 0;i<str1.length();i++){
		if(map.containsKey(str1.charAt(i)))
			map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
		else
			map.put(str1.charAt(i),1);
	}
	for(int i =0; i<str2.length();i++){
		if(map.containsKey(str2.charAt(i))){
			map.put(str2.charAt(i),map.get(str2.charAt(i))-1);}
		else{
			return false;}
	}
	Set<Character> keys = map.keySet();
	for(Character key : keys){
		if(map.get(key) !=0)
			return false;	
	}
	return true;	
}
}