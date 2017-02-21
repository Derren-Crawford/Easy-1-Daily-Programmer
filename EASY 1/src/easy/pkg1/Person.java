package easy.pkg1;



public class Person {
    
    private String name;
    private int age;
    private String userName;
    
    public void setName(String nameIn)
    {
       name = nameIn; 
    }
    
    public void setAge(int ageIn)
    {
        age = ageIn;
    }
    
    public void setUserName(String userNameIn)
    {
        userName = userNameIn;
    }
    
    public String outputString()
    {
        String ret = "Hello " + name + " , I can see that your are " + age + 
                " years old and that your Reddit user name is " + userName + ".";
        
       
        
        
        return ret;
    }
    
}
