package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
         String insert = "Insert into user (id ,username ,email ,password ,salt ,role ,created_at ,updated_at ) values (?,?,?,?,?,?,?,?)";
        String user = "admin";
        String pass="admin";
        String url="jdbc:mysql://localhost:3306/referalsystem1";
        Connection con = null;
        try{ 
        Class.forName("com.mysql.jdbc.cj.Driver");
        con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Successfull");
        }catch(ClassNotFoundException c){
            c.printStackTrace();
            System.out.println("Class path not found");
        }
    }
}

         
       
   
    

    }
}
