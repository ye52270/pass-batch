package com.fastcampus.pass.passbatch.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private String userId;

    private String userName;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    private String phone;
    private String meta;
}
