package Assignment;

public class Part_2 {
	

    public static void main(String[] args) 
    { //Object oriented programming 
        person p1 = new person();
        p1.create(20, "Motasem", "Motasem.Alfrehat@htu.edu.jo", 'M',"0775464500"); 
        
        
    }
}

//Object oriented programming 
class person { 
	
	int id; 
    String name; 
    String email; 
    char gender; 
    String mob ;
	private int A;
     
  
    public void create(int id, String name, String email, char gender, String string) 
    { 
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.gender = gender; 
        this.mob = string; 
        System.out.println("your account has been created"); 
        
    } 
    
    

    
    
    //Functional programming
    public void traverseArray(int arr []) {
		
    	for (int d = 0; d < arr.length; A++) {
    	 System.out.print(arr[d] + " ");
    			}
    		}
    
    
    //procedural programming
   	 
   private  void display(String text) {
    	 System.out.println(text);
    	 }
    		

    void printText(String text) {
	 System.out.println(text);
	 }

}
