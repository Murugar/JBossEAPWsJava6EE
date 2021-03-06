package com.iqmsoft.ws.domain;

import lombok.val;

import javax.inject.Singleton;
import java.util.UUID;

import static java.util.Collections.singletonList;

@Singleton
public class Factory {

  public static UserList getUsers() {

    val users = singletonList(
        new User().setId(UUID.randomUUID().toString())
                  .setFirstName("Test1")
                  .setLastName("Test2"));

    return new UserList().setUsers(users);
  }
}
