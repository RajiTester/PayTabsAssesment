package payTabsTask2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PayTabsTaskAPI {
	
	@Test(enabled = false)
	public void getlistofemplyee()
	{
		//https://reqres.in/
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"api/users");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	@Test(enabled = false)
	public void getSingleEmplyee()
	{
		//https://reqres.in/
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"api/users/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	
	@Test(enabled =false)
	public void updateExistinguser()
	{
		//https://reqres.in/
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification=RestAssured.given().header("Content-Type","application/Json").body("{\r\n"
				+ "	\"name\": \"Rajesh\",\r\n"
				+ "	\"job\": \"Testingupdate\"\r\n"
				+ "	\r\n"
				+ "}");;
		Response response=requestSpecification.request(Method.PUT,"api/users/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	
	@Test(enabled = false)
	public void createNewemplyee()
	{
		//https://reqres.in/
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification=RestAssured.given().header("Content-Type","application/Json").body("{\r\n"
				+ "	\"name\": \"Rajesh\",\r\n"
				+ "	\"job\": \"Testing\"\r\n"
				+ "	\r\n"
				+ "}");
		Response response=requestSpecification.request(Method.POST,"api/users");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	
	@Test(enabled = true)
	public void deleteUserlist()
	{
		//https://reqres.in/
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.DELETE,"api/users/7");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
}
