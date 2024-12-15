package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user); // Mauvais contrôle d'entrée : aucune validation
    }

    public String findUser(String user) {
        for (String u : users) {
            if (u.equals(user)) {
                return u;
            }
        }
        return null; // Code Smell: éviter les retours null
    }

    public String deleteUser(String user) {
        if (users.contains(user)) {
            users.remove(user);
            return "User deleted."; // Code Smell: Message en dur
        }
        return "User not found.";
    }
}
