package test.java.net.iq.service;

import java.util.List;

import net.iq.domain.User;
import net.iq.service.UserJpaProviderImple;
import net.iq.service.UserProvider;

import org.junit.Before;
import org.junit.Test;


public class 사용자_CRUD_테스트 {
    
    public UserProvider provider;
    
    @Before
    public void setup(){
        provider = new UserJpaProviderImple();
    }
    
    @Test
    public void insertAndFind(){
        
        User user = new User("demonpark","테스터","서울시금천구");
        provider.insertUser(user);
        
        List<User> users = provider.findAllUsers();
    }
    
}
