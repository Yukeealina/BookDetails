package com.example.users;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepo;

//    private List<User> topics = new ArrayList<>(Arrays.asList(
//            new User(101, "Salina", "Salina@gmail.com", "salina123"),
//            new User(102, "Rami", "Rami@gmail.com", "rami123"),
//            new User(103, "Chandler ", "Chandler@gmail.com", "chandler123")
//    ));

    public List<User> getAllUser() {
//        return topics;
        List<User> user = new ArrayList<>();
        userrepo.findAll().forEach(user::add);
        return user;
    }

    public User getUser(int id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return userrepo.findById(id).orElse(null);

    }

    public void addUser(User user) {
//        topics.add(topic);
        userrepo.save(user);

    }

   public void updateUser(int id, User user) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
        userrepo.save(user);
    }


    public void deleteUser(int id) {
//        topics.removeIf(t -> t.getId().equals(id));
        userrepo.deleteById(id);

    }
}
