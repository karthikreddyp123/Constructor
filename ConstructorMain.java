class PC{
    public static void main(String args[]) {
        Constructor constructor=new Constructor();
        Constructor constructor1=new Constructor("karthik");
        Constructor copyConstructor=new Constructor(constructor1);
        Default default1=new Default();
        default1.message();
    }
}