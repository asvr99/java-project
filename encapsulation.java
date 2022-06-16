package examples;
	class Account
	{
	    // For encapsulation all variables should be private
	    private String name="rama";
	    private int age;
	    private String country;
	    
	    public Account(String name, int age, String country) 
	    {
	        this.name = name;
	        this.age = age;
	        this.country = country;
	    }
	    
	    public String getName() {
	        return name; //identification of the getter method
	    }
	    public void setName(String name) {
	        this.name = name; //identification of the setter method
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }
}
	public class encapsulation
	{
	    public static void main(String args[])
	    {
	         Account obj = new Account("Ram", 27, "India");
	        
	         // Here we can update variable those have setter
	         
	         System.out.println("Name : "+ obj.getName());
	         System.out.println("Age : "+ obj.getAge());
	         System.out.println("Country : "+ obj.getCountry());
	        
	    } 
	}
