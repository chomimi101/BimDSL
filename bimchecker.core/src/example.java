
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;

public class example{
	public static void main(String[] args){
		new example().run();
	}
	
	protected void run(){
		ArrayList<JSONObject> list = new ArrayList<JSONObject>();
		
		try{
			//ir.json path cannot be decided yet
			BufferedReader br = new BufferedReader(new FileReader("ir.json"));
			String s = null;
			while((s = br.readLine()) != null){
				try{
					JSONObject rule = new JSONObject(s);
					list.add(rule);
					String name = rule.getString("rname");
					System.out.println("rule :"  +  name);
					JSONArray alias = rule.getJSONArray("alias");
					System.out.println("alias :" + alias.toString());
					JSONObject annotation = null;
					//annotation = rule.getJSONObject("annotation");
					if((annotation = rule.getJSONObject("annotation")).length() != 0){
						String anno_name = annotation.getString("aname");
						JSONArray anno_opt = null;
						System.out.println("annoation: " + anno_name);
						//anno_opt = annotation.getJSONArray("adetail");
						if((anno_opt = annotation.getJSONArray("adetail")).length() != 0){
							System.out.println("annotation opts:" + anno_opt.toString());
						}
					}
					//JSONObject annotation = rule.getJSONObject("annoation");
					
					
				}catch(JSONException e){
					e.printStackTrace();
				}
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}
}