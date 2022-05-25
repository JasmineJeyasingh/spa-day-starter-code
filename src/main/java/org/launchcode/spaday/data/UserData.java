package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    private List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
        return;
    }

    public List<User> getAll() {
        return this.users;
    }

    public User getById(int id) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                return users.get(i);
            }
        }
        return null;
    }
}
