package net.iq.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import com.sun.tracing.dtrace.ArgsAttributes;



@Entity
@Data
public class User {
    
    @Id
    private String userId;
    private String userName;
    private String address;

    public User(String userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }
}
