public class Admin extends User {
    boolean isAdmin;
    Admin(boolean isAdmin,String username,int age,Address address){
        super(username,age,address);
        this.isAdmin= isAdmin;
    }

    void getAdmin(){
        System.out.printf("Is admin: %s Username: %s Age: %s Address: %s",this.isAdmin ? "Yes":"No",this.username,this.age,this.address.street);
    }

}
