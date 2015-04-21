package net.iq.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.sun.tracing.dtrace.ArgsAttributes;



@Entity
@Data
@NoArgsConstructor
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
