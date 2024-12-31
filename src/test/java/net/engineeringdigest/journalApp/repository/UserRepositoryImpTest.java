package net.engineeringdigest.journalApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryImpTest {

    @Autowired
    private UserRepositoryImp userRepositoryImp;


    public  void testSaveNewUsers(){
        userRepositoryImp.getUserForSA();
    }
}
