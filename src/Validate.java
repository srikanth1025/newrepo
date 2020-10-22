 
public class Validate {
 
	private String userName;
    private String password;
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String validateUserLogin() 
    {
        String navResult = "";
        System.out.println("Entered Username is= " + userName + ", password is= " + password);
        
        /* add db connectivity later */
        
        if (userName.equalsIgnoreCase("me") && password.equals("me")) 
        {
            navResult = "success";
        } 
        else 
        {
            navResult = "failure";
        }
        return navResult;
    }

}
