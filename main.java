import java.io.*;

class main_func
{
    static int ms = 250;
    static int sec = 3000;
    static BufferedReader inputReader = new BufferedReader(
        new InputStreamReader(System.in));
    public static void clearScreen() {  
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    public static void load() throws IOException, InterruptedException
    {
        clearScreen();
        System.out.println("Please select one of the following options:");
        System.out.println("1 -> Sign in");
        System.out.println("2 -> Sign up");
        System.out.println();
        String input = inputReader.readLine();
        if (input.toString().contains("1"))
        {
            clearScreen();
            System.out.println("Username: ");
            String name = inputReader.readLine();
            System.out.println("Password: ");
            String pass = inputReader.readLine();
            eauth.signin(name, pass);
            clearScreen();
            System.out.println(eauth.LoggedMessage);
            System.out.println();
            System.out.println("Username: " + eauth.User_Info.Username);
            System.out.println("Rank: " + eauth.User_Info.Rank);
            System.out.println("Create Date: " + eauth.User_Info.CreateDate);
            System.out.println("Expire Date: " + eauth.User_Info.ExpireDate);
            System.out.println("Hardware ID: " + eauth.User_Info.HWID);
            //System.out.println("Variable: " + eauth.grabvariable("your variable id here"));
            java.lang.Thread.sleep(sec);
            load();
        }
        else if (input.toString().contains("2"))
        {
            clearScreen();
            System.out.println("Username: ");
            String name = inputReader.readLine();
            System.out.println("Password: ");
            String pass = inputReader.readLine();
            System.out.println("License Key: ");
            String license = inputReader.readLine();
            eauth.signup(name, pass, license);
            clearScreen();
            java.lang.Thread.sleep(sec);
            load();
        }
        else
        {
            load();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Loading |");
        java.lang.Thread.sleep(ms);
        clearScreen();
        System.out.println("Loading /");
        java.lang.Thread.sleep(ms);
        clearScreen();
        System.out.println("Loading -");
        java.lang.Thread.sleep(ms);
        clearScreen();
        System.out.println("Loading \\");
        java.lang.Thread.sleep(ms);
        clearScreen();
        System.out.println("Loading |");
        clearScreen();
        System.out.println("Loading |");
        clearScreen();
        eauth.init();
        load();
    }
}