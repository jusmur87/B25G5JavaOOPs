package org.example.extraTasks.extra2;

public class ExtraTask12 {

    private  String email;
    private  String userName;
    private  String password;

    public void setEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email = email;
        }else {
            System.out.println("it must me a yahoo email");
        }
    }
    public void setUserName(String userName){
        if (userName.length() > 6){
            this.userName = userName;
        }else{
            System.out.println("Username must be longer than 6 Characters");
        }
    }
    public void setPassword(String password){
        if(password.length() > 6 && !password.contains(userName)){
            this.password = password;
        }else {
            System.out.println(" Password must be longer than 6 characters and cannot contain username");
        }
    }
    public void printInfo(){
        System.out.println(email);
        System.out.println(userName);
        System.out.println(password);
    }

}
