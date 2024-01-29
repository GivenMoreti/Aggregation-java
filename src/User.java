public class User {
    String username;
    int age;
    Address address;            //aggregating the Address class
    User(String username,int age,Address address){
        this.age = age;
        this.username = username;
        this.address = address;
    }

    void display(){

        System.out.printf("username : %s age :%s ",this.username,this.age);
        System.out.printf(" country :%s  code: %s street: %s ",address.country,address.code,address.street);

    }


}
