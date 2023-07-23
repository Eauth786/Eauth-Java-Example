import java.io.*;
import java.net.*;
import com.google.gson.*;
import java.math.*;
import java.security.*;

public class eauth 
{
	private static final String ApplicationKey = "";
	private static final String AccountKey = "";


	private static String MS() 
	{
        try
		{
         return getResult();
		}
        catch(Exception E)
		{
            System.exit(1);
            return null;
        }
	}
	private	static void clearScreen() {  
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
	private static String getResult()
	{
        try
		{
            InetAddress addr =InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(addr);
            byte[] mac = network.getHardwareAddress();
            StringBuilder alnatija = new StringBuilder();
            for(int i=0;i<mac.length;i++){
                alnatija.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
            }
            return alnatija.toString();
        }
        catch(Exception E){
            System.exit(1);
            return null;
        }
    }
	static String tashfir(String tajzia)
	{
		try 
		{
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			byte[] messageDigest = md.digest(tajzia.getBytes());
			BigInteger no = new BigInteger(1, messageDigest);
			String e_c = no.toString(16);
			while (e_c.length() < 32) {
				e_c = "0" + e_c;
			}
			return e_c;
		}
		catch (NoSuchAlgorithmException e) {
			return null;
		}
	}
	private static final String O111O1O1[] = {"https://eauth.us.to/api/", ApplicationKey, AccountKey};
    private static final String USER_AGENT = "Mozilla/5.0";
	static String givenValue;
	static String aithnayn(String tabadal)
	{
		tabadal = tabadal.replace("-QZ-", "0");
		tabadal = tabadal.replace("-SA-", "1");
		tabadal = tabadal.replace("-IF-", "2");
		tabadal = tabadal.replace("DE-", "3");
		tabadal = tabadal.replace("-EE-", "4");
		tabadal = tabadal.replace("-JJ-", "5");
		tabadal = tabadal.replace("-GG-", "6");
		tabadal = tabadal.replace("MP-", "7");
		tabadal = tabadal.replace("-WI-", "8");
		tabadal = tabadal.replace("-ZF-", "9");
		tabadal = tabadal.replace("-XC-", "a");
		tabadal = tabadal.replace("-YU-", "b");
		tabadal = tabadal.replace("-OL-", "c");
		tabadal = tabadal.replace("MV-", "d");
		tabadal = tabadal.replace("-RS-", "e");
		tabadal = tabadal.replace("-EV-", "f");
		tabadal = tabadal.replace("-WZ-", "g");
		tabadal = tabadal.replace("DP-", "h");
		tabadal = tabadal.replace("-IJ-", "i");
		tabadal = tabadal.replace("-KN-", "j");
		tabadal = tabadal.replace("-CA-", "k");
		tabadal = tabadal.replace("-TW-", "l");
		tabadal = tabadal.replace("-BI-", "m");
		tabadal = tabadal.replace("-JH-", "n");
		tabadal = tabadal.replace("-MW-", "o");
		tabadal = tabadal.replace("-IS-", "p");
		tabadal = tabadal.replace("-LA-", "q");
		tabadal = tabadal.replace("-ME-", "r");
		tabadal = tabadal.replace("-EP-", "s");
		tabadal = tabadal.replace("-ON-", "t");
		tabadal = tabadal.replace("-WK-", "u");
		tabadal = tabadal.replace("-NB-", "v");
		tabadal = tabadal.replace("-BA-", "w");
		tabadal = tabadal.replace("-RE-", "x");
		tabadal = tabadal.replace("-IN-", "y");
		tabadal = tabadal.replace("-LU-", "z");
		return tabadal;
	}
	static String wahid(String altashfir)
	{
		altashfir = altashfir.replace("0", "-QZ-");
		altashfir = altashfir.replace("1", "-SA-");
		altashfir = altashfir.replace("2", "-IF-");
		altashfir = altashfir.replace("3", "DE-");
		altashfir = altashfir.replace("4", "-EE-");
		altashfir = altashfir.replace("5", "-JJ-");
		altashfir = altashfir.replace("6", "-GG-");
		altashfir = altashfir.replace("7", "MP-");
		altashfir = altashfir.replace("8", "-WI-");
		altashfir = altashfir.replace("9", "-ZF-");
		altashfir = altashfir.replace("a", "-XC-");
		altashfir = altashfir.replace("b", "-YU-");
		altashfir = altashfir.replace("c", "-OL-");
		altashfir = altashfir.replace("d", "MV-");
		altashfir = altashfir.replace("e", "-RS-");
		altashfir = altashfir.replace("f", "-EV-");
		altashfir = altashfir.replace("g", "-WZ-");
		altashfir = altashfir.replace("h", "DP-");
		altashfir = altashfir.replace("i", "-IJ-");
		altashfir = altashfir.replace("j", "-KN-");
		altashfir = altashfir.replace("k", "-CA-");
		altashfir = altashfir.replace("l", "-TW-");
		altashfir = altashfir.replace("m", "-BI-");
		altashfir = altashfir.replace("n", "-JH-");
		altashfir = altashfir.replace("o", "-MW-");
		altashfir = altashfir.replace("p", "-IS-");
		altashfir = altashfir.replace("q", "-LA-");
		altashfir = altashfir.replace("r", "-ME-");
		altashfir = altashfir.replace("s", "-EP-");
		altashfir = altashfir.replace("t", "-ON-");
		altashfir = altashfir.replace("u", "-WK-");
		altashfir = altashfir.replace("v", "-NB-");
		altashfir = altashfir.replace("w", "-BA-");
		altashfir = altashfir.replace("x", "-RE-");
		altashfir = altashfir.replace("y", "-IN-");
		altashfir = altashfir.replace("z", "-LU-");
		return altashfir;
	}
	public static String ApplicationName = null;
	private static String AppStatus = null;
	public static String LoggedMessage = null;
	public static String RegisteredMessage = null;
	private static String DisabledMessage = null;
	static String initForm = "s0rt=" + wahid("init") + "&111110=" + wahid(O111O1O1[1]) + "&001011=" + wahid(O111O1O1[2]) + "&011001=" + wahid(MS().toString());
	public static void init() throws IOException, InterruptedException   
    {  
        URL obj = new URL(O111O1O1[0]);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		os.write(initForm.getBytes());
		os.flush();
		os.close();
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) 
        {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			givenValue =aithnayn(response.toString());
		} else {
            System.exit(0);
		}
		if (givenValue.toString().contains("incorrect"))
		{
			clearScreen();
			System.out.println("Incorrect application details!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("banned"))
		{
			System.exit(0);
		}
		else if (givenValue.toString().contains("down"))
		{
			clearScreen();
			System.out.println("Eauth is down at the moment, come back later!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else
		{
			givenValue = givenValue.replace("[", "");
			givenValue = givenValue.replace("]", "");
			JsonObject jsonObject = new JsonParser().parse(givenValue).getAsJsonObject();
			ApplicationName = jsonObject.get("APPNAME").getAsString();
			AppStatus = jsonObject.get("STATUS").getAsString();
			LoggedMessage = jsonObject.get("LOGGED").getAsString();
			RegisteredMessage = jsonObject.get("REGISTERED").getAsString();
			DisabledMessage = jsonObject.get("PAUSED").getAsString();
			if (AppStatus.toString().contains("0"))
			{
				clearScreen();
				System.out.println(DisabledMessage);
				java.lang.Thread.sleep(2500);
				System.exit(0);
			}
		}
	}
	static class User_Info
	{
		public static String Username = "";
		public static String Rank = "";
		public static String CreateDate = "";
		public static String ExpireDate = "";
		public static String HWID = MS();
	}
	public static void signin(String username, String password) throws IOException, InterruptedException   
    {  
		String loginForm = "s0rt=" + wahid("l0gin") + "&username=" + wahid(username) + "&passw0rd=" + wahid(tashfir(password)) + "&hwid=" + wahid(MS().toString()) + "&appkey=" + wahid(O111O1O1[1]) + "&acckey=" + wahid(O111O1O1[2]);
        URL obj = new URL(O111O1O1[0]);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		os.write(loginForm.getBytes());
		os.flush();
		os.close();
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) 
        {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			givenValue =aithnayn(response.toString());
		} else {
            System.exit(0);
		}
		if (givenValue.toString().contains("incorrect"))
		{
			clearScreen();
			System.out.println("Incorrect login details!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("hwid"))
		{
			clearScreen();
			System.out.println("Hwid doesn't match!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("subscription"))
		{
			clearScreen();
			System.out.println("Your subscription has expired!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else
		{
			givenValue = givenValue.replace("[", "");
			givenValue = givenValue.replace("]", "");
			JsonObject jsonObject = new JsonParser().parse(givenValue).getAsJsonObject();
			User_Info.Username = jsonObject.get("NAME").getAsString();
			User_Info.Rank = jsonObject.get("RANKUSER").getAsString();
			User_Info.CreateDate = jsonObject.get("CREATEDATE").getAsString();
			User_Info.ExpireDate = jsonObject.get("EXPIREDATE").getAsString();
		}
	}
	public static void signup(String username, String password, String invite) throws IOException, InterruptedException   
    {  
		String registerForm = "s0rt=" + wahid("register") + "&username=" + wahid(username) + "&passw0rd=" + wahid(tashfir(password)) + "&invite=" + wahid(invite) + "&hwid=" + wahid(MS().toString()) + "&appkey=" + wahid(O111O1O1[1]) + "&acckey=" + wahid(O111O1O1[2]);
        URL obj = new URL(O111O1O1[0]);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		os.write(registerForm.getBytes());
		os.flush();
		os.close();
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) 
        {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			givenValue =aithnayn(response.toString());
		} else {
            System.exit(0);
		}
		if (givenValue.toString().contains("incorrect"))
		{
			clearScreen();
			System.out.println("Incorrect register details!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("used"))
		{
			clearScreen();
			System.out.println("Name already used!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("key"))
		{
			clearScreen();
			System.out.println("Key not found!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
		else if (givenValue.toString().contains("maximum"))
		{
			clearScreen();
			System.out.println("The Application reached maximum users, it's time for an upgrade!");
			java.lang.Thread.sleep(2500);
			System.exit(1);
		}
	}
	public static String grabvariable(String varid) throws IOException, InterruptedException   
    {  
		String registerForm = "s0rt=" + wahid("var") + "&varid=" + wahid(varid) + "&appkey=" + wahid(O111O1O1[1]) + "&acckey=" + wahid(O111O1O1[2]);
        URL obj = new URL(O111O1O1[0]);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		os.write(registerForm.getBytes());
		os.flush();
		os.close();
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) 
        {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			givenValue =aithnayn(response.toString());
		} else {
            System.exit(0);
		}
		if (givenValue.toString().contains("var_not_found"))
		{
			givenValue = ">_<";
		}
		else if (givenValue.toString().contains("incorrect_application_details"))
		{
			System.exit(1);
		}
		return givenValue.toString();
	}
}
