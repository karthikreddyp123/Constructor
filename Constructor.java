class Constructor{
    String username="admin";
    String password="admin";
    public Constructor(){
        //non-parameterized constructor
        //constructor chaining
        this("admin","admin");
    }
    public Constructor(String username){
        //parameterized constructor
        this(username,"admin");
    }
    public Constructor(Constructor constructor){
        //copy constructor
        this(constructor.username,"admin");
        username=constructor.username;
        System.out.println("This is copy constructor.");
    }
    private Constructor(String username,String password){
        //private constructor
        System.out.println("You have successfully logged into this system with "+username+" account.");
    }
}