package org.accessok.modules.service.impl;

import org.accessok.modules.service.IUser;
import org.springframework.stereotype.Service;

@Service
public class User implements IUser {
    @Override
    public void getUserName(String name) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("name="+name);
    }
}
