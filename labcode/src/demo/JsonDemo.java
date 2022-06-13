package demo;

import org.json.simple.JSONObject;



public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("name", "hoangviet1412");
		jo.put("password", "viet1234");
		System.out.println(jo);
		System.out.println("Name : "+ jo.get("name"));
		System.out.print("Password : " + jo.get("password"));
	}
}